
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rakesh J
 */
public class JavaAnagrams {
    
   static boolean isAnagram(String a, String b) {
    
   Boolean retValue = false;
   if(a != null && b != null) {
       char [] arrayA = a.toLowerCase().toCharArray();
       char [] arrayB = b.toLowerCase().toCharArray();
       Arrays.sort(arrayA);
       Arrays.sort(arrayB);
       retValue = Arrays.equals(arrayA, arrayB);
   }
   return retValue;   
        
    }
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        boolean val = isAnagram(a, b);
        System.out.println( (val) ? "Anagram" : "Not Anagrams");
    }
    
}
