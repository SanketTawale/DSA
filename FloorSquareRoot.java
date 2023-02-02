package DSA;

public class FloorSquareRoot {
    private static int sqrt(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int low = 2, high = n / 2;
        int result = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                low = mid + 1;
                result = mid;
            } else {
                high = mid - 1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int n = 300;
        System.out.println(sqrt(n));
    }
}
