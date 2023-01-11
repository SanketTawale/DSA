package DSA;

import java.util.Scanner;

public class AllPrimeFactor {
    static void allPrimeFact(int n) {
        //Brute Force
        int i = 2;
        while (n > 1) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
            i++;
        }
    }

    static void allPrimeFactors(int n) {
        int i = 2;
        while (i * i <= n) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
            i++;
        }
        if (n > 1) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no  : ");
        int n = scanner.nextInt();
        // allPrimeFact(n);
        allPrimeFactors(n);
    }
}
