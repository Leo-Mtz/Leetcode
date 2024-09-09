import java.util.Scanner;

public class Halves {

    public static void main(String[] args) {
    

        
         Scanner sc= new Scanner(System.in);
        String s;
        char [] vowels= {'a','e','i','o','u','A','E','I','O','U'};
        int contarA=0;
        int contarB=0;
        boolean bandera=false;
            

        do {

        System.out.println("Escriba una palabra");
        
        s= sc.nextLine();
        
        
        } while (s.length() % 2!=0);
        
        sc.close();

        final int half= s.length()/2;
        String a= s.substring(0, half);
        String b= s.substring(half);

        for(int i=0; i<a.length();i++){
            if(vocal(a.charAt(i), vowels)){
                contarA++;
            }
        }

        for(int j=0; j<b.length();j++){
            if(vocal(b.charAt(j), vowels)){
                contarB++;
            }
        }

        if(contarA==contarB){
            bandera=true;
        }
        else{
            bandera=false;
        }

        System.out.println(bandera);

    }

    private static boolean vocal( char c, char vowels[]){

        for( int i=0; i<vowels.length;i++){
            if( c== vowels[i]){
                return true;
            }
        }

        return false;

    }

}
