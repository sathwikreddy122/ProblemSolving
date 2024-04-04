package Two_Pointers;
import java.util.*;

class remove_Duplicate {
    public static void main(String[] args) {
        //Given a sorted array A[] of size N, delete all the duplicated elements from A[].
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        sc.close();
    }
}
