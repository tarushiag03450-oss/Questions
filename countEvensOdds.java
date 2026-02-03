import java.io.*;
import java.util.*;
class UserMain{
  public int countEvensOdds(int input1,int input2,int input3,int input4,int input5){
    int evencount=0;
    int oddcount=0;
    if(input1%2==0){
      evencount++;
    }else{
      oddcount++;
    if(input2%2==0){
      evencount++;
    }else{
      oddcount++;
    if(input3%2==0){
      evencount++;
    }else{
      oddcount++;
    if(input4%2==0){
      evencount++;
    }else{
      oddcount++;
    if(input5%2==0){
      evencount++;
    }else{
      oddcount++;
    return evencount;
    return oddcount;
  }
}
