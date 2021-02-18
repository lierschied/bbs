package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator {
    private JPanel panel;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnFour;
    private JButton btnSix;
    private JButton btnFive;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnThree;
    private JButton addition;
    private JButton subtraction;
    private JButton multiplication;
    private JButton division;
    private JLabel labelOutput;
    private JButton btnDot;
    private JButton btnDelete;
    private JLabel labelResult;
    private JLabel labelLastNumber;
    private JButton btnEquals;
    private JButton btnClearAll;
    private JButton btnClear;
    private JButton btnSqrt;
    private JButton btnPow;
    private JButton btnPercentage;

    public String getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(String currentNumber) {
        this.currentNumber = currentNumber;
    }

    private String currentNumber = "";

    public String getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(String lastNumber) {
        this.lastNumber = lastNumber;
    }

    private String lastNumber = "";

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    private String result = "";

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    private String operator = "=";

    public Calculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumber("1");
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumber("2");
            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumber("3");
            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumber("4");
            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumber("5");
            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumber("6");
            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumber("7");
            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumber("8");
            }
        });

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumber("9");
            }
        });

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumber("0");
            }
        });
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNumber(".");
            }
        });
        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator("+");
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator("-");
            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator("*");
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator("/");
            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                delete();
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber = "";
                updateOutput();
            }
        });
        btnClearAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentNumber = "";
                lastNumber = "";
                result = "";
                updateOutput();
            }
        });
        btnSqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sqrt();
            }
        });
        btnPow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pow();
            }
        });
        btnPercentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operator("%");
            }
        });

        panel.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                delete();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        panel.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    public void delete() {
        if (currentNumber.length() > 1) {
            currentNumber = currentNumber.substring(0, currentNumber.length() - 1);
        } else {
            currentNumber = "";
        }
        updateOutput();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setSize(550, 400);
        frame.setVisible(true);
    }

    //concatenation of two numbers
    public String concat(int number1, int number2) {
        String string1 = Integer.toString(number1);
        String string2 = Integer.toString(number2);
        return string1 + string2;
    }

    public void updateOutput() {
        labelOutput.setText(currentNumber);
        labelLastNumber.setText(lastNumber);
        labelResult.setText(result);
    }

    public void addNumber(String number) {
        if (!number.equals(".") || !currentNumber.contains(".")) {
            currentNumber += number;
            updateOutput();
        }
    }

    public void operator(String current_operator) {
        //return early
        if (currentNumber.equals("")) {
            return;
        }
        lastNumber = currentNumber;
        currentNumber = "";
        operator = current_operator;
        updateOutput();
    }

    public void calculate() {
        if (lastNumber.equals("") || currentNumber.equals("")) {
            return;
        }
        double number1 = Double.parseDouble(lastNumber);
        double number2 = Double.parseDouble(currentNumber);

        switch (operator) {
            case "+" -> result = Double.toString(number1 + number2);
            case "-" -> result = Double.toString(number1 - number2);
            case "*" -> result = Double.toString(number1 * number2);
            case "/" -> result = Double.toString(number1 / number2);
            case "%" -> result = Double.toString((number1 / number2) * 100) + "%";
            default -> result = "";
        }
        updateOutput();
        setCurrentNumber("");
    }

    public void sqrt() {
        if (currentNumber.equals("")) {
            return;
        }
        double number = Double.parseDouble(currentNumber);
        currentNumber = Double.toString(Math.sqrt(number));
        updateOutput();
    }

    public void pow() {
        if (currentNumber.equals("")) {
            return;
        }
        double number = Double.parseDouble(currentNumber);
        currentNumber = Double.toString(Math.pow(number, 2));
        updateOutput();
    }

}