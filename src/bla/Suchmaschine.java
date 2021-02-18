package bla;

import java.util.Random;

public class Suchmaschine {

    public static void main(String[] args) {
        int[] ar = rndArray();
        int[] temp = new int[1000];
        int high = 0;
        int low = 0;
        double perc = 0;
        int c = 0;
        for (int x : ar ) {
            if (checkPrim(x) && !checkDuplication(temp, x)) {
                c++;
            }
            if (x > high) {
                high = x;
            }
            if (x < low) {
                low = x;
            }
            if ((x%2) == 0) {
                perc++;
            }
        }

        int[] prim = newArray(c, ar);

        getPrimCount(c);
        System.out.println("Larges Number: " + high);
        System.out.println("Lowest Number: " + low);
        System.out.println("Percantage of even Numbers: " + (perc/1000)*100 + "%");

    }

    public static int[] rndArray() {
        Random random = new Random();
        int[] ar = new int[1000];

        for (int i=0;i<ar.length;i++) {
            ar[i] = random.nextInt();
        }
        return ar;
    }

    public static int[] newArray(int count, int[] ar) {
        int[] prim = new int[count];
        int c = 0;
        for (int x : ar ) {
            if (checkPrim(x) && !checkDuplication(prim, x)) {
                prim[c] = x;
                c++;
                System.out.println(c + ". : " + x);
            }
        }
        return ar;
    }

    public static void getPrimCount(int count) {
        System.out.println("Count: " + count);
    }

    public static boolean checkPrim(int prim) {
        if (prim <= 1) {
            return false;
        }

        boolean res = true;
        for (int i = 2; i <= Math.sqrt(prim); i++) {
            if (prim % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static boolean checkDuplication(int[] array, int check) {
        for (int a: array) {
            if (a == check) {
                return true;
            }
        }
        return false;
    }
}