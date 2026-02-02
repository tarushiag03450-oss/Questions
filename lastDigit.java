import java.io.*;
import java.util.*;
class UserMain{
  public int lastDigitOf(int input1){
    input1=Math.abs(input1);
    int lastDigit=input1%10;
    return lastDigit;
  }
}
