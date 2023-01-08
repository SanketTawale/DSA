package DSA;
import java.util.Scanner;
/*
*         Find the Number Of Trailing Zeros In A Factorial
 * */
public class TrailingZeros {
    static int trailing(int n){
        int result=0;
        int powerOf5=5;
        while (n >= powerOf5){
            result = result + (n/powerOf5);
            powerOf5 = powerOf5 * 5;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= scanner.nextInt();
        System.out.println("Trailing zero of"+n+" : "+trailing(n));
    }
}
