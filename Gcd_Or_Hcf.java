package DSA;

import java.util.Scanner;

public class Gcd_Or_Hcf {
    //Question : program to find "The Greatest Common Divisor OR Highest Common Factor"


   /*   1:Method :---            Using Brute Force Method
   static int gcd(int a,int b){
        int min=0;
        if(a>b){
            min=a-b;//get the smaller number
        }
        else {
            min=b-a;
        }
        for (int i = min; i >= 1; i++) {      //for loop from that smaller number(min) to 1
            if(a%i==0 && b%i==0){             //always first match to this is Gcd or Hcf
                return i;
            }
        }
        return 1;
    }
    */

   /*     The Euclidean algorithm   :
                            1.) If a=b  stop --  Otherwise, go to step 2.
                            2.)If a > b, replace a with a - b  i.e. a=a-b , and go back to step 1.
                            3.)If b > a, replace b with b − a  i.e. b=b-a , and go back to step 1.


                static int euclidGcd(int a, int b){
                     while(a != b){
                         if(a>b){
                             a=a-b;
                         }else {
                             b=b-a;
                            }
                     }
                    return a;
                  }
     */
   private static int optimizedEuclidGcd(int a, int b) {
       /*The OptimizedEuclidean algorithm   :
                              1.)  If a=b  stop --  Otherwise, go to step 2.
                              2.)  If a > b, replace a with a % b  i.e. a= a % b , and go back to step 1.
                              3.)  If b > a, replace b with b % a  i.e. b= b % a , and go back to step 1.
       * */
       while (a!=0 && b!=0){
           if(a>b){
               a = a % b;
           }
           else {
               b = b % a;
           }
       }
       if( a!=0 ){
           return a;
       }
       else {
           return b;
       }
   }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a= scanner.nextInt();
        System.out.print("Enter the Second Number : ");
        int b= scanner.nextInt();
        //System.out.println("Gcd is : "+gcd(a,b));
        //System.out.println("Gcd is : "+euclidGcd(a,b));
        System.out.println("Gcd is : "+optimizedEuclidGcd(a,b));
    }
}
