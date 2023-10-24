import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        //Reverse a String.
        Scanner sc = new Scanner(System.in);   
        String str = sc.nextLine();
        int n = str.length();
        String s = "";
        for(int i = n-1; i >=0; i--){
            s += str.charAt(i);
        }  
        System.out.println(s);
        sc.close();   
    }
}
