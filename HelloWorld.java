/*Link: https://www.hackerrank.com/challenges/30-hello-world */

import java.io.*;
import java.util.*;
import java.text.*;
//import java.math.*;
import java.util.regex.*;

public class HelloWorld {
	public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Close the scanner object, because we've finished reading 
                // all of the input from stdin needed for this challenge.
		scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
      
	       // TODO: Write a line of code here that prints the contents of inputString to stdout.
                System.out.println(inputString); //This is the only change that was required ;)
	}
}

/*Test:

Input (stdin)

Welcome to 30 Days of Code!

Your Output (stdout)

Hello, World.
Welcome to 30 Days of Code!

Expected Output

Hello, World.
Welcome to 30 Days of Code!

*/
