
import java.util.Scanner;

public class day22 {
    public static int firstElement(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == k) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        int result = firstElement(arr, n, k);
        if (result != -1) {
            System.out.println("The first element occurring " + k + " times is: " + result);
        } else {
            System.out.println(result);
        }

        sc.close();
    }
}
