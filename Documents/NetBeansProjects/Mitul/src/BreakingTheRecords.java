import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingTheRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        // your code goes here
        
        int bestrecordcount = 0;
        int worstrecordcount = 0;
        int bestcomparator = score[0];
        int worstcomparator = score[0];
        
        for(int score_i=1; score_i < n; score_i++){
            
            if(bestcomparator<score[score_i]){
                bestcomparator = score[score_i];
                bestrecordcount++;
            }
            
            if(worstcomparator>score[score_i]){
                worstcomparator = score[score_i];
                worstrecordcount++;
            }
            
        }
        
        System.out.println(bestrecordcount +" "+ worstrecordcount);
        
        
    }
}
