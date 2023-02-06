package DSA;

public class MoveZeroToEnd {
    public static void moveZero(int[] nums) {
        int nz = 0, z = 0;
        int size = nums.length;
        if (size == 0 || size == 1) {
            return;
        }
        while (nz < size) {
            if (nums[nz] != 0) {
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 10, 22, 8, 0, 5, 0};
        moveZero(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
