import java.lang.*;
import java.io.*;
import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        
        Solution solucion= new Solution();
        SolucionEficiente solucionEficiente= new SolucionEficiente();

        solucion.isPalindrome(123);
        solucionEficiente.isPalindrome(121);
    }
}



class SolucionEficiente {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // The number is a palindrome if the first half and the reversed second half are the same.
        // For numbers with an odd number of digits, we get rid of the middle digit by dividing by 10.
        return x == reversedHalf || x == reversedHalf / 10;
    }
}


class Solution {

    //las operaciones de cadena son más costosas en terminos de rendimineto y memoria 
    public boolean isPalindrome(int x) {

        String numero= Integer.toString(x);

        //se crea un nuevo obj de la clase StringBuilder para poder usar el metodo .reverse
        StringBuilder stringinverso= new StringBuilder();

        stringinverso.append(numero);
        stringinverso.reverse();

        String inverso= stringinverso.toString();

        if(numero.equalsIgnoreCase(inverso))
        {
            System.out.println("Palindrome");
            return true;
        }
        else{
            System.out.println("Not a palindrome");
            return false;
        }
    }
}


