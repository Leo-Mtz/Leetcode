import java.util.ArrayList;
import java.util.List;

public class FizzBuzz{
    public static void main(String[] args) {

        int n=10;
        ArrayList <String> answers= new ArrayList<>();

        for(int i=1;i<=n;i++)
        {
            boolean mod3= i%3==0;
            boolean mod5 = i%5==0;
            String string1="";

            if(mod3 && mod5){
                string1+="FizzBuzz";
            }
            else if(mod3){
                string1+="Fizz";
            }
            else if(mod5){
                string1+="Buzz";
            }
            else{
                string+= String.valueOf(i);
            }

            return answer; 
        }

    }

}