package com.example.number;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp=n;
        String num = "";
        while(temp>0){
            int reminder = temp%10;
            num+=reminder;
            temp/=10;
        }
        boolean check = Integer.parseInt(num)==n;
        System.out.println(check);
    }
}
