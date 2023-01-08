package DSA;
import java.util.Scanner;
/*
*       How To Count The Number Of Digits In A Number?
* */
public class Counter {
    public static int getCounter(int n){
        int counter=0;
        while(n>0){
            n=n/10;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= scanner.nextInt();
        System.out.println("No of digit in number : "+getCounter(n));
    }
}
