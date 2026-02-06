import java.io.*;
import java.util.*;
class UserMainCode{
	public int EvenOddDigitsSum(int input1,char input2){
		int e=0,d=0;
    	while(input1>0){
        if((input1%10)%2==0) e+=(input1%10);
        else d+=(input1%10);
        input1/=10;
    	}
    	if(input2.equals("even")) return e;
    	else return d;
    }
}
