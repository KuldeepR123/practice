package com.example.string;

import java.util.Scanner;

public class Main {
    public static StringBuilder sb =  new StringBuilder("");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Long n = scan.nextLong();
//        int length = Calculate.lengthCalculate(n);
        NumberDivide.main(n);
        System.out.println(sb);
    }
}
