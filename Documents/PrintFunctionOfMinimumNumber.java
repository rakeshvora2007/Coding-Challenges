/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rakesh J
 */
 import java.util.*;
public class PrintFunctionOfMinimumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder sbr = new StringBuilder("min(int, int)");
        StringBuilder sbr1 = new StringBuilder("min(int, ");
        
        if(n==0){
            System.out.println(sbr.toString());
        }
        else
            {
            
            for(int i=1; i<n-1;i++){
                sbr.insert(0, sbr1);
                sbr.append(")");
            }
            
            System.out.println(sbr.toString());
        }
    }
    
}

