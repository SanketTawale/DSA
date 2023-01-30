package DSA;

import java.util.Scanner;

public class PowerOf2 {
    static boolean powerOf2(int n){
        if(n==0){
            return false;
        }
        return  (n & (n-1))==0;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(powerOf2(n));
    }
}
