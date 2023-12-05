import java.util.*;
public class Contains_Duplicate {
    //Brute Force approach.
    // public boolean Contains(int[] arr, int n){
    //     int count = 0;
    //     for(int i = 0; i < n; i++){
    //         for(int j = i +1; j < n; j++){
    //             if(arr[i] == arr[j]){
    //                 count++;
    //             }
    //         }
    //     }
    //    if(count > 0){
    //     return true;
    //    }
    //    else{
    //     return false;
    //    }
    // }


    //O(n) approach.
    public boolean Contains(int[] arr, int n){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(set.contains(arr[i])){
                return true;
            }
            else{
                set.add(arr[i]);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,1,4};
        int n = arr.length;
        Contains_Duplicate cd = new Contains_Duplicate();
        System.out.println(cd.Contains(arr, n));
    }
}
