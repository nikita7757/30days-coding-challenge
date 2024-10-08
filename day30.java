import java.util.Arrays;
import java.util.Scanner;

class day30 {

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter coin denominations separated by commas:");
        String[] coinsStr = obj.nextLine().split(",");
        int[] coins = Arrays.stream(coinsStr).mapToInt(Integer::parseInt).toArray();

        System.out.println("Enter the amount:");
        int amount = obj.nextInt();

        int result = coinChange(coins, amount);
        System.out.println(result);
    }
}
