import java.util.Arrays;

public class problem7 {
    public static void main(String[] args) {
        //Rotate the array in group.
        int[] arr = {9,4,6,36,94,0,-2,-54,85,2,6};
        int k= 6;
        for(int i = 0; i < k-1; i++){
            int temp = arr[i];
            arr[i] = arr[k-1];
            arr[k-1] = temp;
            k--;
            if(i == k){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
