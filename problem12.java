import java.util.HashMap;

public class problem12 {
    public static void main(String[] args) {
        //First element to occur k times
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        int k = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int  i : arr){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }
            else{
                map.put(i, map.get(i) + 1);
            }
            if(map.get(i) >= k){
                System.out.println(i);
                break;
            }
        }
    }
}
