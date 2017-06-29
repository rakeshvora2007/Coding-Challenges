import java.io.*;
import java.util.*;

public class SparseArrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        
        for(int i=0; i<n; i++){
            str[i] = sc.nextLine();
        }
        
        int q = sc.nextInt();
        String[] qwry = new String[q];
        
        for(int i=0; i<q; i++){
            qwry[i] = sc.nextLine();
        }
        
        int count=0;
        for(int i=0; i<n;i++){
            for(int j=0; j<q; j++){
                if(qwry[i].equals(str[j])){
                    count++;
                }
                
            }
            System.out.println(count);
            count=0;
        }
        
    }
}