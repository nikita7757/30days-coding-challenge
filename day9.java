public class day9 {

    public static String func(String[] s){
        if(s.length <= 1)   return "";
        StringBuilder sb = new StringBuilder();
        sb.append(s[0]);
        for(int i=1; i<s.length; i++){
            int j=0;
            while(j<s[i].length() && j<sb.length() &&s[i].charAt(j) == sb.charAt(j)){
                j++;
            }
            sb.delete(j, sb.length());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(func(strs));
    }
}
