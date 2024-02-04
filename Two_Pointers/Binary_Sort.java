package Two_Pointers;
import java.util.*;

public class Binary_Sort {
    public static void main(String[] args) {
        //Given a binary array A[] of size N. The task is to arrange the array in increasing order.The binary array contains only 0  and 1.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = n - 1;
        while(start < end){
            if(arr[start] > arr[end]){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            else if((arr[start] == arr[end]) && (arr[start] == 1 && arr[end] == 1)){
                end--;
            }
            
            else if(arr[start] == arr[end]){
                start++;
            }
            else{
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}