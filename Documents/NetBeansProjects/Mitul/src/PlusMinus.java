import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        double positive = 0, zero = 0, negative = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            if(a[i]>0){
                positive++;
            }else if(a[i]<0){
                negative++;
            }else{
                zero++;
            }
        }
        
        double positivefraction = (double)(positive/n);
        double negativefraction = (double)(negative/n);
        double zerofraction =(double)(zero/n); 
        
        System.out.println(positivefraction);
        System.out.println(negativefraction);
        System.out.println(zerofraction);
    }
}