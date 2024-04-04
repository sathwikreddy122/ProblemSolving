package Binary_Search;
import java.util.*;
//return the index of the given target.
public class target_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int output = search(arr, n, target);
        System.out.println(output);
        
    }
    static int search(int[] arr, int n, int target){
        int low = 0;
        int high = n - 1;
         while (low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
         }
         return -1;
    }
}
