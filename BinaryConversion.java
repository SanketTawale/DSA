package DSA;

import java.util.Scanner;

public class BinaryConversion {
    static String DecimalToBinary(int n){
        String s="";
        while (n>=1) {
            int x = n % 2;
            n = n / 2;
            s=x + s;
        }
        return s;
    }

    static  int BinaryToDecimal(String b){
        int result=0, pow2=1;
        for (int i = b.length()-1; i >=0; i--) {
            if(b.charAt(i)=='1'){
                result=result + pow2;
            }
            pow2=pow2*2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= scanner.nextInt();
        String b= DecimalToBinary(n);
        System.out.println(b);
        System.out.println(BinaryToDecimal(b));
    }
}
