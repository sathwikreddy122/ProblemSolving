import java.util.*;
public class recursion {
    static int superDigit(int n, int superDigit, int i){
        if(n < 10){
            System.out.println(n);
           return n; 
        }
        i = n % 10;
        superDigit += i;
        System.out.println(superDigit);
        return superDigit(n%10, superDigit, i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//5
        int superDigit = 0;
        int i = 0;
        superDigit(n, superDigit, i);
        sc.close();
    }
}
