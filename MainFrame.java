package ui;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Library Management System");
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Issue Book", new IssueBookPanel());
        tabs.add("Return Book", new ReturnBookPanel());
        tabs.add("Books", new BookTablePanel());

        add(tabs);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
