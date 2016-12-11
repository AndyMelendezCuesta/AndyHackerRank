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
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    // Enter your code here. Read input from STDIN. Print output to STDOUT   
    return 0;
}
*/

#include <iostream>  
#include <algorithm>  
#include <cmath>  
#include <vector>  
#include <string>  
#include <cstring>  
#include <set>  
#include <queue>  
#include <stack>  
#include <map>  
using namespace std;  
typedef long long ll;  
  
#define INF 0x7fffffff  
const int maxn = 100005;  
  
int n, m;  
int rating[maxn];  
int dp1[maxn];  
int dp2[maxn];  
  
void input()  
{  
    int i;  
    scanf("%d", &n);  
    for (i = 1; i <= n; i++)  
    {  
        scanf("%d", &rating[i]);  
        dp1[i] = 1;  
        dp2[i] = 1;  
    }  
}  
  
void solve()  
{  
    int i;  
    for (i = 2; i <= n; i++)  
    {  
        if (rating[i] > rating[i - 1])  
        {  
            dp1[i] = dp1[i - 1] + 1;  
        }  
    }  
    for (i = n-1; i >=1 ; i--)  
    {  
        if (rating[i] > rating[i + 1])  
        {  
            dp2[i] = dp2[i + 1] + 1;  
        }  
    }  
    ll res = 0;  
    for (i = 1; i <= n; i++)  
    {  
        res += max(dp1[i], dp2[i]);  
    }  
    cout << res;  
}  
  
int main()  
{  
    //freopen("i.txt","r",stdin);  
    //freopen("o.txt","w",stdout);  
  
    input();  
    solve();  
  
    //system("pause");  
    return 0;  
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
