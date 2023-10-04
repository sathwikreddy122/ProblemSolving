public class problem4 {
    public static void main(String[] args) {
        //Maximum and Minnimum of array.
        int[] arr = {94, 73, 56, 23, 33, 28, 10, 11, 9, 5, 2, -3, -5};
        int n = arr.length;
        //O(n);
        // Arrays.sort(arr);
        // System.out.println(arr[0] + " " + arr[n-1]);
        int max_num = Integer.MIN_VALUE;
        int min_num = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] > max_num){
                max_num = arr[i];
            }
            else if(arr[i] < min_num){
                min_num = arr[i];
            }
        }
        System.out.println(min_num + " " + max_num);
    }
}
