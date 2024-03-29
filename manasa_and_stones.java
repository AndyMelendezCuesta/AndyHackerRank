/*Link: https://www.hackerrank.com/challenges/manasa-and-stones?h_r=next-challenge&h_v=zen*/

//Given code:
/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
    }
}*/
//
import java.io.*;

public class manasa_and_stones{
    
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(byte T = Byte.parseByte(br.readLine()); T > 0; --T){
            short N = Short.parseShort(br.readLine());
            short A = Short.parseShort(br.readLine());
            short B = Short.parseShort(br.readLine());
            
            //Each stones's difference has two choices: Either it's A or B
            //If we have 4 stones, that's 2^3 different permutations
            //But the order does not matter: 
            //    AAB's last stone == ABA's last stone == BAA's last stone
            // The only thing that matters is the amount of A's and B's
            //If we make sure A <= B, we know A * N is the min value for last stone.
            //Then we switch each stone consecutively from A to B 
            //by adding the difference of A and B, resulting in min to max last stone values
            
            //Make sure A <= B
            if (A > B){
                short temp = A;
                A = B;
                B = temp;
            }
            
            //Get min value of last stone (all A's)
            //There are N-1 gaps between stones
            int val = ((int)--N)*A;
            
            //Calculate change in val per switch to B
            short dval = (short)(B - A);
            
            //Print possible last stone values from smallest to largest
            //Avoid duplicate prints if A == B (dval == 0)
            sb.append(val);
            if (dval > 0){
                while(N-- > 0){
                    sb.append(" " + (val += dval));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}

/*Test:


Input (stdin)

2
3
1
2
4
10
100

Your Output (stdout)

2 3 4
30 120 210 300

Expected Output

2 3 4
30 120 210 300

*/
