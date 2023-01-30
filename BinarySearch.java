package DSA;
import java.util.Arrays;
public class BinarySearch {
    public static int BinarySearch(int[] a, int key) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {3, 5, 6, 8, 12, 15, 16, 13,19, 21};
        Arrays.sort(a);
        int key = 13;
        System.out.println("Key found at location : "+BinarySearch(a, key));
    }
}
