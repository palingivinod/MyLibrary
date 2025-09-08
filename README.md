# TermiX Documentation

TermiX is a lightweight Java library that provides styled console output utilities and table formatting for better terminal experiences.

## 📦 Installation (Maven)

Add the following dependency in your `pom.xml`:

```xml
<dependency>
    <groupId>com.vinnu</groupId>
    <artifactId>TermiX</artifactId>
    <version>1.0.0</version>
</dependency>
```

## 🖊 Msg Class

The `Msg` class helps you print styled, colored, and formatted messages easily.

### 🔹 Basic Print Methods

```java
Msg.print("Hello");              // Prints without newline
Msg.println("Hello World");      // Prints with newline
Msg.println();                    // Prints empty line
```

### 🎨 Colors

```java
Msg.printColor("Error in red", Msg.RED);
Msg.printColor("Success in green", Msg.GREEN);
Msg.printColor("Warning in yellow", Msg.YELLOW);
Msg.printColor("Info in cyan", Msg.CYAN);
```

### ✨ Styles

```java
Msg.printStyled("Bold Text", Msg.BOLD);
Msg.printStyled("Underlined Text", Msg.UNDERLINE);
Msg.printStyled("Reversed Text", Msg.REVERSED);
```

* **BOLD (`\u001B[1m`)** → Makes text bold.
* **UNDERLINE (`\u001B[4m`)** → Adds underline.
* **REVERSED (`\u001B[7m`)** → Swaps foreground & background colors (highlight effect).

### 🎭 Combined Styling

```java
Msg.printFancy("Success!", Msg.GREEN, Msg.BOLD);
Msg.printFancy("Error!", Msg.RED, Msg.BOLD);
Msg.printFancy("Warning!", Msg.YELLOW, Msg.BOLD);
Msg.printFancy("Info!", Msg.CYAN, Msg.BOLD);
```

### ✅ Shortcut Methods

```java
Msg.success("Operation completed successfully");
Msg.error("Something went wrong");
Msg.warning("Be careful with this step");
Msg.info("Execution started");
```

### 📊 Progress Bar

```java
for (int i = 1; i <= 100; i++) {
    Msg.progress(i, 100);
    Thread.sleep(50);
}
```

✅ Displays a progress bar like:

```
[██████████----------] 50%
```

---

## 📋 Table Class

The `Table` class helps print structured tabular data.

### Example

```java
String[] headers = {"ID", "Name", "Score"};
String[][] rows = {
    {"1", "Alice", "95"},
    {"2", "Bob", "87"},
    {"3", "Charlie", "92"}
};

Table.table(headers, rows);
```

### Output

```
+----+---------+-------+
| ID | Name    | Score |
+----+---------+-------+
| 1  | Alice   | 95    |
| 2  | Bob     | 87    |
| 3  | Charlie | 92    |
+----+---------+-------+
```

This project is open-source and free to use.
