import java.util.*;

public class GameOfZeroOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int[] sequence = new int[n];
            for(int sequence_i=0; sequence_i < n; sequence_i++){
                sequence[sequence_i] = in.nextInt();
            }
            // If Alice wins, print 'Alice' on a new line; otherwise, print 'Bob'
            
            
            int count = 2;
            for(int i=1; i<n-1; i++){
                
                if((sequence[i-1] == 0|| sequence[i-1] == 2) && (sequence[i+1] == 0|| sequence[i+1] == 2)){
                    sequence[i] = 2;
                    count++;
                }
                
            }
            
            for(int i=1; i<n-1; i++){
                
                if(sequence[i] == 0 && (sequence[i-1] == 0|| sequence[i-1] == 2) && (sequence[i+1] == 0|| sequence[i+1] == 2)){
                    sequence[i] = 2;
                    count++;
                }
                
            }
            
            
            
            if(count%2==0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Alice");
            }
            
        }
    }
}
