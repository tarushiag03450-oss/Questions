import java.io.*;
import java.util.*;
class UserMainCode{
	public int EvenDigitsSum(int input1){
		int c=0;
		while(input1>0){
			if((input1%10)%2==0) c+=(input1%10);
			input1/=10;
		}
		return c;
	}
}
