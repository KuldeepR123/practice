package com.example.number;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count=0;
        int start = 1;
        while(count!=n){
            if(start%2!=0){
                System.out.println(start);
                count++;
            }
            start++;
        }
    }
}
