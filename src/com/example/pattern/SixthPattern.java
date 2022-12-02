package com.example.pattern;

public class SixthPattern {
    public static void main(String[] args) {
        int count=2;
        int n=10;
        for(int i=n; i>0; i--){
            if(i!=n){
                for(int k=0; k<count; k++){
                    System.out.print(" ");
                }
                count+=2;
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
