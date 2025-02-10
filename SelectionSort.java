import java.util.Random;
/**
 * Class demo of select sort
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSort
{
    
    public static void main(String[] args) {
        int size = 5;   // Size of the array
        int[] arr = new int[size];
        
        Random rand = new Random();
        
        // Fill the array with Random numbers
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100); // Random numbers between 0 and 99
        }
        
        // Printing array
        System.out.println("Original Array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        
        // Select Sort Algorithm
        int comparison = 0;
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                comparison++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;   // Update the index of the minimum element
                }
            }
            
            // Swap arr[i] and arr[minIndex]
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        
        // Print sorted array
        System.out.println("\nSorted Array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nTotal comparisons: " + comparison);
        System.out.println();
    }
}
