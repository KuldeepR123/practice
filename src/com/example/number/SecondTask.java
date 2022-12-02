package com.example.number;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count=0;
        int start=1;
        while(count!=n){
            System.out.println(start);
            start+=2;
            count++;
        }
    }
}
