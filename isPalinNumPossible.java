import java.util.*;
import java.io.*;
class UserMainCode{
	public int isPalinNumPossible(int input1){
		int[] fre=new int[10];
		while(input1>0){
			fre[input1%10]++;
			input1/=10;
		}
		int c=0;
		for(int i=0;i<10;i++){
			if(fre[i]%2!=0) c++;
		}
		if(c<=1) return 2;
		else return 1;
	}
}
