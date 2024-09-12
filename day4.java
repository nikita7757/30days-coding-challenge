
import java.util.Arrays;

public class day3 {

    public static void merge(int[] arr1, int[] arr2, int a1, int a2) {
      
        for (int i = a1 - 1, j = 0; i >= 0 && j < a2; i--, j++) {
           
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
        }

        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int arr1[]  = {2, 3, 5, 7}; 
        int arr2[]  = {1, 4, 6, 8}; 

        int a1 = arr1.length;
        int a2 = arr2.length;

        merge(arr1, arr2, a1, a2);

        
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}
