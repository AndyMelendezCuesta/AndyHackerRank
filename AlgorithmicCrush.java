/*https://www.hackerrank.com/challenges/crush?h_r=next-challenge&h_v=zen*/

/*Problem statement:
You are given a list of size N, initialized with zeroes. You have to perform M operations on the list and output the maximum of final values of all the N elements in the list. For every operation, you are given three integers a,b and k and you have to add value k to all the elements ranging from index a to b (both inclusive).

Input Format
First line will contain two integers N and M separated by a single space.
Next M lines will contain three integers a,b and k separated by a single space.
Numbers in list are numbered from 1 to N.

Output Format
A single line containing maximum value in the updated list.

Constraints
3<=N<=10^7
1<=M<=2*10^5
1<=a<=b<=N
0<=K<=10^9

Sample Input #00

5 3
1 2 100
2 5 100
3 4 100

Sample Output #00

200

Explanation

After first update list will be 100 100 0 0 0.
After second update list will be 100 200 100 100 100.
After third update list will be 100 200 200 200 100.
So the required answer will be 200.
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

public class AlgorithmicCrush {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		s = br.readLine().trim();
		st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long arr[]=new long[N+1];
    
		while(M>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st = new StringTokenizer(s);
                int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				long k=Long.parseLong(st.nextToken());
				arr[a]+=k;
                if(b<N)
				    arr[b+1]-=k;
				M--;
				
			}
		}
        long max=arr[1];
		for(int i=2;i<=N;i++)
		{
			arr[i]+=arr[i-1];
			if(max<arr[i])
                max=arr[i];
			
		}
        out.println(max);
        out.close();
		

	}

}

/*Test


Input (stdin)

5 3
1 2 100
2 5 100
3 4 100

Your Output (stdout)

200

Expected Output

200


*/
