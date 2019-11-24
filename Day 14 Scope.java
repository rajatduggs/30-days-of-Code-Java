import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

  		// Add your code here
 public Difference(int []arr)
 {
     
     this.elements = arr;
 }
public void computeDifference()
{
    bubbleSort(elements);
    
    maximumDifference=Math.abs(elements[0]- elements[(elements.length-1)]);
    
}

public static void bubbleSort(int arr[])

	{
        int temp;

		for(int x=0; x<arr.length-1;x++)
		{
			
			for(int y=0;y<arr.length-x-1;y++)
			{
				
				if(arr[y]>arr[y+1])
				{
					temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
			
			
		}


	}
	} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}