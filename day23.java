import java.util.Scanner;

public class day23 {

    static void printKMax(int arr[], int N, int K) {
        int j, max;
        for (int i = 0; i <= N - K; i++) {
            max = arr[i];
            for (j = 1; j < K; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            System.out.print(max + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the sliding window (K): ");
        int k = sc.nextInt();

        printKMax(arr, n, k);
        sc.close();
    }
}
