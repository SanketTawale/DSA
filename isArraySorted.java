package DSA;

public class isArraySorted {
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if(array[i]<array[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array={2,3,4,5,6,7,8,9};
        System.out.println(isSorted(array));
    }
}
