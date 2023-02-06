package DSA;

public class ArrayRotation {
    /*
    * What does the rotation of the array mean?
    Consider an array 1,2,3,4,5 Rotating this array by 1 in counterclockwise means the newly rotated array will be 2,3,4,5,1.
    Similarly rotating this array by 2 counterclockwise means the newly rotated array will be 3,4,5,1,2.
    So we have to write a program to rotate an array by a given number k where the positive value of k denotes counterclockwise
    rotation and negative values of denote clockwise rotation.
     */

    /*
    static void rotateOne(int[] a) {
          int temp = a[0];
          for (int i = 1; i < a.length; i++) {
              a[i - 1] = a[i];
          }
          a[a.length - 1] = temp;
      }
     static void rotate(int[] a, int k) {
          k = k % a.length;
          if (k<0){
              k=k+a.length;
          }
          for (int i = 1; i <= k; i++) {
              rotateOne(a);
          }
      }
      */
    static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    static void rotate(int[] a, int k) {
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
        reverse(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 7;
        System.out.println("Before Array Rotation");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        rotate(a, k);
        System.out.println("After Array Rotation");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
