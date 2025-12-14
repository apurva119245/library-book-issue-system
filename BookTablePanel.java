package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class BookTablePanel extends JPanel {

    public BookTablePanel() {
        setLayout(new BorderLayout());

        String[] columns = {
            "Book ID", "Book Name", "Author", "Status"
        };

        Object[][] data = {
            {"BK101", "Introduction to Algorithms", "Cormen", "Available"},
            {"BK102", "Clean Code", "Robert Martin", "Issued"},
            {"BK103", "Java Complete Reference", "Schildt", "Available"}
        };

        JTable table = new JTable(new DefaultTableModel(data, columns));
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}
