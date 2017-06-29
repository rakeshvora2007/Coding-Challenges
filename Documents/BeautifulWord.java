import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulWord {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        // Print 'Yes' if the word is beautiful or 'No' if it is not.
        char[] a = w.toCharArray();
        char[] vowel = {'a','e','i','o','u','y'};
        int flag = 1;
        int cons = 0;
        
        for(int i = 0; i<a.length-1; i++){
            
            if(a[i] == a[i+1]){
                flag=0;
                break;
            }
            
            for(int j=0; j<vowel.length-1; j++){
                if(vowel[j]==(a[i]) || vowel[j]==(a[i+1])){
                    cons++;
                }
            }
        }
        
        if(flag==0 || cons==2){
            System.out.println("No");
        }else if(flag==1){
            System.out.println("Yes");
        }
    }
}
