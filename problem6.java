import java.util.Arrays;

public class problem6 {
    public static void main(String[] args) {
        //Rotate the array by one position in clock-wise direction.
        int[] arr = {1,2,3,4,5,6,7,8};//op:{8,1,2,3,4,5,6,7}
        int n = arr.length;
        int last_ele = arr[n-1];
        for(int i = n-2; i >= 0; i--){
            arr[i + 1] = arr[i];
        }
        arr[0] = last_ele;
        System.out.println(Arrays.toString(arr));
    }
}
