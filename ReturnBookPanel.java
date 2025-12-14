package ui;

import javax.swing.*;
import java.awt.*;

public class ReturnBookPanel extends JPanel {

    public ReturnBookPanel() {
        setLayout(new GridLayout(3, 2, 15, 15));

        add(new JLabel("Book ID:"));
        add(new JTextField());

        add(new JLabel("Return Date:"));
        add(new JLabel("Auto Generated"));

        add(new JButton("Return Book"));
        add(new JButton("Clear"));
    }
}
