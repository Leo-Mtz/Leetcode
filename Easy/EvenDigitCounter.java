public class EvenDigitCounter {

    public static void main(String[] args) {
        int[] nums = {10, 1, 19, 102, 1102, 11111};
        Solution solution = new Solution();

        int result = solution.findNumbers(nums); // Store the result in a variable
        System.out.println(result); // Print the result
    }
}


class Solution {
    public int findNumbers(int[] nums) {
        int evennumbercounter = 0; // Count numbers with an even number of digits

        for (int i = 0; i < nums.length; i++) {
            int digitcounter = 0; // Reset digit counter for each number

            int num = nums[i]; // Make a copy of the current number
            //Using a copy of nums[i] ensures that the original array remains intact, allowing you to maintain the integrity of the data, making the program more robust and easier to understand or debug.


            // Count the number of digits
            while (num != 0) { 
                num /= 10; 
                digitcounter++; 
            }

            // Handle special case when num is 0 (as it would not enter the while loop)
            if (digitcounter == 0) {
                digitcounter = 1;
            }

            // Check if the number of digits is even
            if (digitcounter % 2 == 0) {
                evennumbercounter++;
            }
        }

        return evennumbercounter; // Return the count of numbers with even digits
    }
}
