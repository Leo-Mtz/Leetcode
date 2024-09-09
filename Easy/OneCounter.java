


public class OneCounter {

    public static void main(String[] args) {
        
        int [] nums = {1,0,1,1,0,1};
        Solution solution   = new Solution();

        int maxConsecutiveOnes = solution.findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes);
        
    }


}


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int onecounter=0;
        int maxcounter=0;

        for( int i=0; i<nums.length; i++)
        {

            if(nums[i]==1)
            {
                onecounter++;

                if( onecounter > maxcounter)

                {
                    maxcounter = onecounter;
                }
            }

            else{
                onecounter=0;
            }

        }

        
        return maxcounter;
        
    }
}


