/*Link: https://www.hackerrank.com/challenges/largest-permutation?h_r=next-challenge&h_v=zen*/

/*Problem Statement:
You are given an array of N integers which is a permutation of the first N natural numbers. You can swap any two elements of the array. You can make at most K swaps. What is the largest permutation, in numerical order, you can make?

Input Format
The first line of the input contains two integers, N and K, the size of the input array and the maximum swaps you can make, respectively. The second line of the input contains a permutation of the first N natural numbers.

Output Format
Print the lexicographically largest permutation you can make with at most K swaps. 

Constraints
1<=N<=10^5
1<=K<=10^9

Sample Input#00

5 1
4 2 3 5 1

Sample Output#00

5 2 3 4 1

Explanation#00
You can swap any two numbers in [4,2,3,5,1] and see the largest permutation is [5,2,3,4,1]

Sample Input#01

3 1
2 1 3

Sample Output#01

3 1 2

Explanation#01
With 1 swap we can get [1,2,3],[3,1,2] and [2,3,1] out of these [3,1,2] is the largest permutation.

Sample Input#02

2 1
2 1

Sample Output#02

2 1

Explanation#02
We can see that [2,1] is already the largest permutation. So we don't need any swaps. 
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

public class LargestPermutation {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //Get input
    String[] line = br.readLine().split(" ");
    final int N = Integer.parseInt(line[0]);
    final int K = Integer.parseInt(line[1]);
    final int[] A = new int[N];
    line = br.readLine().split(" ");
    for(int i = 0; i < N; ++i){
      A[i] = Integer.parseInt(line[i]);
    }
    line = null;

    //Create an array to show where each number currently is
    final int[] pos = new int[N+1];
    for(int i = 0; i < N; ++i){
      pos[A[i]] = i;
    }
    
    //Make at most K swaps to sort list in reverse chronological order:
    //  For each natural number 'i' from N to 1...
    for(int i = N, swaps = K; i > 0; --i){
      
      //Get the current position
      final int actualPos = pos[i];
      
      //Get the expected position when sorted in reverse
      final int expectedPos = N - i;
      
      //If 'i' is not in the correct place...
      if(actualPos != expectedPos){
        
        //Swap whatever's in i's place with i
        pos[A[expectedPos]] = actualPos;
        A[actualPos] = A[expectedPos];
        A[expectedPos] = i;
        
        //Stop sorting if we're out of swaps
        if(--swaps < 1){
          break;
        }
      }
    }
    
    //Print output
    StringBuffer sb = new StringBuffer();
    for(int i = 0; i < N; sb.append(A[i++] + " ")){}
    System.out.print(sb);
  }
}

/*
Test0
Input (stdin)
5 1
4 2 3 5 1
Your Output (stdout)
5 2 3 4 1 
Expected Output
5 2 3 4 1
*/

/*Test 1
Input (stdin)
3 1
2 1 3
Your Output (stdout)
3 1 2 
Expected Output
3 1 2
*/

/*Test 2
Input (stdin)
2 1
2 1
Your Output (stdout)
2 1 
Expected Output
2 1
*/
