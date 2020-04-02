import java.io.*;
import java.util.*;
import java.io.*;
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testCases=sc.nextInt();
        long  mod =2*10^9L;
            
        while(testCases>=1 && testCases<=30)
            {
                int n=sc.nextInt();
                if(n>=1)
                {
                    findPrimeNumber(n);
                }
                else
                {
                    System.out.println("Wrong input");
                }
                testCases--;
            }
            
    }

    static void findPrimeNumber(int num)
    {
        if(num<=1)
        {
            System.out.println("Not prime");   
        }
        else if (num==2)
        {
            System.out.println("Prime");
        }
        else
        {
            int count=0;
            for(int i=2;i<=Math.sqrt(num);i++)
            {
                if(num%i==0)
                {
                    count=1;
                    System.out.println("Not prime");
                    break;
                }
            }
            if(count==0)
            {
                System.out.println("Prime");
            }
        }
    }
}
