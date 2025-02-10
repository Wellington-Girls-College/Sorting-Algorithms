import java.util.Arrays;
import java.util.Random;

public class BogoSort {
    public static void main(String[] args) {
        int size = 5; // Number of elements in the array
        int[] arr = new int[size]; // Create an array
        int counter = 0;
        
        Random random = new Random();

        // Fill the array with random numbers between 0 and 99
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }

        // Print original array
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        while (!isSorted(arr)) {
            for (int i = arr.length - 1; i > 0; i--) {
                int j = random.nextInt(i + 1);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
                
            counter++;
            System.out.println("Counter: " + counter);
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
