public class day3 {
    public static int findDplt(int[] arr) {
        int low = 1;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            
            for (int num : arr) {
                if (num <= mid) {
                    count++;
                }
            }

          
            if (count > mid) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 2}; 
        int duplicate = findDplt(arr);
        System.out.println(duplicate);
    }
}
