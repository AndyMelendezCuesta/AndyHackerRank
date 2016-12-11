
/*Link: https://www.hackerrank.com/challenges/caesar-cipher-1?h_r=next-challenge&h_v=zen*/

//Given code:
/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
    }
}*/ 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CeasarCipher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numChars = Integer.parseInt(sc.nextLine());
        char[] inputString = sc.nextLine().toCharArray();
        int rotateValue = sc.nextInt();
        for(int i = 0;i<numChars;i++){
        
            char currentChar = inputString[i];
            if(Character.isLetter(currentChar)){
                char rotatedChar = (char)((int)currentChar+rotateValue%26);
                if(Character.isUpperCase(currentChar)){
                    inputString[i] = ((int)rotatedChar<=90)?rotatedChar:(char)((rotatedChar-(int)'Z')+(int)'A'-1);
                }else{
                    inputString[i] =((int)rotatedChar<=122)?rotatedChar:(char)((rotatedChar-(int)'z')+(int)'a'-1);
                } 
            }
        }
        System.out.println(inputString);
    }
}

/*Tests:


Input (stdin)

11
middle-Outz
2

Your Output (stdout)

okffng-Qwvb

Expected Output

okffng-Qwvb


*/
