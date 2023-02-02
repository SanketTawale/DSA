package DSA;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] array={2,2,3,3,4,6,6};
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] +" ");
        }
        int rd=removeDuplicate(array);
        System.out.println();
        for (int i = 0; i <= rd; i++) {
            System.out.print( array[i] +" ");
        }
    }

    private static int removeDuplicate(int[] array) {
        int rd=0;
        for (int i = 2; i < array.length; i++) {
            if(array[rd]!=array[i]){
                rd++;
                array[rd]=array[i];
            }
        }
        return rd;
    }
}
