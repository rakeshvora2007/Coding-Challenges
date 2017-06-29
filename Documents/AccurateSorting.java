import java.util.*;

public class AccurateSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            // Write Your Code Here
            int flag = 1;
            for(int i=0; i<n; i++){
                for(int j=i; j<n-1; j++){
                    
                    if(a[j]>a[j+1] && (a[j] - a[j+1] == 1)){
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                    else if(a[j+1]>a[j]){
                    }
                    else{
                        flag = 0;
                        break;
                    }
                }
            }
            
            if(flag==1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
