import java.util.Arrays;

public class problem3 {
    public static void main(String[] args) {
        //reverse an array
        int[] arr = {4,5,1,2,3};
        int n = arr.length;
        // int start = 0;
        // int end = n-1;
        // while(start < end){
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }
        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
