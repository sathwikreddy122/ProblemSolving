import java.util.*;

public class bubble_sort {

    public static void main(String[] args) {
        int[] arr = {9, 5, 7, 3, 8, 2}; //5, 9 , 7, 3, 8 ,2 // 
        int n = arr.length;
        int left = 0;
        int right = left + 1;
        while(left < right && right <= n - 1 && left < n - 2){
            if(arr[left] > arr[right]){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                right++;
            }else{
                left++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
