import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        //Count the number of digits in number.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n != 0){
            int x = n % 10;
            count += 1;
            n = n / 10;
        }
        System.out.println(count);
    }
}
