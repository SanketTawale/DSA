package DSA;

import java.util.Scanner;

public class PrintAllDivisor {

/*
  static void printDivisor(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    */

    static  void printAllDivisors(int n){
        int i=0;
        for (  i= 1; i * i < n; i++) {
            if(n %i==0){
                System.out.print(i + " ");
            }
        }
        for (; i >= 1 ; i--) {
            if(n %i==0 && i != n/i){
                System.out.print(n/i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= scanner.nextInt();
        //printDivisor(n);
        printAllDivisors(n);
    }
}
