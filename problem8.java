import java.util.Arrays;

public class problem8 {
    public static void main(String[] args) {
        //Move all negative numbers to beginning and positive to end.
        int[] arr = {1, 4, 23, -5, -4, 9, -4, -9, 10, -34, 6};
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while(start < end){
            if(arr[start] <= 0){
                start++;
            }
            else if(arr[end] >= 0){
                end--;
            }
            else{
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
