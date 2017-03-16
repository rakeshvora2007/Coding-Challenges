import java.io.*;
import java.util.*;

public class Rotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            b[(i+d)%n] = a[i];
        }
        
        for(int i=0; i<n; i++){
            System.out.print(b[i] + " ");
        }
    }
}