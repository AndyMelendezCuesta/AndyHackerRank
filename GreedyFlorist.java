/*Link: https://www.hackerrank.com/challenges/greedy-florist?h_r=next-challenge&h_v=zen*/

/* GreedyFlorist
You and your K-1 friends want to buy N flowers. Flower number i has cost ci. Unfortunately the seller does not want just one customer to buy a lot of flowers, so he tries to change the price of flowers for customers who have already bought some flowers. More precisely, if a customer has already bought x flowers, he should pay (x+1)*ci dollars to buy flower number i.
You and your K-1 friends want to buy all N flowers in such a way that you spend the least amount of money. You can buy the flowers in any order.
Input:
The first line of input contains two integers N and K (K <= N). The next line contains N space separated positive integers c1,c2,...,cN.
Output:
Print the minimum amount of money you (and your friends) have to pay in order to buy all N flowers.
*/

/*Given code:
/* Sample program illustrating input/output methods */
import java.util.*;

class Solution{
   public static void main( String args[] ){
      
// helpers for input/output      

      Scanner in = new Scanner(System.in);
      
      int N, K;
      N = in.nextInt();
      K = in.nextInt();
      
      int C[] = new int[N];
      for(int i=0; i<N; i++){
         C[i] = in.nextInt();
      }
      
      int result = 0;
      System.out.println( result );
      
   }
}
*/

import java.io.*;
import java.util.*;

public class GreedyFlorist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> flowerPriceList = new ArrayList<Integer>();
        int numFlowers = sc.nextInt();
        int numFriends = sc.nextInt();
        for(int i = 0; i<numFlowers;i++){
            flowerPriceList.add(sc.nextInt());
        }
		// Sort the ArrayList in reverse order to start bying flowers from most expensive
        Collections.sort(flowerPriceList,Collections.reverseOrder());
        int flowersBought = 0;
        int friendNum = 0;
        int total = 0;
        for(int price:flowerPriceList){
			//itterate throught all the flower prices and calculate the total
            total +=(flowersBought+1)*price;
            friendNum++;
            if(friendNum == numFriends){
				//if all friends bought flowers reset the friend counter and restart the cycle
                friendNum = 0;
                flowersBought++;
            }
        }
        System.out.println(total);
    }
}


/*Test0:


Input (stdin)

3 3
2 5 6

Your Output (stdout)

13

Expected Output

13


*/

/*Test1:


Input (stdin)

3 2
2 5 6

Your Output (stdout)

15

Expected Output

15


*/
