import java.io.*;
import java.util.*;
class UserMain{
  public int fabo(int input1,int input2){
    if(input1==0){
      return 0;
    }if(input1==1){
      return 1;
    }
    int a=0;
    int b=1;
    int result=0;
    for(int i=2;i<=input1;i++){
      result=a+b;
      a=b;
      b=result;
    }
    return result;
  }
}
