import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        
       int swapReturn= bubbleSort(a);
        
        System.out.format("Array is sorted in %d swaps.",swapReturn);
        System.out.println();
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
        
        
    }
    
    
    
    public static int bubbleSort(int arr[])

	{
        int temp;
        int swap=0;

		for(int x=0; x<arr.length-1;x++)
		{
			
			for(int y=0;y<arr.length-x-1;y++)
			{
				
				if(arr[y]>arr[y+1])
				{
					temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
                    
                    swap++;
				}
			}
			
			
		}
        
        return swap;
	}
}
