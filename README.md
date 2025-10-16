🧮 Custom Calculator (JavaFX)
A flexible, JavaFX-based calculator designed to enforce arithmetic constraints based on selected academic grade levels (Grade 4, 5, and 6).
🌟 Features
This calculator is unique because its division and subtraction rules change dynamically based on the selected grade level.

Standard Arithmetic: Supports Addition (+), Subtraction (-), Multiplication (x), and Division (/).

Grade Level Toggle: Uses Radio Buttons to switch between Grade 4, Grade 5, and Grade 6 modes.

Grade 4 Mode Rules:

Subtraction: Does not allow negative results (if num2 > num1, it returns an error).

Division: Only allows division that results in a whole number (no remainder); otherwise, it returns an error.

Grade 5 Mode Rules:

Division: Displays the quotient with the remainder appended (e.g., 5R2).

Grade 6 Mode Rules:

Division: Displays the full decimal result, formatted to four decimal places (e.g., 0.2500).

Clear Functionality: Resets both input and result fields.

🛠️ Built With
Language: Java

Framework: JavaFX (for UI components: GridPane, VBox, Button, TextField, RadioButton).

Logic: Uses a switch statement to apply grade-specific logic after the user presses the = button.

Author: Rudolph Stephen (Assumed from other files)

Course: CS1083 (Dr. McNally) (Assumed from other files)

Version Date: 1st February 2025 (Assumed from other files)

🚀 Getting Started
This project requires a Java Development Kit (JDK) with JavaFX support to compile and run.

Prerequisites
Java Development Kit (JDK): Version 11 or later is recommended.

JavaFX SDK: Ensure your environment or IDE (like VS Code, Eclipse, or IntelliJ) is configured for JavaFX development.

Usage:

Select the desired Grade mode using the radio buttons.

Enter the first number in the top field.

Click an operator button (+, -, x, /).

Enter the second number.

Click the = button to display the result in the bottom field, adhering to the selected grade's rules.

📜 License
This project is licensed under the Apache License 2.0 (based on previous repository context). You can find the full license text in the project's root LICENSE file.

🤝 Contact
Rudolph Stephen – (Rudolphstephen.official@gmail.com) 
