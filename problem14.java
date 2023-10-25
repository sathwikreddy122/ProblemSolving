
public class problem14 {
    public static void main(String[] args) {
        //Find index of given number
        int[] arr = {1, 2, 3, 4, 5, 5};
        int n = arr.length;
        int key = 5;
        int start = 0;
        int end = n-1;
        while (start < end) {
            if(arr[start] != key){
                start++;
            }
            else if(arr[end] != key){
                end--;
            }
            else{
                System.out.println(start + " " + end);
                break;
            }
        }
    }
}
