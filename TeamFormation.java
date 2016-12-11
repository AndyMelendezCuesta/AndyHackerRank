/*Link: https://www.hackerrank.com/challenges/team-formation?h_r=next-challenge&h_v=zen*/
/**Details of Challenge: https://thenewphalls.wordpress.com/2016/05/28/a-quirky-solution-to-hackerranks-team-formation-problem/*/
/*Given code
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

public class TeamFormation {
   public class Node{
       int data;
       int size = 1; 
       Node next;
   void append(Node newNode){
       if(!newNode){
           system.out.println("newNode was NULL");
       }
       size ++ ;
       next = newNode;
       newNode.next = null ; 
   }
   boolean contains(int target){
       Node ptr = next;
       for(int i=0;i<size;i++){
           if(ptr.data == target){
               return true;
           }
       }
   }
}
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for(int i=0;i<cases;i++){
            int smallestTeam, people;
            people = in.nextInt();
            Node[] teams = new Node[people];  
            for(int j=0;j<people;j++){
                
            }
        }    
        a = in.nextInt();
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    
}

/*Test
*/
