package schule;

import java.util.Random;

/**
 * The type Spiegelung.
 */
public class Spiegelung {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("\n=== A1 ===\n");
        int[][] matrix1 = fillEins(3);
        aufgabeEins(matrix1);

        System.out.println("\n=== A2 ===\n");
        int[][] matrix2 = fillZwei(4,5);
        aufgabeZwei(matrix2);
    }

    private static void aufgabeEins(int[][] matrix) {
        drawArray(matrix);
        System.out.println("======");

        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                //starting matrix[min][max] -> ending matrix[max][min]
                //starting newMatrix[min][min] -> ending newMatrix[max][max]
                newMatrix[i][matrix[i].length-j-1] = matrix[j][i];
            }
        }
        drawArray(newMatrix);
    }

    private static int[][] fillEins(int length) {
        Random rand = new Random();
        int[][] matrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j =0;j < length; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }
        return matrix;
    }
    
    private static void aufgabeZwei(int[][] matrix) {
        drawArray(matrix);
        System.out.println("======");

        int[][] newMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = newMatrix[i].length - 1; j >= 0; j--) {
                //starting matrix[max][max] -> ending matrix[min][min]
                //starting newMatrix[max][min] -> ending newMatrix[min][max]
                newMatrix[newMatrix.length-1-i][newMatrix[i].length-j-1] = matrix[j][newMatrix.length-i-1];
            }
        }
        drawArray(newMatrix);
    }

    private static int[][] fillZwei(int length, int width) {
        Random rand = new Random();
        int[][] matrix = new int[length][width];
        for (int i = 0; i < length; i++) {
            for (int j =0;j < width; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }
        return matrix;
    }

    private static void drawArray(int[][] array) {
        for(int[] i : array) {
            for (int j : i) {
                System.out.print(j + "|");
            }
            System.out.println("\n_____");
        }
    }

}
