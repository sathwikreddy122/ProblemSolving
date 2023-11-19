public class problem17 {
    public static void main(String[] args) {
        //Pattern program 2
        int n = 5;
        for(int i = 0; i < n; i++){
            if(i == 0 || i == n-1){
                for(int j = 0; j < n; j++){
                    System.out.print("* ");
                }
            }
            else{
                for(int k = 0; k < n; k++){
                    if(k == 0){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("");
                    }
                }
            }
            System.out.println();
        }
    }
}
