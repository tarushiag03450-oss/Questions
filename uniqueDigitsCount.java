import java.io.*;
import java.util.*;
class UserMainCode{
	public int uniqueDigitsCount(int input1){
		int[] arr=new int[10];
		int c=0;
		while(input1>0){
			arr[input1%10]++;
			input1/=10;
		}
		for (int i=0;i<10 ;i++ ) {
			if(arr[i]>0) c++;
		}
		return c;
	}
}
