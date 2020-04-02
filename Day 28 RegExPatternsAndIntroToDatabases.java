import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
         String regex = "[a-z]+@gmail\\.com$";
        Pattern p = Pattern.compile(regex);
        List<String> nameList = new ArrayList<String>();
           

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

             Matcher m = p.matcher(emailID);
            if(m.find()) 
            {
                nameList.add(firstName);

            }
        }

        Collections.sort(nameList);
        for(String value: nameList)
        {
            System.out.println(value);
        }
        scanner.close();
    }
}
