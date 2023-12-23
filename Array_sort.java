import java.util.Arrays;
import java.util.Scanner;

public class two_pointers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //{2,0,0,-3,-1,7}
        //[-3, -1, 0, 0, 2, 7]
        //sort
        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                i = -1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
