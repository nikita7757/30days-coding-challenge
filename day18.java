import java.util.Scanner;

public class day18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter a positive integer: ");
        int N = scanner.nextInt();

        int divisorCount = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divisorCount++;
            }
        }

        System.out.println( divisorCount);
        
        scanner.close();
    }
}
