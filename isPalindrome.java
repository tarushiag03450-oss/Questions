import java.util.*;
import java.io.*;
class UserMaincode{
	public int isPalindrome(string input1){
		String s=input1.toUpperCase();
		int len=s.length();
		char[] ar=s.toCharArray();
		int c=0;
		for(int i=0;i<len;i++){
			if(ar[i]==ar[len-1-i]){
				c++;
			}
		}
		if(c==len) return 2;
		else return 1;
	}
}
