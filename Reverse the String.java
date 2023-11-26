#Reverse the String
in O(1) space complexity 

question:
You are given a string 'STR'. The string contains [a-z] [A-Z] [0-9] [special characters]. You have to find the reverse of the string.

For example:

If the given string is: STR = "abcde". You have to print the string "edcba".

solution-->

  
import java.util.* ;
import java.io.*; 
public class Solution {	
	public static String reverseString(String str) {
				// Write your code here.
		 char[] newStrArray= str.toCharArray();
		 int left=0;
		 int right=newStrArray.length-1;
		 while(left<right){
			 char temp=newStrArray[left];
			 newStrArray[left]=newStrArray[right];
			 newStrArray[right]=temp;

			 left++;
			 right--;
		 }
		 return new String(newStrArray);
	}
}
