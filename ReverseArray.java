package DSA;

public class ReverseArray {
    static void reverse(int[] array) {
        int i = 0, j = array.length - 1;

        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int j : array) {
            System.out.print(j + " ");
        }
        reverse(array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
