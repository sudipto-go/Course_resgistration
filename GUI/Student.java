package GUI;

import java.awt.event.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

import Class.Courses;
import Class.StudentClass;
import Components.CourseTable;

public class Student extends JFrame implements ActionListener, MouseListener {
    JTabbedPane tp1 = new JTabbedPane();
    ImageIcon icon = new ImageIcon("Media\\student.png");
    ImageIcon icon2 = new ImageIcon("Media\\exit.png");
    ImageIcon icon3 = new ImageIcon("Media\\student.png");
    ImageIcon icon4 = new ImageIcon("Media\\exit.png");
    JLabel iJLabel = new JLabel(icon);
    JLabel nameLabel = new JLabel("Student Name");
    JLabel iJLabel1 = new JLabel(icon);
    JLabel nameLabel1 = new JLabel("Student Name");
    JLabel IdLabel = new JLabel("23-xxxxxx-2");
    JLabel CreditLabel = new JLabel();
    JLabel CreditLabel1 = new JLabel("Total Credit: ");
    JLabel LogoutLabel = new JLabel(icon2);
    JLabel IdLabel1 = new JLabel("23-xxxxxx-2");
    JLabel CreditLabel2 = new JLabel();
    JLabel CreditLabel3 = new JLabel("Completed Credit: ");
    JLabel AmmountLabel = new JLabel();
    JLabel AmmountLabel2 = new JLabel("Semester Payment: ");
    JLabel AmmountLabel3 = new JLabel();
    JLabel AmmountLabel4 = new JLabel("Total Paid: ");
    JLabel LogoutLabel1 = new JLabel(icon2);
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel currcourse = new JPanel();
    JPanel completedcourse = new JPanel();
    CourseTable courseTable;
    JTable table;
    CourseTable courseTable1;
    JTable table1;
    JScrollPane scrollPane;
    JScrollPane scrollPane1;
    List<Courses> courses = new ArrayList<>();
    List<Courses> courses1 = new ArrayList<>();
    List<Courses> cList = new ArrayList<>();
    Integer credit = 0;
    Integer credit1 = 0;
    Double ammount = 0.0;
    Double ammount2 = 0.0;
    Color color = new Color(37, 171, 186);
    Data data = new Data();
    Data data1 = new Data();
    String credits;
    StudentClass studentClass;
    Courses[] course = new Courses[10];

    public Student(StudentClass studentClass) {

        this.studentClass = studentClass;
        course = studentClass.gCourses();
        getdata();
        currentsem();

        tp1.setSize(1200, 800);
        tp1.add("Current Semester", currcourse);
        this.setLayout(null);
        this.setSize(1200, 800);
        this.setBackground(color);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(tp1);

    }

    public int saveTable() {
        Integer t = 0;
        for (int i = 0; i < table.getRowCount(); i++) {

            t = t + Integer.parseInt(table.getValueAt(i, 3) + "");
        }
        return t;
    }

    public Double saveTable2() {
        Double t = 0.0;
        for (int i = 0; i < table.getRowCount(); i++) {

            t = t + Double.parseDouble(table.getValueAt(i, 4) + "");
        }
        return t;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == LogoutLabel) {
            this.dispose();
            new Login();
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    public void currentsem() {
        currcourse.setSize(1200, 800);
        currcourse.setLayout(null);
        completedcourse.setSize(1200, 800);
        completedcourse.setLayout(null);

        nameLabel.setBounds(50, 100, 200, 100);
        nameLabel.setText(studentClass.getName());
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        panel.add(nameLabel);

        iJLabel.setBounds(50, 20, 100, 100);
        panel.add(iJLabel);

        IdLabel.setBounds(50, 150, 200, 100);
        IdLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        IdLabel.setText(studentClass.getSid());
        panel.add(IdLabel);

        LogoutLabel.setBounds(10, 600, 100, 100);
        LogoutLabel.addMouseListener(this);
        panel.add(LogoutLabel);
        courseTable = new CourseTable();
        courseTable.setData(courses);
        table = new JTable(courseTable);
        table.setOpaque(false);
        table.getTableHeader().setBackground(color);
        table.getTableHeader().setForeground(Color.BLACK);
        table.setGridColor(Color.black);
        table.setRowHeight(50);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(410, 00, 750, 574);

        credit = saveTable();
        credits = credit.toString();
        CreditLabel.setText(credits);
        CreditLabel.setBounds(160, 200, 100, 100);
        CreditLabel1.setBounds(50, 200, 150, 100);
        CreditLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        CreditLabel1.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(CreditLabel);
        panel.add(CreditLabel1);

        ammount = saveTable2();
        credits = ammount.toString();
        AmmountLabel.setText(credits);
        AmmountLabel.setBounds(210, 250, 200, 100);
        AmmountLabel2.setBounds(50, 250, 200, 100);
        AmmountLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        AmmountLabel2.setFont(new Font("Arial", Font.PLAIN, 18));
        panel.add(AmmountLabel);
        panel.add(AmmountLabel2);

        panel.setBounds(0, 0, 400, 800);
        panel.setBackground(color);
        panel.setLayout(null);
        currcourse.add(panel);
        currcourse.add(scrollPane);

    }

    public void setcourses() {
        for (int i = 0; i < course.length; i++) {
            if (course[i] != null) {
                System.out.println(course[i].getCName());
                courses.add(course[i]);
            }

        }
    }

    public void getdata() {
        try {
            FileInputStream fis = new FileInputStream("Model\\cobj.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            cList = (ArrayList) ois.readObject();
            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {

            c.printStackTrace();
        }
        for (Courses cours : cList) {
            if (cours.getSID().equals(studentClass.getSid())) {
                courses.add(cours);
            }

        }

    }

}
