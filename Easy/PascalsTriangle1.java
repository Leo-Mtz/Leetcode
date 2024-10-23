import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        // Initialize the result list to store all rows of Pascal's Triangle
        List<List<Integer>> result = new ArrayList<>();
        
        // Iterate through each row
        for (int i = 0; i < numRows; i++) {
            // Create a new list for the current row, starting with 1
            List<Integer> list = new ArrayList<>(Arrays.asList(1)); 
            
            // Fill in the middle elements by summing two adjacent elements from the previous row
            for (int j = 1; j < i; j++) {
                List<Integer> prev = result.get(i - 1); 
                list.add(prev.get(j - 1) + prev.get(j));
            }

            // If it's not the first row, add 1 at the end of the current row
            if (i > 0) {
                list.add(1);
            }
            
            // Add the current row to the result
            result.add(list);
        }

        // Return the generated Pascal's Triangle
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test the generate function with 5 rows
        List<List<Integer>> pascalTriangle = sol.generate(5);

        // Print the Pascal's Triangle row by row
        for (List<Integer> row : pascalTriangle) {
            System.out.println(row);
        }
    }
}
