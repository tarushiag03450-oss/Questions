import java.io.*;
import java.util.*;
class UserMainCode{
	public int totalHillWeight(int input1,int input2,int input3){
		int weight=0;
        for(int i=0;i<input1;i++){ //rows
            for(int j=0;j<(i+1);j++){ //col
                weight+=input2;
            }
            input2+=input3;
        }
        return weight;
    }
}
