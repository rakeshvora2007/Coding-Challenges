import java.io.*;
import java.util.*;


public class NegativeSortingProblem{
public static void main(String args[])
{	
	int[] a = {-10,20,-30,5,1,9,-7};
	int temp;
	
	for(int i=0;i<a.length-1;i++)
	{	
	for(int j=0;j<a.length-1;j++)
	{
		if(a[j]>0 &&a[j+1]<0)
		{
		temp=a[j+1];
		a[j+1]=a[j];
		a[j]=temp;
		}
	}
	}

        for (int i = 0; i < a.length; i++) {
        System.out.println("Value: "+a[i]);
    }

	
}
}

