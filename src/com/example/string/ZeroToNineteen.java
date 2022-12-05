package com.example.string;


public class ZeroToNineteen {
    public static void getNumber(Long number, int length, int subLength, String subString) {
        final String[] zeroToNineteen = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        final String[] tenMultiplier = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        System.out.println(subString.equals(""));
        while (!subString.equals("")) {
            if (subLength == 1) {
                Main.sb.append(zeroToNineteen[Integer.parseInt(subString)] + " ");
                StringPrint.setString(length);
                subString = subString.substring(subString.length());
                subLength -= 1;
                ZeroToNineteen.getNumber(number, length, subLength, subString);
            }
            else if (subLength == 2) {
                Main.sb.append(tenMultiplier[Integer.parseInt(subString.substring(0, 1)) - 2] + " ");
                int num = Integer.parseInt(subString) - (Integer.parseInt(subString.charAt(0) + "0"));
                subString = subString.substring(subString.length() - 1);
                subLength-=1;
                ZeroToNineteen.getNumber(number, length, subLength, subString);
            }
            else {
                Main.sb.append(zeroToNineteen[Integer.parseInt(subString.substring(0, 1))] + " hundred ");
                int num = Integer.parseInt(subString) - (Integer.parseInt(subString.charAt(0) + "00"));
                subString = subString.substring(subString.length() - 2);
                subLength-=1;
                ZeroToNineteen.getNumber(number, length, subLength, subString);
            }
        }
    }
}


