import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfTwoStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum;
        int count = 0;
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] b = new int[m];
            for(int b_i=0; b_i < m; b_i++){
                b[b_i] = in.nextInt();
            }
            
            
            
                
            sum=a[0];
            // your code goes here
                for(int a_i=1; a_i < n-1;){
                    for(int b_i=0; b_i < m;){
                        
                        while(sum<=x){
                        if(a[a_i] + b[b_i] > a[a_i] + a[a_i+1]){
                            sum = a[a_i] + b[b_i];
                             b_i++;
                            count++;
                        }
                        else{
                            sum = a[a_i] + a[a_i+1];
                            a_i++;
                            count++;
                        }
                        
                        }
                    }
                }
                }
        System.out.println(count);
    }
}
