
import java.util.Scanner;

public class RandomNumberAllocationUsingPrimes {   
    public static String answer(int n) { 
    StringBuilder sb = new StringBuilder();
    sb.append("2");
    int i = 3;
    while (i<=10000){
        int flag=0;
        int k = i/2;
        for(int j = 2; j<=k; j++){
            
        if(i%j==0){
            i++;
            flag=1;
            break;
        }
        }
        
        if(flag==0){
           sb.append(i);
           i++;
        }
        
    }    String s = sb.substring(n%10000, ((n%10000)+5));
            return s;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(answer(n));
    }
}