import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        //Reverse a number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        while(n != 0){
            int x = n  % 10;
            s += x;
            n = n / 10;
        }
        System.out.println(s);
    }
}
