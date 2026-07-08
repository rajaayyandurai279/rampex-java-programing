package day8.classtask;


import java.util.Arrays;
public class ArrayReversal_TwoPointer {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 6, 5, 4,};

        int n = nums.length;

        int left = 0;
        int right = n - 1;
        int temp;

        //for (int i = 1; i <= n/2; i++) {

        int count = 0;

        while (count < n/2) {

            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
            count++;

        }

        System.out.println(Arrays.toString(nums));
    }
}



