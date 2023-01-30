package DSA;

import java.util.Scanner;

public class Lcm {

    private static int findLcm(int a, int b) {
        return (a * b) / optimizedEuclidGcd(a, b);
    }

    private static int optimizedEuclidGcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter the number 2: ");
        int b = scanner.nextInt();

        System.out.println("Lcm is " + findLcm(a, b));
    }
}

