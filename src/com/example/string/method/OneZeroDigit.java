package com.example.string.method;

import com.example.string.constant.ElevenToNineteen;
import com.example.string.constant.TenToTwenty;
import com.example.string.constant.Thousand;
import com.example.string.constant.ZeroToNine;

public class OneZeroDigit {
    public static void setString(int n) {
        int count=0;
        String string = Integer.toString(n);
        if (Integer.toString(n).charAt(2) == '1') {
            for(int i=0; i<2; i++){
                int firstDigit = Integer.parseInt(Integer.toString(n).substring(count,count+1));
                switch (i){
                    case 0:
                        Thousand.getFirstDigit(firstDigit);break;
                    case 1:
                        ElevenToNineteen.setNumber(firstDigit);
                }
                count+=3;
            }
        }
        else if(Integer.toString(n).charAt(3)!=0){
            for(int i=0; i<string.length(); i++){
                int firstDigit = Integer.parseInt(Integer.toString(n).substring(i,i+1));
                if(firstDigit!=0){
                    switch (i){
                        case 0: Thousand.getFirstDigit(firstDigit);break;
                        case 2:
                            TenToTwenty.setNumber(firstDigit);break;
                        case 3:
                            ZeroToNine.getFirstDigit(firstDigit);break;
                    }
                }
            }
        }
    }
}
