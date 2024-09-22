import java.util.HashMap;

public class day14 {
    public static int countSubstrings(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                if (map.size() == k) {
                    count++;
                } else if (map.size() > k) {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        System.out.println(countSubstrings(s, k));
    }
}
