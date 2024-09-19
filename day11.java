import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class day11{
    public static List<List<String>> func(String[] strs) {
        Map<String, List<String>> h = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (!h.containsKey(sortedStr)) {
                h.put(sortedStr, new ArrayList<>());
            }
            h.get(sortedStr).add(str);
        }
        return new ArrayList<>(h.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = func(strs);
        System.out.println(result);
    }
}
