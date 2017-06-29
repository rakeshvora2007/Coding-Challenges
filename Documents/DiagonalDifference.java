import java.io.*;
import java.util.*;

public class DiagonalDifference {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sum1 = 0;
        int sum2 = 0;
        int ans = 0;
        int i,j;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        for(i=0, j=n-1; i<n && j>=0; i++, j--){
            sum1 = sum1 + a[i][i];
            sum2 = sum2 + a[i][j];
        }
        
        if(sum1>sum2){
            ans = sum1 - sum2;
        }
        else{
            ans = sum2 - sum1;
        }
        
        System.out.println(ans);
            
        }
    }
