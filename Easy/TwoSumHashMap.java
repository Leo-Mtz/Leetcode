package Easy;

import java.util.HashMap;

public class TwoSumHashMap {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        
        return result;
        
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new TwoSumHashMap().twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
}
    
}
