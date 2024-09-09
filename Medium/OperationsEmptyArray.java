
import java.util.Arrays;

public class OperationsEmptyArray {

    public static void main(String[] args) {
        int[] nums = {2,3,3,2,2,4,2,3,4};
        minOperations(nums);
    }

    //We sort the array to make it more efficient
    public static void minOperations(int[] nums) {
        Arrays.sort(nums);

        int current= nums[0]; //sets the current number to the first instance of nums
        int counter=0;
        int twice=0;
        int thrice=0;
        int totalOperations=0;

        //Iterate through the sorted array
        for(int i=0; i<nums.length;i++)
        {

            //compara si la iteración actual es igual a current

            //si la comparación es igual no sale de este if, y se aumenta hasta que se vea que no es igual
            if(nums[i]==current){ //current cambia con cada iteración

                //if it is , counter goes up
                counter++;
            }

            //if not equal , do this
            else{

                int operations = counter / 2 + (counter % 2 == 0 ? 0 : 1) + counter / 3;
                totalOperations += operations;
                System.out.println(totalOperations);

                //reseteo de variables

                //current pasa a ser la iteración actual de current
                current= nums[i];

                //counter es 1 ya que ese numero no se repite
                counter=1;
            }

        }

        int operations = counter / 2 + (counter % 2 == 0 ? 0 : 1) + counter / 3;
        totalOperations += operations;

        System.out.println(totalOperations);

        /*
        
        if(counter%2==0){
            twice++;
        }
        else if(counter%3==0){
            thrice++;
        }

         */
 
    }
}
