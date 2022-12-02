package com.example.string.constant;

import com.example.string.Constants;
import com.example.string.method.WordToString;

public class TenToTwenty {
    public static void setNumber(int n){
        switch (n){
            case 1: WordToString.sb.append(Constants.TEN + " ");break;
            case 2: WordToString.sb.append(Constants.TWENTY + " ");break;
            case 3: WordToString.sb.append(Constants.THIRTY + " ");break;
            case 4: WordToString.sb.append(Constants.FOURTY + " ");break;
            case 5: WordToString.sb.append(Constants.FIFTY + " ");break;
            case 6: WordToString.sb.append(Constants.SIXTY + " ");break;
            case 7: WordToString.sb.append(Constants.SEVENTY + " ");break;
            case 8: WordToString.sb.append(Constants.EIGHTY + " ");break;
            case 9: WordToString.sb.append(Constants.NINETY + " ");break;
        }
    }
}
