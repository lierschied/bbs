package empty;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Erstellt einen kleinen Taschenrechner.
 *
 * @author Erw
 * @version 1.00 06.10.2020
 * @link https://d-ku.de/id
 */
public class Calculator {
    public static void main(String[] args) { // Main-Method
        CalculatorFrame frame = new CalculatorFrame(); // This opens the Frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Just for closing the Program important.
        frame.setVisible(true); // An Switch, which is boolean true so the Program is Visible.
    }
}

class CalculatorFrame extends JFrame { // Frame-Method
    public CalculatorFrame() { // Frame-Class
        setTitle("Calculator"); // Setting the Title.
        CalculatorPanel panel = new CalculatorPanel(); // Opening the Panel
        add(panel); // Adding an Panel
        pack(); // Packing all together.
    }
}

class CalculatorPanel extends JPanel { // Panel-Method
    private final JButton display;
    private final JPanel panel;
    private double result;
    private String lastCommand;
    private boolean start;

    public CalculatorPanel() {
        setLayout(new BorderLayout()); // Setting the Layout.

        result = 0;
        lastCommand = "=";
        start = true;

        display = new JButton("0"); // Let the Display for the Numbers have the Text 0 at first.
        display.setEnabled(false);
        add(display, BorderLayout.NORTH);

        ActionListener insert = new InsertAction();
        ActionListener command = new CommandAction();

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        addButton("7", insert);
        addButton("8", insert);
        addButton("9", insert);
        addButton("/", command);

        addButton("4", insert);
        addButton("5", insert);
        addButton("6", insert);
        addButton("*", command);

        addButton("1", insert);
        addButton("2", insert);
        addButton("3", insert);
        addButton("-", command);

        addButton("0", insert);
        addButton(".", insert);
        addButton("=", command);
        addButton("+", command);

        add(panel, BorderLayout.CENTER);
    }

    private void addButton(String label, ActionListener listener) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button);
    }

    public void calculate(double x) {
        switch (lastCommand) {
            case "+" -> result += x;
            case "-" -> result -= x;
            case "*" -> result *= x;
            case "/" -> result /= x;
            case "=" -> result = x;
        }
        display.setText("" + result);
    }

    private class InsertAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String input = event.getActionCommand();
            if (start) {
                display.setText("");
                start = false;
            }
            display.setText(display.getText() + input);
        }
    }

    private class CommandAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String command = event.getActionCommand();

            // Füge den Präfix "-" an den String an wenn
            // es sich um den ersten Befehl handelt (negative Zahl)
            if (start) {
                if (command.equals("-")) {
                    display.setText(command);
                    start = false;
                } else
                    lastCommand = command;
            } else {
                // Berechnung ausführen
                calculate(Double.parseDouble(display.getText()));
                lastCommand = command;
                start = true;
            }
        }
    }
}