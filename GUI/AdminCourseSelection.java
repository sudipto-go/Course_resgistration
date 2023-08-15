package GUI;

import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;

import Class.Courses;
import Class.StudentClass;

public class AdminCourseSelection extends JFrame implements ActionListener {
    JLabel sJLabel = new JLabel();
    ImageIcon icon = new ImageIcon("Media\\user.png");
    ImageIcon icon2 = new ImageIcon("Media\\exit.png");
    String[] days = { "Sunday-Tuesday", "Monday-Wednesday" };
    String[] time = { "8:00-10:00", "10:00-12:00", "12:00-2:00", "2:00-4:00" };
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Admin");
    JButton menu2 = new JButton();
    JComboBox<String> C0;
    JComboBox<String> C1;
    JComboBox<String> C2;
    JComboBox<String> C3;
    JComboBox<String> C4;
    JComboBox<String> C5;
    JComboBox<String> C6;
    JComboBox<String> C7;
    JComboBox<String> day1 = new JComboBox<String>(days);
    JComboBox<String> day2 = new JComboBox<String>(days);
    JComboBox<String> day3 = new JComboBox<String>(days);
    JComboBox<String> day4 = new JComboBox<String>(days);
    JComboBox<String> day5 = new JComboBox<String>(days);
    JComboBox<String> day6 = new JComboBox<String>(days);
    JComboBox<String> day7 = new JComboBox<String>(days);
    JComboBox<String> day8 = new JComboBox<String>(days);
    JComboBox<String> time1 = new JComboBox<String>(time);
    JComboBox<String> time2 = new JComboBox<String>(time);
    JComboBox<String> time3 = new JComboBox<String>(time);
    JComboBox<String> time4 = new JComboBox<String>(time);
    JComboBox<String> time5 = new JComboBox<String>(time);
    JComboBox<String> time6 = new JComboBox<String>(time);
    JComboBox<String> time7 = new JComboBox<String>(time);
    JComboBox<String> time8 = new JComboBox<String>(time);
    JLabel Course1 = new JLabel("Select Course 1:");
    JLabel Course2 = new JLabel("Select Course 2:");
    JLabel Course3 = new JLabel("Select Course 3:");
    JLabel Course4 = new JLabel("Select Course 4:");
    JLabel Course5 = new JLabel("Select Course 5:");
    JLabel Course6 = new JLabel("Select Course 6:");
    JLabel Course7 = new JLabel("Select Course 7:");
    JLabel Course8 = new JLabel("Select Course 8:");
    JPanel panel = new JPanel();
    JButton Next = new JButton("Next");
    JButton Addc1 = new JButton("Add");
    JButton Addc2 = new JButton("Add");
    JButton Addc3 = new JButton("Add");
    JButton Addc4 = new JButton("Add");
    JButton Addc5 = new JButton("Add");
    JButton Addc6 = new JButton("Add");
    JButton Addc7 = new JButton("Add");
    JButton Addc8 = new JButton("Add");
    JButton Back = new JButton("Back");
    Courses[] c = new Courses[8];
    Courses temp = new Courses();
    private List<Courses> courses = new ArrayList<>();
    private List<Courses> courses1 = new ArrayList<>();
    Data data = new Data();
    Color color = new Color(37, 171, 186);
    String coursename[] = new String[42];
    StudentClass student;
    private List<StudentClass> students = new ArrayList<>();

    public AdminCourseSelection(StudentClass student) {
        this.setLayout(null);
        this.student = student;
        courses = data.geList();
        getdata();
        getcoursename(courses);
        Arrays.sort(coursename);
        C0 = new JComboBox<String>(coursename);
        C1 = new JComboBox<String>(coursename);
        C2 = new JComboBox<String>(coursename);
        C3 = new JComboBox<String>(coursename);
        C4 = new JComboBox<String>(coursename);
        C5 = new JComboBox<String>(coursename);
        C6 = new JComboBox<String>(coursename);
        C7 = new JComboBox<String>(coursename);

        menu.setIcon(icon);
        menu2.setIcon(icon2);
        menu2.addActionListener(this);
        menu2.setBorderPainted(false);
        menu2.setBorder(null);
        menu2.setMargin(new Insets(0, 0, 0, 0));
        menu2.setContentAreaFilled(false);
        sJLabel.setText(student.getName());
        sJLabel.setBounds(100, 00, 100, 30);

        Course1.setBounds(100, 150, 200, 30);
        Course2.setBounds(100, 200, 200, 30);
        Course3.setBounds(100, 250, 200, 30);
        Course4.setBounds(100, 300, 200, 30);
        Course5.setBounds(100, 350, 200, 30);
        Course6.setBounds(100, 400, 200, 30);
        Course7.setBounds(100, 450, 200, 30);
        Course8.setBounds(100, 500, 200, 30);
        C0.setBounds(200, 150, 380, 30);
        C1.setBounds(200, 200, 380, 30);
        C2.setBounds(200, 250, 380, 30);
        C3.setBounds(200, 300, 380, 30);
        C4.setBounds(200, 350, 380, 30);
        C5.setBounds(200, 400, 380, 30);
        C6.setBounds(200, 450, 380, 30);
        C7.setBounds(200, 500, 380, 30);
        day1.setBounds(600, 150, 150, 30);
        day2.setBounds(600, 200, 150, 30);
        day3.setBounds(600, 250, 150, 30);
        day4.setBounds(600, 300, 150, 30);
        day5.setBounds(600, 350, 150, 30);
        day6.setBounds(600, 400, 150, 30);
        day7.setBounds(600, 450, 150, 30);
        day8.setBounds(600, 500, 150, 30);
        time1.setBounds(770, 150, 100, 30);
        time2.setBounds(770, 200, 100, 30);
        time3.setBounds(770, 250, 100, 30);
        time4.setBounds(770, 300, 100, 30);
        time5.setBounds(770, 350, 100, 30);
        time6.setBounds(770, 400, 100, 30);
        time7.setBounds(770, 450, 100, 30);
        time8.setBounds(770, 500, 100, 30);

        Addc1.setBounds(900, 150, 100, 30);
        Addc1.setBackground(color);
        Addc1.setFocusable(false);
        Addc1.addActionListener(this);
        Addc2.setBounds(900, 200, 100, 30);
        Addc2.setBackground(color);
        Addc2.setFocusable(false);
        Addc2.addActionListener(this);
        Addc3.setBounds(900, 250, 100, 30);
        Addc3.setBackground(color);
        Addc3.setFocusable(false);
        Addc3.addActionListener(this);
        Addc4.setBounds(900, 300, 100, 30);
        Addc4.setBackground(color);
        Addc4.setFocusable(false);
        Addc4.addActionListener(this);
        Addc5.setBounds(900, 350, 100, 30);
        Addc5.setBackground(color);
        Addc5.setFocusable(false);
        Addc5.addActionListener(this);
        Addc6.setBounds(900, 400, 100, 30);
        Addc6.setBackground(color);
        Addc6.setFocusable(false);
        Addc6.addActionListener(this);
        Addc7.setBounds(900, 450, 100, 30);
        Addc7.setBackground(color);
        Addc7.setFocusable(false);
        Addc7.addActionListener(this);
        Addc8.setBounds(900, 500, 100, 30);
        Addc8.setBackground(color);
        Addc8.setFocusable(false);
        Addc8.addActionListener(this);

        Next.setBounds(550, 600, 100, 30);
        Next.setBackground(color);
        Next.setFocusable(false);
        Next.addActionListener(this);
        Back.setBounds(400, 600, 100, 30);
        Back.setBackground(color);
        Back.setFocusable(false);
        Back.addActionListener(this);
        menuBar.add(menu);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(menu2);
        menuBar.setBackground(color);

        this.setJMenuBar(menuBar);
        this.add(C0);
        this.add(C1);
        this.add(C2);
        this.add(C3);
        this.add(C4);
        this.add(C5);
        this.add(C6);
        this.add(C7);
        this.add(Course1);
        this.add(Course2);
        this.add(Course3);
        this.add(Course4);
        this.add(Course5);
        this.add(Course6);
        this.add(Course7);
        this.add(Course8);
        this.add(Addc1);
        this.add(Addc2);
        this.add(Addc3);
        this.add(Addc4);
        this.add(Addc5);
        this.add(Addc6);
        this.add(Addc7);
        this.add(Addc8);
        this.add(day1);
        this.add(day2);
        this.add(day3);
        this.add(day4);
        this.add(day5);
        this.add(day6);
        this.add(day7);
        this.add(day8);
        this.add(time1);
        this.add(time2);
        this.add(time3);
        this.add(time4);
        this.add(time5);
        this.add(time6);
        this.add(time7);
        this.add(time8);
        this.add(sJLabel);

        this.add(Next);
        this.add(Back);

        this.setSize(1200, 800);
        this.setBackground(Color.white);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu2) {
            this.dispose();
            new Login();

        } else if (e.getSource() == Next) {
            for (int i = 0; i < c.length; i++) {
                if (c[i] != null) {
                    c[i].show();
                    courses1.add(c[i]);
                    student.addCourse(c[i]);

                }

            }

            this.dispose();
            new AdminFinalCourses(student);
        } else if (e.getSource() == Back) {
            this.dispose();
            new Admin();
        } else if (e.getSource() == Addc1) {
            String cname = C0.getSelectedItem().toString();
            String day = day1.getSelectedItem().toString();
            String time = time1.getSelectedItem().toString();
            System.out.println(cname);
            System.out.println(day);
            System.out.println(time);

            boolean empty = true;
            for (int i = 0; i < c.length; i++) {
                if (c[i] != null) {
                    empty = false;
                    break;
                }
            }

            for (int i = 0; i < c.length; i++) {
                if (empty) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                } else if (c[i] != null && c[i].getCName().equals(cname)) {
                    JOptionPane.showMessageDialog(this, "Same Course Already Take.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] != null && c[i].getDate().equals(day) && c[i].getTime().equals(time)) {
                    JOptionPane.showMessageDialog(this, "Time Clash.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] == null) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                }

            }

        } else if (e.getSource() == Addc2) {
            String cname = C1.getSelectedItem().toString();
            String day = day2.getSelectedItem().toString();
            String time = time2.getSelectedItem().toString();

            System.out.println(cname);
            System.out.println(day);
            System.out.println(time);
            boolean empty = true;
            for (int i = 0; i < c.length; i++) {
                if (c[i] != null) {
                    empty = false;
                    break;
                }
            }

            for (int i = 0; i < c.length; i++) {
                if (empty) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                } else if (c[i] != null && c[i].getCName().equals(cname)) {
                    JOptionPane.showMessageDialog(this, "Same Course Already Take.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] != null && c[i].getDate().equals(day) && c[i].getTime().equals(time)) {
                    JOptionPane.showMessageDialog(this, "Time Clash.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] == null) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                }

            }
        } else if (e.getSource() == Addc3) {
            String cname = C2.getSelectedItem().toString();
            String day = day3.getSelectedItem().toString();
            String time = time3.getSelectedItem().toString();
            System.out.println(cname);
            System.out.println(day);
            System.out.println(time);
            boolean empty = true;
            for (int i = 0; i < c.length; i++) {
                if (c[i] != null) {
                    empty = false;
                    break;
                }
            }

            for (int i = 0; i < c.length; i++) {
                if (empty) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                } else if (c[i] != null && c[i].getCName().equals(cname)) {
                    JOptionPane.showMessageDialog(this, "Same Course Already Take.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] != null && c[i].getDate().equals(day) && c[i].getTime().equals(time)) {
                    JOptionPane.showMessageDialog(this, "Time Clash.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] == null) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                }

            }
        } else if (e.getSource() == Addc4) {
            String cname = C3.getSelectedItem().toString();
            String day = day4.getSelectedItem().toString();
            String time = time4.getSelectedItem().toString();
            System.out.println(cname);
            System.out.println(day);
            System.out.println(time);
            boolean empty = true;
            for (int i = 0; i < c.length; i++) {
                if (c[i] != null) {
                    empty = false;
                    break;
                }
            }

            for (int i = 0; i < c.length; i++) {
                if (empty) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                } else if (c[i] != null && c[i].getCName().equals(cname)) {
                    JOptionPane.showMessageDialog(this, "Same Course Already Take.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] != null && c[i].getDate().equals(day) && c[i].getTime().equals(time)) {
                    JOptionPane.showMessageDialog(this, "Time Clash.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] == null) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                }

            }
        } else if (e.getSource() == Addc5) {
            String cname = C4.getSelectedItem().toString();
            String day = day5.getSelectedItem().toString();
            String time = time5.getSelectedItem().toString();
            System.out.println(cname);
            System.out.println(day);
            System.out.println(time);
            boolean empty = true;
            for (int i = 0; i < c.length; i++) {
                if (c[i] != null) {
                    empty = false;
                    break;
                }
            }

            for (int i = 0; i < c.length; i++) {
                if (empty) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                } else if (c[i] != null && c[i].getCName().equals(cname)) {
                    JOptionPane.showMessageDialog(this, "Same Course Already Take.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] != null && c[i].getDate().equals(day) && c[i].getTime().equals(time)) {
                    System.out.println("Time Clash");
                    break;
                } else if (c[i] == null) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                }

            }
        } else if (e.getSource() == Addc6) {
            String cname = C5.getSelectedItem().toString();
            String day = day6.getSelectedItem().toString();
            String time = time6.getSelectedItem().toString();
            System.out.println(cname);
            System.out.println(day);
            System.out.println(time);
            boolean empty = true;
            for (int i = 0; i < c.length; i++) {
                if (c[i] != null) {
                    empty = false;
                    break;
                }
            }

            for (int i = 0; i < c.length; i++) {
                if (empty) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                } else if (c[i] != null && c[i].getCName().equals(cname)) {
                    JOptionPane.showMessageDialog(this, "Same Course Already Take.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] != null && c[i].getDate().equals(day) && c[i].getTime().equals(time)) {
                    JOptionPane.showMessageDialog(this, "Time Clash.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] == null) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                }

            }
        } else if (e.getSource() == Addc7) {
            String cname = C6.getSelectedItem().toString();
            String day = day7.getSelectedItem().toString();
            String time = time7.getSelectedItem().toString();
            System.out.println(cname);
            System.out.println(day);
            System.out.println(time);
            boolean empty = true;
            for (int i = 0; i < c.length; i++) {
                if (c[i] != null) {
                    empty = false;
                    break;
                }
            }

            for (int i = 0; i < c.length; i++) {
                if (empty) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                } else if (c[i] != null && c[i].getCName().equals(cname)) {
                    JOptionPane.showMessageDialog(this, "Same Course Already Take.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] != null && c[i].getDate().equals(day) && c[i].getTime().equals(time)) {
                    JOptionPane.showMessageDialog(this, "Time Clash.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] == null) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                }

            }
        } else if (e.getSource() == Addc8) {
            String cname = C7.getSelectedItem().toString();
            String day = day8.getSelectedItem().toString();
            String time = time8.getSelectedItem().toString();
            System.out.println(cname);
            System.out.println(day);
            System.out.println(time);
            boolean empty = true;
            for (int i = 0; i < c.length; i++) {
                if (c[i] != null) {
                    empty = false;
                    break;
                }
            }

            for (int i = 0; i < c.length; i++) {

                if (empty) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                } else if (c[i] != null && c[i].getCName().equals(cname)) {
                    JOptionPane.showMessageDialog(this, "Same Course Already Take.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] != null && c[i].getDate().equals(day) && c[i].getTime().equals(time)) {
                    JOptionPane.showMessageDialog(this, "Time Clash.", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                    break;
                } else if (c[i] == null) {
                    c[i] = new Courses(cname, day, time, student.getSid());
                    JOptionPane.showMessageDialog(this, "Added.");
                    break;
                }

            }

        }

    }

    public void getcoursename(List<Courses> courses) {
        int j = 0;
        for (Courses i : courses) {
            coursename[j] = i.getCName();
            j++;

        }

    }

    public void getdata() {
        try {
            FileInputStream fis = new FileInputStream("Model\\sobj.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (ArrayList) ois.readObject();
            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {

            c.printStackTrace();
        }

    }

    public void setdata2() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(student.getName());
            System.out.println(students.get(i).getName());
            if (students.get(i).getSid() == student.getSid()) {
                students.get(i).sCourses(student.gCourses());

            }

        }
    }
}
