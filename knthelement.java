import java.util.Scanner;

 class knthelement{

    static int knthlargeno(int arr[],int k){ 
        
        for(int i=0;i<arr.length;i++){
            int maxidx =0;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[maxidx]) {
                    maxidx = j;
        }
    }
    int temp = arr[maxidx];
    arr[maxidx] = arr[arr.length - i - 1];
    arr[arr.length - i - 1] = temp;
    

}   
    return arr[arr.length - k];
    
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter enter value of k");
        int k = sc.nextInt();

        int output = knthlargeno(arr,k);
        System.out.println(output);

        
    }
}