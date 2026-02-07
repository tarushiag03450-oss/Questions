import java.io.*;
import java.util.*;
class UserMainCode{
	public int MostFrequentDigit(int input1,int input2,int input3,int input4){
		int[] arr=new int[10];
        input1=Math.abs(input1);
        input2=Math.abs(input2);
        input3=Math.abs(input3);
        input4=Math.abs(input4);
        
        if(input1==0) arr[0]++;
        if(input2==0) arr[0]++;
        if(input3==0) arr[0]++;
        if(input4==0) arr[0]++;
        
        while(input1>0){
            arr[input1%10]++;
            input1/=10;
        }
        while(input2>0){
            arr[input2%10]++;
            input2/=10;
        }
        while(input3>0){
            arr[input3%10]++;
            input3/=10;
        }
        while(input4>0){
            arr[input4%10]++;
            input4/=10;
        }
        int max=arr[0];
        int c=0;
        for(int i=0;i<10;i++){
            if(arr[i]>=max){
                max=arr[i];
                c=i;
            }
        }
        return c;
    }
}
