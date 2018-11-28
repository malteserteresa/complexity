package sorting;

import java.util.Random;

/**
 *  Once an sorting algorithm is chosen by indexing into the sorting array, this program
 *  measures the time taken for the sorting algorithm to perform.
 *
 *  This is part of an investigation into how complexity affects performance.
 *
 */
public class Demo {

    public static void main(String[] args) {

      Strategy[] sorting = { new BubbleSort(), new SelectionSort(), new InsertionSort(),
                new MergeSort() };

        Strategy algorithm = sorting[0];

        timeToExecute(algorithm, generateUnsortedList(10));
    }

    /**
     * Records the time take for the algorithm to run and prints the value in seconds
     *
     * @param algorithm
     * @param unsortedList
     */
    public static void timeToExecute(Strategy algorithm, int[] unsortedList) {

        long startTime = System.nanoTime();

        algorithm.sort(unsortedList);

        long endTime = System.nanoTime();

        double duration = (double) (endTime - startTime) / 1000000000;

        System.out.println("This takes " + String.format("%.10f", duration) + " seconds to run");
    }


    /**
     * Generates a list of random numbers to be sorted
     *
     * @param length
     * @return
     */
    public static int[] generateUnsortedList(int length) {
        int[] list = new int[length];
        Random rand = new Random();

        int n = 0;
        while (n < length) {
            list[n] = rand.nextInt(100);
            n++;
        }
        return list;
    }


}

