    import java.io.*;
    import java.util.*;

    public class Staircase {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();

            for(int k=1;k<=n;k++){
                for(int i=n; i>k; i--){
                     System.out.print(" ");
               }

                for(int j=0; j<k; j++){
                System.out.print("#");
            }
             System.out.println();   
          }
       }
    }