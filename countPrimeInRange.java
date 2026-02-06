import java.io.*;
import java.util.*;
class UserMainCode{
	public int countPrimeInRange(int input1, int input2){
		int c=0;
		for(int i=input1;i<(input2+1);i++){
			int a=0;
			for(int j=0;j<i;j++){
				if(i%j==0) a++;
			}
			if(a>0) continue;
			else c++;
		}
		return c;
	}
}
