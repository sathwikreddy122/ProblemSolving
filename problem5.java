import java.util.Arrays;

public class problem5 {
    public static void main(String[] args) {
        //Kth smallest element in an array
        int[] arr = {1,2,5,6,7,9,8};
        int n = arr.length;
        int k = 3;
        int Kth_element = 0;
        Arrays.sort(arr);
        for(int i = 0;  i < n; i++){
            Kth_element = arr[k-1];
        }
        System.out.println(Kth_element);
    }
}
