package com.example.string.method;

import com.example.string.constant.Thousand;
import com.example.string.constant.ZeroToNine;

public class TwoDigits {
    public static void setString(int n){
        int count=0;
        for(int i=0; i<2; i++){
            int firstDigit = Integer.parseInt(Integer.toString(n).substring(count,count+1));
            switch (i){
                case 0:
                    Thousand.getFirstDigit(firstDigit);break;
                case 1:
                    ZeroToNine.getFirstDigit(firstDigit);break;
            }
            count+=3;
        }
    }
}
