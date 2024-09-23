

import java.util.*;

public class day15 {
    
    static int longestSubstr(String s) {
        int n = s.length();
        int res = 0;

        for (int i = 0; i < n; i++) {

      
            boolean[] visited = new boolean[256];

            for (int j = i; j < n; j++) {

             
                if (visited[s.charAt(j)]) {
                    break;
                } 
                  else {
               
                    res = Math.max(res, j - i + 1);
                    visited[s.charAt(j)] = true;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "NIKITASHEDAGE";
        System.out.println(longestSubstr(s));
    }
}
