import java.math.BigInteger;
import java.util.Scanner;

class day29 {

    static BigInteger nthFibonacci(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }
        BigInteger[] fib = new BigInteger[n + 1];
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }
        return fib[n];
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = obj.nextInt();
        BigInteger result = nthFibonacci(n);
        System.out.println(result);
    }
}
