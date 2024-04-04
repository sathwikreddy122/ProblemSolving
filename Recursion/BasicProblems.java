package Recursion;

import java.util.Scanner;

public class BasicProblems {
    // problem-1--> to print name for n times.
    static void printName(int n){
        if(n == 5){
            return;
        }
        else{
            System.out.println("Sathwik");
            n++;
            printName(n);
        }
    }

    // problem-2--> to print numbers from zero to n.
    static void printOneToN(int n){
        int i;
        if(n == 10){
            return;
        }
        else{
            i = n;
            System.out.println(i);
            n++;
            printOneToN(n);
        }
    }


    //problem-3--> to print numbers from n to zero.
    static void printNtoOne(int n){
        if(n == -1){
            return;
        }
        else{
            System.out.println(n);
            n--;
            printNtoOne(n);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // printName(n);
        // printOneToN(n);
        printNtoOne(n);
        sc.close();
    }
}