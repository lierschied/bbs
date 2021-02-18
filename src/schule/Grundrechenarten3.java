package schule;

import java.util.Scanner;

public class Grundrechenarten3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nr1;
        double nr2;
        String input;
        boolean exit = false;

        while (!exit) {
            System.out.print("Input nr.1: ");
            nr1 = in.nextDouble();
            System.out.print("Input nr.2: ");
            nr2 = in.nextDouble();
            System.out.print("Input operator: ");
            input = in.next();

            switch (input) {
                case "+":
                    System.out.println("res: " + nr1 + " + " + nr2 + " = " + (nr1 + nr2));
                    break;
                case "-":
                    System.out.println("res: " + nr1 + " + " + nr2 + " = " + (nr1 - nr2));
                    break;
                case "*":
                    System.out.println("res: " + nr1 + " + " + nr2 + " = " + (nr1 * nr2));
                    break;
                case "/":
                    System.out.println("res: " + nr1 + " + " + nr2 + " = " + (nr1 / nr2));
                    break;
                default:
                    System.out.println("invalid operator!");
            }

            System.out.print("Exit? (Y) ");
            input = in.next();
            if (input.equals("y") || input.equals("Y")) {
                exit = true;
            }
        }
        in.close();
    }
}
