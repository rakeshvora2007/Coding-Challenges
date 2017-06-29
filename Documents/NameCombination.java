


public class NameCombination {
    public static void main(String[] args) {
        
        String[] A1 = {"quick", "slow"};
        String[] A2 = {"cat","dog"};
        String[] A3 = {"brown","black","red"};
        
        for (int i = 0; i < A1.length; i++) {
        for (int j = 0; j < A2.length; j++) {
        for (int k = 0; k < A3.length; k++) {
            
            System.out.println(A1[i]+" "+A2[j]+ " "+A3[k] );
        }    
        }    
        }
    }
    
}
