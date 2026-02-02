import java.io.*;
import java.util.*;
class UserMain{
  public int isOdd(int input1){
    if(input1!=0 && input1%2!=0){
      return 2;
    }else if(input1%2==0){
      return 1;
    }
throw new UnsupportedOperationException("isOdd(int input1)");
}
