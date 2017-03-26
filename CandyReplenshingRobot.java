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

public class CandyReplenshingRobot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int ans = 0;
        int b = n;
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
        
        // your code goes here
        for(int c_i=0; c_i < t-1; c_i++){
            b = b - c[c_i];
            if(b<5){
                b=n;
                ans = 0;
                for(int i = 0; i<=c_i;i++){
                    ans = ans + c[i];
                }
           
        }
    }
        System.out.println(ans);
    }
}

