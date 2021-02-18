package schule;

import java.util.Scanner;

public class Taschenrechner {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        double number1;
        double number2;
        String input;

        do {
            number1 = getNumber("Bitte gebe die erste Zahl ein: ");
            number2 = getNumber("Bitte gebe die zweite Zahl ein: ");

            System.out.print("Bitte gebe den Rechenoperator an (+ - * /): ");

            switch (scanner.next()) {
                case "+":
                    System.out.println(addition(number1, number2));
                    break;
                case "-":
                    System.out.println(subtraction(number1, number2));
                    break;
                case "*":
                    System.out.println(multiplication(number1, number2));
                    break;
                case "/":
                    System.out.println(division(number1, number2));
                    break;
                default:
                    System.out.println("ungültiger Rechenoperator");
            }

            System.out.print("Beenden (Y/N)? ");
            String check = scanner.next();
            if (check.equals("y") || check.equals("Y")) {
                exit = true;
            }

        } while (!exit);
    }

    private static double getNumber(String output) {
        System.out.print(output);
        return scanner.nextDouble();
    }

    private static String addition(double number1, double number2) {
        return number1 + " + " + number2 + " = " + (number1 + number2);
    }

    private static String subtraction(double number1, double number2) {
        return number1 + " - " + number2 + " = " + (number1 - number2);
    }

    private static String multiplication(double number1, double number2) {
        return number1 + " * " + number2 + " = " + (number1 * number2);
    }

    private static String division(double number1, double number2) {
        if (number1 != 0) {
            return number1 + " / " + number2 + " = " + (number1 / number2);
        } else {
            return "Division durch Null ist nicht möglich!";
        }

    }
}
