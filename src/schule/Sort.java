package schule;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * The type Sort.
 */
public class Sort {

    private static final DefaultCategoryDataset lineChartDataset = new DefaultCategoryDataset();
    //this seed is for generating the random Arrays with the same set of numbers each time
    private static final int SEED = 1810;

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    //TODO ??? testAlgorithm +0.01 ms on first execution ??? 28.11.2020
    //TODO Not happening anymore 10.12.2020 ??? !!! STACKOVERFLOW comparing(iterations > 9) at insertionSort 10x time 28.11.2020
    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();

        /* print sorted array */
//        int [] r = createRandomArray(10);
//        bubbleSort(r);
//        System.out.println(Arrays.toString(r));

        /* test sorting algorithm
            1.param: number of algorithm (1) bubbleSort, (2) insertion sort, (3) selection sort, (4) quick sort;
            2.param: times to test the algorithm
            3.param: times of algorithm executions;
            3.param: count of random numbers to sort;
            5.param: increasing factor of count of random numbers;
            Full Example: testAlgorithm(2, 10, 10, 10000, 1);
        */
//        testAlgorithm(2, 2, 10, 10000, 1);

        /* compare algorithms
            1.param: times to compare (STACKOVERFLOW for > 9 at insertionSort);
            2.param: times of algorithm executions;
            3.param: count of random numbers to sort
            4.param: factor for increasing count of numbers foreach run : arrayLength + (arrayLength * n)
            5.param: true for generating comparison line graph chart saved as jpeg (iterations needs to be > 1)
            Full Example: compareAlgorithms(2, 1, 100, 2, true);
        */
        compareAlgorithms(5, 4, 100, 2, true);

        long endTime = System.nanoTime();
        runtime(startTime, endTime);
    }

    /**
     * default of {@link Sort#createRandomArray}.
     *
     * @return the int [ ]
     * @see #createRandomArray(int, int)
     */
    private static int[] createRandomArray(int length) {
        return createRandomArray(length, 999);
    }

    /**
     * Create random array int [ ].<p>
     *
     * @param length         array length
     * @param integerMaxSize the upper bound
     * @return Array filled with random integer values
     */
    private static int[] createRandomArray(int length, int integerMaxSize) {
        Random rand = new Random(SEED);
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(integerMaxSize);
        }
//        System.out.println(Arrays.toString(array));
        return array;
    }

    /**
     * default of {@link Sort#bubbleSort}.
     *
     * @param toSort the toSort
     * @return the int [ ]
     * @see #bubbleSort(int[], boolean)
     */
    private static int[] bubbleSort(int[] toSort) {
        return bubbleSort(toSort, true);
    }

    /**
     * performs a bubble sort on a given integer array<p>
     *
     * @param toSort    array with integers
     * @param ascending sort in ascending order if true, descending if false
     * @return sorted integer array
     */
    private static int[] bubbleSort(int[] toSort, boolean ascending) {
        for (int i = 0; i < toSort.length; i++) {
            for (int j = 0; j < toSort.length; j++) {
                if (ascending) {
                    if (toSort[i] < toSort[j]) {
                        swap(toSort, i, j);
                    }
                } else {
                    if (toSort[i] > toSort[j]) {
                        swap(toSort, i, j);
                    }
                }
            }
        }
        return toSort;
    }

    /**
     * default of {@link Sort#insertionSort}.
     *
     * @param toSort the toSort
     * @return the int [ ]
     * @see #insertionSort(int, int[], boolean)
     */
    private static int[] insertionSort(int[] toSort) {
        return insertionSort(1, toSort, true);
    }

    /**
     * performs a insertion sort on a given integer array
     * Example: insertionSort(1, array, true);<p>
     *
     * @param pos       array index position to start sorting
     * @param toSort    array with integers
     * @param ascending sort in ascending order if true, descending if false
     * @return sorted integer array
     */
    private static int[] insertionSort(int pos, int[] toSort, boolean ascending) {
        for (int i = pos; i > 0; i--) {
            if (ascending) {
                if (toSort[i] < toSort[i - 1]) {
                    swap(toSort, i, i - 1);
                }
            } else {
                if (toSort[i] > toSort[i - 1]) {
                    swap(toSort, i, i - 1);
                }
            }
        }

        if (pos < toSort.length - 1) {
            insertionSort(pos + 1, toSort, ascending);
        }

        return toSort;
    }

    /**
     * default of {@link Sort#selectionSort}.
     *
     * @param toSort the toSort
     * @return the int [ ]
     * @see #selectionSort(int, int[], boolean)
     */
    private static int[] selectionSort(int[] toSort) {
        return selectionSort(0, toSort, true);
    }

    /**
     * performs a selection sort on a given integer array
     * Example: selectionSort(0, array, true);<p>
     *
     * @param pos       array index position to start sorting
     * @param toSort    array with integers
     * @param ascending sort in ascending order if true, descending if false
     * @return sorted integer array
     */
    private static int[] selectionSort(int pos, int[] toSort, boolean ascending) {
        for (int i = pos + 1; i < toSort.length; i++) {
            if (ascending) {
                if (toSort[i] < toSort[pos]) {
                    swap(toSort, pos, i);
                }
            } else {
                if (toSort[i] > toSort[pos]) {
                    swap(toSort, pos, i);
                }
            }
        }

        if (pos < toSort.length - 1) {
            selectionSort(pos + 1, toSort, ascending);
        }

        return toSort;
    }

    /**
     * default of {@link Sort#quickSort}.
     *
     * @param toSort the toSort
     * @return the int [ ]
     * @see #quickSort(int, int, int[], boolean)
     */
    private static int[] quickSort(int[] toSort) {
        return quickSort(0, toSort.length - 1, toSort, true);
    }

    /**
     * performs a quick sort on a given integer array
     * Example: quickSort(0, array.length-1, array, true);<p>
     *
     * @param start     the start
     * @param end       the end
     * @param toSort    array with integers
     * @param ascending sort in ascending order if true, descending if false
     * @return sorted integer array
     */
    private static int[] quickSort(int start, int end, int[] toSort, boolean ascending) {
        int divide = divide(start, end, toSort, ascending);

        if (divide - 1 > start) {
            quickSort(start, divide - 1, toSort, ascending);
        }
        if (divide + 1 < end) {
            quickSort(divide + 1, end, toSort, ascending);
        }

        return toSort;
    }

    /**
     * Divide int.<p>
     *
     * @param start     the start
     * @param end       the end
     * @param toSort    the toSort
     * @param ascending sort in ascending order if true, descending if false
     * @return the int
     */
    private static int divide(int start, int end, int[] toSort, boolean ascending) {
        int pivot = toSort[end];

        for (int i = start; i < end; i++) {
            if (ascending) {
                if (toSort[i] < pivot) {
                    swap(toSort, start, i);
                    start++;
                }
            } else {
                if (toSort[i] > pivot) {
                    swap(toSort, start, i);
                    start++;
                }
            }
        }

        toSort[end] = toSort[start];
        toSort[start] = pivot;

        return start;
    }

    /**
     * Generates the average execution time for a sort algorithm
     * 1. bubbleSort | 2. insertionSort | 3. selectionSort | 4. quickSort<p>
     *
     * @param algorithm   the algorithm
     * @param iterations  the iterations number of iterations to determine the average value
     * @param arrayLength the array size
     * @return the average execution time in milliseconds
     */
    private static double getAverageExecutionTime(int algorithm, int iterations, int arrayLength) {
        long startTime = 0;
        long endTime = 0;
        long average = 0;

        for (int i = 0; i < iterations; i++) {
            int[] randomArray = createRandomArray(arrayLength);
            switch (algorithm) {
                case 1 -> {
                    startTime = System.nanoTime();
                    bubbleSort(randomArray);
                    endTime = System.nanoTime();
                }
                case 2 -> {
                    startTime = System.nanoTime();
                    insertionSort(randomArray);
                    endTime = System.nanoTime();
                }
                case 3 -> {
                    startTime = System.nanoTime();
                    selectionSort(randomArray);
                    endTime = System.nanoTime();
                }
                case 4 -> {
                    startTime = System.nanoTime();
                    quickSort(randomArray);
                    endTime = System.nanoTime();
                }
                default -> {
                    System.out.println("Please specify sort algorithm");
                    return 0.00;
                }
            }
            average += (endTime - startTime);
        }

        average = average / iterations;
        return (double) average / 1000000.0;
    }

    /**
     * Generate multiple average execution time tests, with increasing array size<p>
     *
     * @param algorithm          the algorithm
     * @param iterations         the iterations count
     * @param numberOfExecutions the number of executions
     * @param arrayLength        the array size of
     * @param increasing         the increasing factor of array size per iteration
     */
    private static void testAlgorithm(int algorithm, int iterations, int numberOfExecutions, int arrayLength, int increasing) {
        String algorithmName = getAlgorithmName(algorithm);
        int tempLength = arrayLength;
        for (int i = 1; i <= iterations; i++) {
            double duration = getAverageExecutionTime(algorithm, numberOfExecutions, tempLength);
            Sort.lineChartDataset.addValue(duration, algorithmName, Integer.toString(tempLength));
            System.out.printf("The \"" + algorithmName + "\" algorithm took %f ms on average for " + numberOfExecutions
                    + " executions and a array length of " + tempLength + ".\n", duration);
            tempLength = tempLength + (arrayLength * increasing);
        }
    }

    /**
     * Compare algorithms.<p>
     *
     * @param iterations         the iterations count
     * @param numberOfExecutions the number of executions
     * @param arrayLength        the array start size
     * @param increasing         the increasing
     * @param generateGraph      true for generating graph saved as jpeg
     * @throws IOException the io exception
     */
    private static void compareAlgorithms(int iterations, int numberOfExecutions, int arrayLength, int increasing, boolean generateGraph) throws IOException {

        for (int i = 1; i <= 4; i++) {
            testAlgorithm(i, iterations, numberOfExecutions, arrayLength, increasing);
        }

        if (iterations > 1 && generateGraph) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
            Date date = new Date();
            String info = "(iterations=" + iterations
                    + ",numberOfExecutions=" + numberOfExecutions
                    + ", increasing=" + increasing + " )";

            JFreeChart lineChartObject = ChartFactory.createLineChart(
                    "Time to sort VS sort complexity in size " + info, "Count of numbers",
                    "Time to sort (ms)",
                    Sort.lineChartDataset, PlotOrientation.VERTICAL,
                    true, true, false);

            String fileName = "comparisonResults_" + formatter.format(date) + ".png";
            File lineChart = new File(fileName);
            ChartUtils.saveChartAsPNG(lineChart, lineChartObject, 1000, 1000);
            System.out.println("Comparison results have been saved to: " + lineChart.getAbsolutePath());
            System.out.println("Opening: " + fileName + " ....");
            Desktop desktop = Desktop.getDesktop();
            desktop.open(lineChart);
        } else if (iterations <= 1 && generateGraph) {
            System.out.println("Line comparison graph needs at least 2 iterations!");
        }
    }

    /**
     * Gets algorithm name.<p>
     *
     * @param algorithm the algorithm
     * @return the algorithm name
     */
    private static String getAlgorithmName(int algorithm) {
        return switch (algorithm) {
            case 1 -> "bubble sort";
            case 2 -> "insertion sort";
            case 3 -> "selection sort";
            case 4 -> "quick sort";
            default -> "";
        };
    }

    /**
     * Swap two values within an array.<p>
     *
     * @param array the array
     * @param pos1  the pos 1
     * @param pos2  the pos 2
     */
    private static void swap(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    /**
     * Calculates the runtime in seconds or milliseconds.<p>
     *
     * @param startTime the start time as nanoseconds timestamp
     * @param endTime   the end time as nanoseconds timestamp
     */
    private static void runtime(long startTime, long endTime) {
        double duration = (endTime - startTime) / 1000000.0;

        if (duration >= 10) {
            System.out.printf("Overall runtime: %.2f seconds", duration / 1000);
        } else {
            System.out.printf("Overall runtime: %.2f milliseconds", duration);
        }
    }
}
