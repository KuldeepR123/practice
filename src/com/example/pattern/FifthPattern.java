package com.example.pattern;

public class FifthPattern {
    public static void main(String[] args) {
        for(int i=5; i>0; i--){
            for(int k=0; k<=5-i-1;k++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
