/* Application that inputs a line of token, tokenizes the line with String split method and outputs the String in reverse order
 * 
 */

package org.smaniulations;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String args[]){
		
		//System.out.println("Please enter a string");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String result[] = s1.split(" ");
		for(int x =result.length-1; x>=0;x--){
			System.out.print(result[x]+" ");
		}
	}

}
