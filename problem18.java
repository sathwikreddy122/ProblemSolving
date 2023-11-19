public class problem18 {
    public static void main(String[] args) {
        //Pattern program 3.
        int n = 5;
        for(int i = 0; i < n; i++){
            if(i == 0 || i == n-1){
                for(int j = 0; j < n; j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int j = 0; j < n; j++){
                    if(j == n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" "+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
