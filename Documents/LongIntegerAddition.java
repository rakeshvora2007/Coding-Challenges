import java.io.*;
import java.util.*;

public class LongIntegerAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        long a[] = new long[n];
        
        for(int i=0; i<n; i++){
            a[i]=sc.nextLong();
        }
        
        long sum=0;
        
        
        for(int i=0; i<n; i++){
            sum = sum + a[i];
        }
        
    System.out.println(sum);
    }
}