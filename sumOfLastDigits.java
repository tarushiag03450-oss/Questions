import java.io.*;
import java.util.*;
class UserMain{
  public int addLastDigits(int input1,int input2){
    input1=Math.abs(input1);
    int lastdigit=input1%10;
    input2=Math.abs(input2);
    int secondlast=input2%10;
    int sum=lastdigit+secondlast;
    return sum;
  }
}
