import java.io.*;
import java.util.*;
class UserMainCode{
	public int allDigitCount(int input1){
		int c=0;
		while(input1>0){
			input1/=10;
			c++;
		}
		return c;
	}
}
