import java.util.*;

public class day10{
    public static List<List<String>> groupAnagrams(String[] strs) {
  
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
     
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

           
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }

            
            map.get(sortedKey).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
