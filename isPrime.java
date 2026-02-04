import java.io.*;
import java.util.*;
class UserMain{
  public int isPrime(int input1){
    for(int i=0;i*i<=input1;i++){
      if(input1%i==0){
        return 1;
      }
    }
    return 2;
  }
}
