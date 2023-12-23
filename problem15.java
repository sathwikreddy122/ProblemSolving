import java.util.Arrays;

public class problem15 {
    public static void main(String[] args) {
        //Rotating an Array.
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 2;
        int t = k;
        for(int i = 0; i < k; i++){
            int temp = arr[i];
            arr[i] = arr[k-1];
            arr[k-1] = temp;
            k--;
            if(i == k){
                break;
            }
        }//{2, 1, 3, 4, 5, 6, 7}
        for(int i = t; i < (n+t)/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
            n--;
            if(i >= n){
                break;
            }
        }//{2, 1, 7, 6, 5, 4, 3}
        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
            n--;
            if(i >= n){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        // System.out.println(k);
    }
}