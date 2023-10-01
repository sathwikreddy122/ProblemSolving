public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {1,6,3,8,4,0,8,5};
        int n = arr.length;
        int max_ele = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > max_ele){
                max_ele = arr[i];
            }
        }
        System.out.println(max_ele);
    }
}
