package com.example.string.constant;

import com.example.string.Constants;
import com.example.string.method.WordToString;

public class Hundred {
    public static void getFirstDigit(int n){
        switch (Integer.parseInt(Integer.toString(n))){
            case 1:
                WordToString.sb.append(Constants.ONE + " " + Constants.HUNDRED + " ");break;
            case 2:WordToString.sb.append(Constants.TWO + " " + Constants.HUNDRED + " ");break;
            case 3: WordToString.sb.append(Constants.THREE + " " + Constants.HUNDRED + " ");break;
            case 4: WordToString.sb.append(Constants.FOUR + " " + Constants.HUNDRED+ " ");break;
            case 5: WordToString.sb.append(Constants.FIVE + " " + Constants.HUNDRED+ " ");break;
            case 6: WordToString.sb.append(Constants.SIX + " " + Constants.HUNDRED+ " ");break;
            case 7: WordToString.sb.append(Constants.SEVEN + " " + Constants.HUNDRED+ " ");break;
            case 8: WordToString.sb.append(Constants.EIGHT + " " + Constants.HUNDRED+ " ");break;
            case 9: WordToString.sb.append(Constants.NINE + " " + Constants.HUNDRED+ " ");break;
        }
    }
}
