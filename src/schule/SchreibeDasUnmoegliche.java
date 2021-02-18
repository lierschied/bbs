package schule;

public class SchreibeDasUnmoegliche {
    public static void main(String[] args) {
        double i = 12 + -(-13), o = 0b10000, O = 0b0001;
        int x = 12;
        double z = x + 12.2;
        i = z - 1.1;
        i = i-- - o++;
        System.out.println(i + "12" + 0);

    }
}