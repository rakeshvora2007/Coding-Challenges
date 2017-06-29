import java.io.*;
import java.util.*;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[6][6];
        
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int max = -63;
        int sum;
        for(int i=1; i<5; i++){
            for(int j=1; j<5; j++){
                
                sum = a[i][j] +  a[i-1][j] + a[i+1][j] + a[i-1][j-1] + a[i-1][j+1] + a[i+1][j-1] + a[i+1][j+1];
                
                if(sum>max){
                    max = sum;
                }
               
            }
        }
        System.out.println(max);
        
    }
}