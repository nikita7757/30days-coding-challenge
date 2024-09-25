public class day17 {
    public static void primeFactors(int N) {
      
        while (N % 2 == 0) {
            System.out.print(2 + " ");
            N /= 2;
        }

      
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }

  
      
        if (N > 2) {
            System.out.print(N);
        }
    }

    public static void main(String[] args) {
        int N = 18;
        primeFactors(N);
    }
}
