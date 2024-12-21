public class ArrayConcatenation {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = getConcatenation(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
}


public static int[] getConcatenation(int[] nums) {


    int length= nums.length;

    int [] newarray= new int [length * 2];

    // System.arraycopy(sourceArray, sourcePosition, destinationArray, destinationPosition, number of elements to copy);
/* // Copy all elements from the nums array starting at position 0 
 into the newarray starting at position 0, for the entire length of nums.

 */
    System.arraycopy(nums,0,newarray,0,length);
    System.arraycopy(nums,0,newarray,length,length);

    return newarray;
    }
}