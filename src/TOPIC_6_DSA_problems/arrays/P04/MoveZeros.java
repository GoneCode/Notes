package Arrays.easy.P04;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] arr = {1,0,3,0,4,5};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int i = 0; // Pointer for placing non-zero elements

        // Place all non-zero elements at the front
        for (int num : nums) {
            if (num != 0) {
                nums[i++] = num;
            }
        }

        // Fill the remaining array with zeros
        while (i < nums.length) {
            nums[i++] = 0;
        }
    }

}
