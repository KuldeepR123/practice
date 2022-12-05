package com.example.string;

public class NumberDivide {
    private static final int divisor = 3;
    public static void main(Long number){
        while (!Long.toString(number).equals("")){
            int length = Long.toString(number).length();
            int reminder = length%divisor;
            if(reminder==0){
                String sub = Long.toString(number).substring(0,divisor);
                if(!Long.toString(number).substring(divisor,length).equals("")){
                    ZeroToNineteen.getNumber((long) number,length,sub.length(),sub);
                    number = Long.parseLong(Long.toString(number).substring(divisor,length));
                }
                else break;
            }
            else{
                String sub = Long.toString(number).substring(0,reminder);
                if(!Long.toString(number).substring(reminder,length).equals("")){
                    ZeroToNineteen.getNumber((long) number,length,sub.length(),sub);
                    number = Long.parseLong(Long.toString(number).substring(reminder,length));
                }
                else break;
            }
        }
    }
}
