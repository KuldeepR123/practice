package com.example.string.constant;

import com.example.string.Constants;
import com.example.string.method.WordToString;

public class Thousand {
    public static void getFirstDigit(int n){
        switch (n){
            case 1:
                WordToString.sb.append(Constants.ONE + " "+ Constants.THOUSAND + " ");break;
            case 2:WordToString.sb.append(Constants.TWO + " "+ Constants.THOUSAND+ " ");break;
            case 3: WordToString.sb.append(Constants.THREE + " "+ Constants.THOUSAND+ " ");break;
            case 4: WordToString.sb.append(Constants.FOUR + " "+ Constants.THOUSAND+ " ");break;
            case 5: WordToString.sb.append(Constants.FIVE + " "+ Constants.THOUSAND+ " ");break;
            case 6: WordToString.sb.append(Constants.SIX + " "+ Constants.THOUSAND+ " ");break;
            case 7: WordToString.sb.append(Constants.SEVEN + " "+ Constants.THOUSAND+ " ");break;
            case 8: WordToString.sb.append(Constants.EIGHT + " "+ Constants.THOUSAND+ " ");break;
            case 9: WordToString.sb.append(Constants.NINE + " "+ Constants.THOUSAND+ " ");break;
        }
    }
}
