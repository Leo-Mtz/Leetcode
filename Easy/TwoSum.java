import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int [] nums= {2,7,11,15};
        int target= 12;
        boolean found= false;
        
        int result[]= new int[2];
        
        for(int i=0; i<nums.length;i++){

            for(int j= i+1; j<nums.length; j++) //ayuda a evitar duplicados y simplifica el proceso de búsqueda de pares únicos de índices en el arreglo
                                                //aumenta para seguir comparando
            {
                if( nums[i]+nums[j]== target){
                    result[0]= i;
                    result[1]=j;
                    found= true;

                }

            }
        }

        if(!found){
            System.out.println("Indices no encontrados");
        }

        else{
        System.out.println(Arrays.toString(result));
        }

    
    }
   
}
