public class problem2 {
    public static void main(String[] args) {
        //To find minimun number in array
        int[] arr = {2,3,1,4,6,8,5,8,4};
        int n = arr.length;
        int min_num = arr[0];
        for(int i = 1; i < n; i++){
            if(min_num > arr[i]){
                min_num = arr[i];
            }
        }
        System.out.println(min_num);
    }
}
