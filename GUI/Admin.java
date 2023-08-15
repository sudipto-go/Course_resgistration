package GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

import Class.Courses;
import Components.CourseTable;

public class Admin extends JFrame implements ActionListener {
    ImageIcon icon = new ImageIcon("Media\\user.png");
    ImageIcon icon2 = new ImageIcon("Media\\exit.png");
    String[] ids = { "16", "21", "22", "23" };
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Admin");
    JButton menu2 = new JButton();
    JComboBox<String> Id = new JComboBox<String>(ids);;
    JLabel Year = new JLabel("Select Year:");
    JPanel panel = new JPanel();
    JButton Next = new JButton("Next");
    CourseTable courseTable;
    JTable table;
    private List<Courses> courses = new ArrayList<>();
    Data data = new Data();
    Color color = new Color(37, 171, 186);
    String id;

    public Admin() {
        this.setLayout(null);

        menu.setIcon(icon);
        menu2.setIcon(icon2);
        menu2.addActionListener(this);
        menu2.setBorderPainted(false);
        menu2.setBorder(null);
        menu2.setMargin(new Insets(0, 0, 0, 0));
        menu2.setContentAreaFilled(false);

        Year.setBounds(320, 150, 200, 30);
        Id.setBounds(400, 150, 300, 30);
        Next.setBounds(750, 150, 100, 30);
        Next.setBackground(color);
        Next.setFocusable(false);
        Next.addActionListener(this);
        menuBar.add(menu);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(menu2);
        menuBar.setBackground(color);

        this.setJMenuBar(menuBar);
        this.add(Id);
        this.add(Year);
        this.add(Next);

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
            id = Id.getSelectedItem().toString();
            this.dispose();
            new AdminIDselection(id);
        }
    }
}