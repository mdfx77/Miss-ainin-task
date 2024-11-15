import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField display; // Display field for showing calculations
    private JButton[] numberButtons; // Array of number buttons
    private JButton addButton, subButton, mulButton, divButton, eqButton, clrButton; // Operation buttons
    private double tempNum1 = 0; // First operand
    private double tempNum2 = 0; // Second operand
    private String operator = ""; // Current operator

    public Calculator() {
        // Set up the frame
        this.setTitle("MDF CALCULATOR");
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // Set background color of the frame to white
        this.getContentPane().setBackground(Color.WHITE);

        // Set icon image for the frame
        ImageIcon icon = new ImageIcon("GAYBAS.png"); // Update with your icon path
        this.setIconImage(icon.getImage());

        // Create display field
        display = new JTextField();
        display.setEditable(false);
        display.setBackground(Color.pink); // Set background color of display to light pink
        display.setForeground(Color.BLACK); // Set text color of display to black
        Font font = new Font("Arial", Font.BOLD, 40); // Set font size to 40
        display.setFont(font); // Apply the font to the display field
        this.add(display, BorderLayout.NORTH);

        // Create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 6));
        buttonPanel.setBackground(Color.pink); // Set background color of button panel to pink

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setBackground(Color.BLACK); // Button background color
            numberButtons[i].setForeground(Color.WHITE); // Button text color
            Font font2 = new Font("Arial", Font.BOLD, 28); // Set font size to 28
            numberButtons[i].setFont(font2); // Apply the font to the button
            buttonPanel.add(numberButtons[i]);
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("×"); // Multiplication symbol
        divButton = new JButton("÷"); // Division symbol
        eqButton = new JButton("=");
        clrButton = new JButton("Clear");

        // Add action listeners to operation buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);
        eqButton.addActionListener(this);
        clrButton.addActionListener(this);

        // Set button colors for operation buttons and add them to the panel
        JButton[] operationButtons = {addButton, subButton, mulButton, divButton, eqButton, clrButton};
        for (JButton button : operationButtons) {
            button.setBackground(Color.BLACK); // Button background color for operations
            button.setForeground(Color.WHITE); // Button text color for operations
            Font font3 = new Font("Arial", Font.BOLD, 25); // Set font size to 25
            button.setFont(font3); // Apply the font to the button
            buttonPanel.add(button);
        }

        this.add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand(); // Get the command from the button clicked

        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            if (!operator.isEmpty()) {
                display.setText("");  // Clear display if an operator was previously entered.
                operator = "";       // Reset operator after using it.
            }
            display.setText(display.getText() + command); 
            
        } else if (command.equals("Clear")) {
            display.setText(""); 
            tempNum1 = 0; 
            tempNum2 = 0; 
            operator = ""; 
            
        } else if (command.equals("=")) {
            tempNum2 = Double.parseDouble(display.getText().replace("×", "*").replace("÷", "/"));
            
            switch (operator) {
                case "+":
                    display.setText(String.valueOf(tempNum1 + tempNum2));
                    break;
                case "-":
                    display.setText(String.valueOf(tempNum1 - tempNum2));
                    break;
                case "*":
                    display.setText(String.valueOf(tempNum1 * tempNum2));
                    break;
                case "/":
                    if (tempNum2 != 0) {
                        display.setText(String.valueOf(tempNum1 / tempNum2));
                    } else {
                        display.setText("Error");
                    }
                    break;
                default:
                    break;
            }
            operator = ""; 
            tempNum1 = 0; 
            tempNum2 = 0; 
            
        } else { 
            if (!operator.isEmpty()) return; 

            if (command.equals("×")) {
                operator = "*"; 
                tempNum1 = Double.parseDouble(display.getText()); 
                display.setText(display.getText() + " " + command + " "); 

            } else if (command.equals("÷")) {
                operator = "/"; 
                tempNum1 = Double.parseDouble(display.getText()); 
                display.setText(display.getText() + " " + command + " "); 

            } else {
                operator = command; 
                tempNum1 = Double.parseDouble(display.getText()); 
                display.setText(display.getText() + " " + command + " "); 
                
                try {
                    tempNum1 = Double.parseDouble(display.getText().replaceAll("[^\\d.]", "").trim()); 
                    display.setText(""); 
                } catch (NumberFormatException ex) {
                    display.setText("Error"); 
                    operator = ""; 
                    tempNum1 = 0; 
                    tempNum2 = 0; 
                }
            }
            
            try {
                if (!display.getText().isEmpty()) {
                    double currentInputValue = Double.parseDouble(display.getText());
                    if (operator.isEmpty()) {
                        tempNum1 = currentInputValue;
                        display.setText(""); 
                    }
                }
                
            } catch (NumberFormatException ex) {
                display.setText("Error"); 
                operator = ""; 
                tempNum1 = 0; 
                tempNum2 = 0; 
            }
            
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setVisible(true); // Make the calculator visible
    }

    private double evaluateExpression(String expression) {
      String[] tokens = expression.split("\\s+");
      double result = Double.parseDouble(tokens[0]);
      for (int i=1; i<tokens.length; i+=2) {
          String op = tokens[i];
          double nextNumber = Double.parseDouble(tokens[i+1]);
          switch (op) {
              case "+":
                  result += nextNumber;
                  break;
              case "-":
                  result -= nextNumber;
                  break;
              case "*":
                  result *= nextNumber;
                  break;
              case "/":
                  if (nextNumber != 0) {
                      result /= nextNumber;
                  } else {
                      return Double.NaN;  // Return NaN for division by zero.
                  }
                  break;
          }
      }
      return result;
   }
}