import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}


//Write your code here
class Calculator implements AdvancedArithmetic
{

@Override 
public int divisorSum(int n)
{
int sum = n;
for(int x=1;x<=n/2;x++)
{

if(n%x==0)
{
sum = sum + x;
}

}
return sum;
}

}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}