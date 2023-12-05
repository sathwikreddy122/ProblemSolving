import java.util.Arrays;

public class Concatination_Of_Array {
    public void Concatination(int[] arr, int n){
        int[] dup_arr = new int[n * 2];
        for(int i = 0; i < n; i++){
            dup_arr[i] = arr[i];
            dup_arr[n+i] = arr[i];
        }
        System.out.println( Arrays.toString(dup_arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;
        Concatination_Of_Array ca = new Concatination_Of_Array();
        ca.Concatination(arr, n);
    }
}
