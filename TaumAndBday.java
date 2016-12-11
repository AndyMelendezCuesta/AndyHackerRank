/*Link: https://www.hackerrank.com/challenges/taum-and-bday?h_r=next-challenge&h_v=zen*/

/*Given code:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
        }
    }
}
*/

/* Problem Statement
Taum is planning to celebrate the birthday of his friend Diksha. There are two types of gifts that Diksha wants from Taum: one is black and the other is white. To make her happy, Taum has to buy B number of black gifts and W number of white gifts.
The cost of each black gift is X units
and the cost of every white gift is Y units
and the cost of converting each black gift into white or white into black is Z units.
Help Taum by deducing the minimum amount he needs to spend on Diksha's gifts?
Input Format
The first line will contain an integer T which will be the number of test cases.
There will be T pair of lines. The first line of each test case will contain the value of integers B and W. Another line of each test will contain the value of integers X,Y and Z.
Constraints 
1<=T<=10 
0<=X,Y,Z,B,W<=10^9
Output Format
T lines each containing output for a particular test case.

Sample Input

5
10 10
1 1 1
5 9
2 3 4
3 6
9 1 1
7 7
4 2 1
3 3
1 9 2

Sample Output

20
37
12
35
12

Explanation

    Sample Case #01:
    There is no benefit to converting the white gifts into black or the black gifts into white, so Taum will have to buy each gift for 1 unit. So cost of buying all gifts will be: 10*1 + 10*1 = 20.

    Sample Case #02:
    Again, we can't decrease the cost of black or white gifts by converting colors. We will buy gifts at their original price. So cost of buying all gifts will be: 5*2 + 9*3 = 10 + 27 = 37.

    Sample Case #03:
    We will buy white gifts at their original price, 1. For black gifts, we will first buy white one and color them to black, so that their cost will be reduced to 1+1=2. So cost of buying all gifts will be: 3*2 + 6*1=12.

    Sample Case #04:
    Similarly, we will buy white gifts at their original price, 2. For black gifts, we will first buy white one and color them to black, so that their cost will be reduced to 2+1=3. So cost of buying all gifts will be: 7*3 + 7*2=35.

    Sample Case #05: We will buy black gifts at their original price, 1. For white gifts, we will first black gifts worth 1 unit and color them to white with another units, so cost for white gifts is reduced to units. So cost of buying all gifts will be: 3*1 + 3*3 = 3+9 = 12.


 */
 
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TaumAndBday {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 */
		Scanner stdin = new Scanner(System.in);
		
		//Parses the number of cases
		int numberOfCases = Integer.parseInt(stdin.nextLine());
		int B = 0;
		int W = 0;
		int X = 0;
		int Y = 0;
		int Z = 0;
		BigInteger cost = new BigInteger("0");
		BigInteger bestBlackCost = new BigInteger("0");
		BigInteger bestWhiteCost = new BigInteger("0");
		BigInteger netBlackCost = new BigInteger("0");
		BigInteger netWhiteCost = new BigInteger("0");
		for(int a = 0; a < numberOfCases; a++){
		
		//Parse the value of B and W
		B = stdin.nextInt();
		W = stdin.nextInt();
		stdin.nextLine();
		
		//Parse the value of X, Y, and Z
		X = stdin.nextInt();
		Y = stdin.nextInt();
		Z = stdin.nextInt();
		
		//Find the best cost for a Black or White piece, taking the minimum of the direct cost or the conversion from white to black.
		bestBlackCost = new BigInteger("" + Math.min(X, Y+Z));
		bestWhiteCost = new BigInteger("" + Math.min(Y, X+Z));
		
		netBlackCost = bestBlackCost.multiply(new BigInteger(B + ""));
		netWhiteCost = bestWhiteCost.multiply(new BigInteger(W + ""));
		
		System.out.println(netBlackCost.add(netWhiteCost));
		}
	}
}

/*Test


Input (stdin)

5
10 10
1 1 1
5 9
2 3 4
3 6
9 1 1
7 7
4 2 1
3 3
1 9 2

Your Output (stdout)

20
37
12
35
12

Expected Output

20
37
12
35
12


*/
