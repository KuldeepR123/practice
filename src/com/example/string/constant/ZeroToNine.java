package com.example.string.constant;

import com.example.string.Constants;
import com.example.string.method.WordToString;

public class ZeroToNine {
    public static void getFirstDigit(int n){
        switch (Integer.parseInt(Integer.toString(n))){
            case 0:WordToString.sb.append(Constants.ZERO);break;
            case 1:
                WordToString.sb.append(Constants.ONE);break;
            case 2:WordToString.sb.append(Constants.TWO);break;
            case 3: WordToString.sb.append(Constants.THREE);break;
            case 4: WordToString.sb.append(Constants.FOUR);break;
            case 5: WordToString.sb.append(Constants.FIVE);break;
            case 6: WordToString.sb.append(Constants.SIX);break;
            case 7: WordToString.sb.append(Constants.SEVEN) ;break;
            case 8: WordToString.sb.append(Constants.EIGHT);break;
            case 9: WordToString.sb.append(Constants.NINE);break;
        }
    }
}
