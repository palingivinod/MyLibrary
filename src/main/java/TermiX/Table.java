package TermiX;

public class Table {
    public static void table(String[] headers, String[][] rows) {
        int columns = headers.length;
        int[] columnWidths = new int[columns];

        // 1. Find max width of each column
        for (int i = 0; i < columns; i++) {
            columnWidths[i] = headers[i].length();
        }
        for (String[] row : rows) {
            for (int i = 0; i < columns; i++) {
                if (row[i].length() > columnWidths[i]) {
                    columnWidths[i] = row[i].length();
                }
            }
        }

        // 2. Function to build separator
        String buildSeparator = "+" + repeat("-", columnWidths[0] + 2);
        for (int i = 1; i < columns; i++) {
            buildSeparator += "+" + repeat("-", columnWidths[i] + 2);
        }
        buildSeparator += "+";

        // 3. Print table
        System.out.println(buildSeparator);

        // Print headers
        System.out.print("|");
        for (int i = 0; i < columns; i++) {
            System.out.printf(" %-" + columnWidths[i] + "s |", headers[i]);
        }
        System.out.println();
        System.out.println(buildSeparator);

        // Print rows
        for (String[] row : rows) {
            System.out.print("|");
            for (int i = 0; i < columns; i++) {
                System.out.printf(" %-" + columnWidths[i] + "s |", row[i]);
            }
            System.out.println();
        }

        System.out.println(buildSeparator);
    }

    // helper function for Java 8 (instead of String.repeat)
    private static String repeat(String s, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
