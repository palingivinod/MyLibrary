package mylibrary;

public class Msg {

    // ANSI escape codes for colors and styles
    // This is used to format console output with colors and styles.
    public static final String RESET = "\u001B[0m";

    // Text colors
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Background colors
    public static final String BG_BLACK = "\u001B[40m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_PURPLE = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";

    // Styles
    public static final String BOLD = "\u001B[1m";
    public static final String UNDERLINE = "\u001B[4m";
    public static final String REVERSED = "\u001B[7m";

    public static void print(Object message) {
        System.out.print(message);
    }

    public static void println(Object message) {
        System.out.println(message);
    }
    
    public static void println(){
        System.out.println();
    }

    public static void printColor(Object message, String color) {
        System.out.println(color + message + RESET);
    }

    public static void printStyled(Object message, String style) {
        System.out.println(style + message + RESET);
    }

    public static void printFancy(Object message, String color, String style) {
        System.out.println(color + style + message + RESET);
    }

    public static void success(Object message) {
        printFancy(message, GREEN, BOLD);
    }

    public static void error(Object message) {
        printFancy(message, RED, BOLD);
    }

    public static void warning(Object message) {
        printFancy(message, YELLOW, BOLD);
    }

    public static void info(Object message) {
        printFancy(message, CYAN, BOLD);
    }

    public static void progress(int current, int total) {
    int percent = (int) ((current * 100.0) / total);
    int bars = percent / 5; // 20 bars total
    String bar = "[" + "█".repeat(bars) + "-".repeat(20 - bars) + "] " + percent + "%";
    System.out.print("\r" + bar); // \r overwrites same line
    if (current == total) {
        System.out.println(); // move to new line when done
    }
}

    
    
   
}
