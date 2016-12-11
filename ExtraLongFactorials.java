/*Link: https://www.hackerrank.com/challenges/extra-long-factorials?h_r=next-challenge&h_v=zen*/

/*Problem statement:
You are given an integer N. Print the factorial of this number.
                          N! = Nx(N-1)x(N-2)x...x3x2x1
Input
Input consists of a single integer N, where 1<= N <=100.

Output
Print the factorial of N.

Example
For an input of 25, you would print 15511210043330985984000000.

Note: Factorials of N>20 can't be stored even in a 64-bit long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.

We recommend solving this challenge using BigIntegers. 
*/

/*Given code:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
    }
}
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        int factorial = input.nextInt();
        BigInteger product = BigInteger.valueOf(factorial);
        
        for (int i = (factorial - 1); i > 0; i--) {
            product = product.multiply((BigInteger.valueOf(i)));
        }
        
        System.out.println(product);
    }
}

/*Test:


Input (stdin)

25

Your Output (stdout)

15511210043330985984000000

Expected Output

15511210043330985984000000


*/
