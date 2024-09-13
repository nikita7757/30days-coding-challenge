import java.util.Scanner;

public class day5 {

    public static void FindLeader(int arr[]) {
        int n = arr.length;
        
        // Traverse the array from left to right
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            // Check if arr[i] is greater than all elements to its right
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    isLeader = false;
                    break;  // No need to check further if it's not a leader
                }
            }

            // If it's a leader, print the element
            if (isLeader) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        FindLeader(arr);
    }
}
