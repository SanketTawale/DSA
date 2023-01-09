package DSA;

import java.util.Scanner;

public class PrimeRange {

    static  void primeRange(int start, int end){
        for (int i = start; i <= end ; i++) {
            if (checkPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean checkPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i < n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }


    static void sievePrime(int start , int end){
        boolean[] prime =new boolean[end+1];
        for (int i = start; i*i <= end; i++) {
            if (prime[i]==false){
                for (int j = i * i; j <= end ; j=j+i) {
                    prime[j]=true;
                }
            }
        }
        for (int i = start; i <= end ; i++) {
                if(prime[i]== false){
                    System.out.print(i + " ");
                }
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter start value : ");
        int start=scanner.nextInt();
        System.out.print("Enter end value : ");
        int end=scanner.nextInt();
        primeRange(start,end);
        sievePrime(start,end);

    }
}
