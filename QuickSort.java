import java.util.Random;

public class QuickSort {
    
    private static int counter = 0;

    public static void main(String[] args) {
        int size = 5; // Number of elements in the array
        int[] numbers = new int[size]; // Create an array


        Random random = new Random();

        // Fill the array with random numbers between 0 and 99
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100);
        }

        // Print original array
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array
        quickSort(numbers, 0, numbers.length - 1);

        // Print sorted array
        System.out.println("\nSorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("Counter:" + counter);
    }

    public static void quickSort(int[] arr, int start, int end) {
        counter++;
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end]; // Choose the last element as the pivot
        int leftPointer = start;

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                // Swap arr[i] and arr[leftPointer]
                int temp = arr[i];
                arr[i] = arr[leftPointer];
                arr[leftPointer] = temp;
                leftPointer++;
            }
        }

        // Swap pivot into correct position
        int temp = arr[leftPointer];
        arr[leftPointer] = arr[end];
        arr[end] = temp;

        return leftPointer;
    }
}
