package DSA;

public class CountOfSmallElement {
    static int countOfSmallAndEqualElement(int[] array, int key) {
        int low = 0, high = array.length - 1, mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (key == array[mid]) {
                while (mid + 1 < array.length && array[mid + 1] == key) {
                    mid++;
                }
                break;
            } else if (key < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (array[mid] > key) {
            return mid;
        } else {
            return mid + 1;
        }
    }

    public static void main(String[] args) {
        //int[] array={2,6,12,18,21,26,33,43};
        // int[] array = {2, 6, 12, 18, 21, 26, 26, 26};
        int[] array = {2, 6, 12, 24, 20, 26, 28, 30};

        int key = 25;
        System.out.println(countOfSmallAndEqualElement(array, key));
    }
}
