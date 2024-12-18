public class Anagram {

    public boolean isAnagram(String s, String t)
    
    {

        if(s.length()!=t.length())
        {
            return false;
        }

        int alphabet[]=new int[26]; 
        String s1= s.toLowerCase();
        String t1= t.toLowerCase();

        //ciclo para calcular las instancias de cada letra en cada string
        for ( int i=0; i<s.length();i++) 
        {
        
            alphabet[s1.charAt(i)-'a']++; 
            //overwriting the value of the array by adding, with each iteration ... [0,0,1,0,1,0....]
            //se resta el valor ASCII de a "97" a cada letra charAt(i) para obtener su posicion en el alfabeto, una vez hecho eso, se le suma una
            alphabet[t1.charAt(i)-'a']--; //se resta el valor ASCII de a "97" a cada letra charAt(i) para obtener su posicion en el alfabeto, una vez hecho eso, se le resta una
           //overwritinh the value of the array by substracting, with each iteration ... [0,0,0,0,99,0....]
           
            // si la diferencia es mayor a cero, entonces no es anagrama
            
            
        }


        //ciclo para comprobar que todas las instancias de la letra sean cero
        for ( int i=0; i<alphabet.length;i++)
        {

            // si la instancia de la letra es distinta a cero, entonces no es anagrama
            if(alphabet[i]!=0)
            {
                return false;
            }

        }

        //si llega hasta aqui, es anagrama
        return true;


    }
}
