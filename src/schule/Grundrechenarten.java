package schule;

import java.util.Scanner;

public class Grundrechenarten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double e1, e2;
        String s;
        System.out.print("Input nr.1: ");
        e1 = in.nextDouble();
        System.out.print("Input nr.2: ");
        e2 = in.nextDouble();
        System.out.print("Input operator: ");
        s = in.next();

        if (s.equals("+")) {
            System.out.println("res: " + e1 + " + " + e2 + " = " + (e1+e2));
        } else if (s.equals("-")) {
            System.out.println("res: " + e1 + " + " + e2 + " = " + (e1-e2));
        } else if (s.equals("*")) {
            System.out.println("res: " + e1 + " + " + e2 + " = " + (e1*e2));
        } else if (s.equals("/")) {
            System.out.println("res: " + e1 + " + " + e2 + " = " + (e1/e2));
        } else {
            System.out.println("invalid operator!");
        }

        in.close();
    }
}