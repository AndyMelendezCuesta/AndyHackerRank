/*Link: https://www.hackerrank.com/challenges/acm-icpc-team?h_r=next-challenge&h_v=zen*/
/*

Problem Statement
You are given a list of N people who are attending ACM-ICPC World Finals. Each of them are either well versed in a topic or they are not. Find out the maximum number of topics a 2-person team can know. And also find out how many teams can know that maximum number of topics.
Note Suppose a, b, and c are three different people, then (a,b) and (b,c) are counted as two different teams.
Input Format
The first line contains two integers, N and M, separated by a single space, where Nrepresents the number of people, and M represents the number of topics. N lines follow.
Each line contains a binary string of length M. If the ith line's jth character is 1, then the ithperson knows the jth topic; otherwise, he doesn't know the topic.
Constraints
2≤N≤500
1≤M≤500
Output Format
On the first line, print the maximum number of topics a 2-person team can know.
On the second line, print the number of 2-person teams that can know the maximum number of topics.
Sample Input

4 5
10101
11100
11010
00101

Sample Output

5
2

Explanation
(1, 3) and (3, 4) know all the 5 topics. So the maximal topics a 2-person team knows is 5, and only 2 teams can achieve this.
*/

/*
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
    }
}
*/

import java.io.*;

public class ACM_ICPC_Team {

    public static void main(String[] args) throws IOException {
        
        //Receiving input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        short N = Short.parseShort(input[0]);
        short M = Short.parseShort(input[1]);
        byte[][] topics = new byte[N][M];
        for(short i = 0; i < N; ++i){
            char[] arr = br.readLine().toCharArray();
            for(int j = 0; j < M; ++j){
                topics[i][j] = (byte)(arr[j] - '0');
            }
        }
        
        //Solution Approach
        short numTeams = 0;
        short maxTopics = 0;
        for(short i = 0; i < N; ++i){
            for(short j = (short)(i+1); j < N; ++j){
                short numTopics = 0;
                for(short k = 0; k < M; ++k){
                    numTopics += topics[i][k] | topics[j][k];
                }
                if (maxTopics < numTopics){
                    numTeams = 1;
                    maxTopics = numTopics;
                } else if(maxTopics == numTopics){
                    ++numTeams;
                }
            }
        }
        
        //result
        System.out.println(maxTopics);
        System.out.print(numTeams);
    }
}

/*Test:
nput (stdin)

4 5
10101
11100
11010
00101

Your Output (stdout)

5
2

Expected Output

5
2
*/
