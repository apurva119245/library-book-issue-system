package ui;

import javax.swing.*;
import java.awt.*;

public class IssueBookPanel extends JPanel {

    public IssueBookPanel() {
        setLayout(new GridLayout(6, 2, 15, 15));

        add(new JLabel("Student ID:"));
        add(new JTextField());

        add(new JLabel("Book ID:"));
        add(new JTextField());

        add(new JLabel("Student Name:"));
        JTextField name = new JTextField();
        name.setEnabled(false);
        add(name);

        add(new JLabel("Issue Date:"));
        add(new JLabel("Auto Generated"));

        add(new JLabel("Due Date:"));
        add(new JLabel("Auto Generated"));

        add(new JButton("Issue Book"));
        add(new JButton("Clear"));
    }
}
