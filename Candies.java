/*Link: https://www.hackerrank.com/challenges/candies*/

/*Problem statement:
Alice is a kindergarden teacher. She wants to give some candies to the children in her class.  All the children sit in a line ( their positions are fixed), and each  of them has a rating score according to his or her performance in the class.  Alice wants to give at least 1 candy to each child. If two children sit next to each other, then the one with the higher rating must get more candies. Alice wants to save money, so she needs to minimize the total number of candies given to the children.

Input Format

The first line of the input is an integer N, the number of children in Alice's class. Each of the following N lines contains an integer that indicates the rating of each child.

Constraints
1<=N<=10^5
1<=ratingi<10^5

Output Format

Output a single line containing the minimum number of candies Alice must buy.

Sample Input

3  
1  
2  
2

Sample Output

4

Explanation

Here 1, 2, 2 is the rating. Note that when two children have equal rating, they are allowed to have different number of candies. Hence optimal distribution will be 1, 2, 1.
*/

/*Given code:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
    }
}
*/

import java.io.*;
import java.util.*;

public class Candies {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ar = new int[N];
        for(int i = 0; i < N; ar[i++] = Integer.parseInt(br.readLine())){}
        br.close();
        
        int[] cc = new int[N];
        cc[0] = 1;
        for(int i = 1; i < N; i++){
            cc[i] = 1;
            if (ar[i] > ar[i-1]){
                cc[i] += cc[i-1];
            } else {
                for(int j = i; j > 0 && ar[j] < ar[j-1] && cc[j] == cc[j-1]; cc[--j] += 1){}
            }
        }
        
        long sum = 0;
        for(int i = 0; i < N; sum += cc[i++]){}
        System.out.print(sum);
    }
}

/*Test0


Input (stdin)

3
1
2
2

Your Output (stdout)

4

Expected Output

4


*/

/*Test1


Input (stdin)

10
2
4
2
6
1
7
8
9
2
1

Your Output (stdout)

19

Expected Output

19


*/
