package com.example.string.constant;

import com.example.string.Constants;
import com.example.string.method.WordToString;

public class ElevenToNineteen {
    public static void setNumber(int n){
        switch (n){
            case 1:
                WordToString.sb.append(Constants.ELEVEN + " ");break;
            case 2:WordToString.sb.append(Constants.TWELVE + " ");break;
            case 3: WordToString.sb.append(Constants.THIRTEEN + " ");break;
            case 4: WordToString.sb.append(Constants.FOURTEEN + " ");break;
            case 5: WordToString.sb.append(Constants.FIFTEEN + " ");break;
            case 6: WordToString.sb.append(Constants.SIXTEEN + " ");break;
            case 7: WordToString.sb.append(Constants.SEVENTEEN + " ");break;
            case 8: WordToString.sb.append(Constants.EIGHTEEN + " ");break;
            case 9: WordToString.sb.append(Constants.NINETEEN + " ");break;
        }
    }
}
