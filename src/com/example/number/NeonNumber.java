package com.example.number;

public class NeonNumber {
    public static void main(String[] args) {
        int number = 19;
        int square = number*number;
        int sum=0;
        while(square>0){
            int reminder = square%10;
            sum+=reminder;
            square/=10;
        }
        boolean check = sum==number;
        System.out.println(check);
    }
}
