import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan1 = new Scanner(System.in);
        int time =scan1.nextInt();
        scan1.nextLine();
        
        while(time>0)
            {
        	
   
        String str= scan1.nextLine();
     
        
        char arr[] = str.toCharArray();
        int len= str.length();
        
        for(int x=0;x<len;x=x+2)
            {
            
            System.out.print(arr[x]);
            
            }
        
        System.out.print(" ");
        
         for(int x=1;x<len;x=x+2)
            {
            
            System.out.print(arr[x]);
         }
        
        System.out.println();
        
        time--;
        }  
    }
}