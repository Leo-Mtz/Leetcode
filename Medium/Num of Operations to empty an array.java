import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 2, 2, 4, 2, 3, 3, 4};
        minOperations(nums);
    }

    public static void minOperations(int[] nums) {
        Arrays.sort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
