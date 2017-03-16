import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaloriesProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        int temp;
        for(int calories_i=0; calories_i < n; calories_i++){
            for(int calories_j=0; calories_j < n-1; calories_j++){
            if(calories[calories_j] < calories[calories_j+1])
		{
		temp=calories[calories_j+1];
		calories[calories_j+1]=calories[calories_j];
		calories[calories_j]=temp;
		}
        }
        }
        
        // your code goes here
        long miles = 0;
        for(int calories_i=0; calories_i < n; calories_i++){
           miles = miles + (long)(calories[calories_i] * Math.pow(2,calories_i));
        }
        
        System.out.println(miles);
    }
}