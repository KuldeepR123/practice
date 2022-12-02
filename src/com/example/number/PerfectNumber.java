package com.example.number;

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 6;
        int sum=0;
        for(int i=1; i<number; i++){
            if(number%i==0){
                sum+=i;
            }
        }
        boolean check = sum==number;
        System.out.println(check);
    }
}
