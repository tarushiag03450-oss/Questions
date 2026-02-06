import java.io.*;
import java.util.*;
class UserMainCode{
	public int digitsSum(int input1){
		int n=Math.abs(input1);
        while(n>9){
            int sum=0;
            while(n>0){
                int a=n%10;
                sum +=a;
                n/=10;
            }
            n=sum;
        }
        if(input1>0) return n;
        else return -(n);
    }
}
