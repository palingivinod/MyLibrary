package TermiX;

import java.util.List;

public class Table {

    public static void print(String[] headers, List<String[]> rows) {
        int[] columnWidths = new int[headers.length];

       //calculating maximum length for each column
        for (int i = 0; i < headers.length; i++) {
            columnWidths[i] = headers[i].length();
        }
        for (String[] row : rows) {
            for (int i = 0; i < row.length; i++) {
                columnWidths[i] = Math.max(columnWidths[i], row[i].length());
            }
        }

        // Print headers
        for (int i = 0; i < headers.length; i++) {
            System.out.printf("%-" + (columnWidths[i] + 2) + "s", headers[i]);
        }
        System.out.println();

        // Print separator
        for (int width : columnWidths) {
            System.out.print("-".repeat(width + 2));
        }
        System.out.println();

        // Print rows
        for (String[] row : rows) {
            for (int i = 0; i < row.length; i++) {
                System.out.printf("%-" + (columnWidths[i] + 2) + "s", row[i]);
            }
            System.out.println();
        }
    }
}
