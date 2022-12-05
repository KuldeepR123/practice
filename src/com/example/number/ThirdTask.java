package com.example.number;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int step = scan.nextInt();
        int start = 1;
        for(int i=0; i<n; i++){
            System.out.println(start);
            start+=step+1;
        }
    }
}
