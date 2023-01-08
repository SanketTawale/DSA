package DSA;
import java.util.Scanner;
/*
*             How to Find Factorial of a Number in Java
* */
public class Factorial {

    public static int fact(int n){
        int res=1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=scanner.nextInt();
        System.out.println("factorial of "+n+": "+fact(n));
    }
}
