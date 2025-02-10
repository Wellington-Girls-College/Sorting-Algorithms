import java.util.Random;


public class BubbleSort {

        public static void main(String[] args) {
        int size = 5; // Size of the array
        int[] arr = new int[size];
        
        Random rand = new Random();
        
        // Filling the array with random numbers
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100); // Random number between 0 and 99
        }
            
        int n = arr.length;
        int comparisons = 0; // Track comparisons

        /** Print out */
        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Bubble Sort algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++; // Increment comparison count
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            /** Print array state after each pass
            System.out.println("\nPass " + (i + 1) + ":");
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println("\nComparisons so far: " + comparisons);*/
        }

        // Final output
        System.out.println("\nSorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nTotal comparisons: " + comparisons);
    }
}