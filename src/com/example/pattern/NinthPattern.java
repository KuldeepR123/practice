package com.example.pattern;

public class NinthPattern {
    private static void getPattern(int n){
        if(n!=1 && n%2!=0){
            int firstHalf = (n/2)+1;
            for(int i=0; i<firstHalf; i++){
                for(int k=0; k<firstHalf-i-1; k++){
                    System.out.print("   ");
                }
                for(int j=0; j<=i; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            for(int i=n;i>firstHalf-1;i--){
                for(int k=0; k<n-i+1; k++){
                    System.out.print("   ");
                }
                for(int j=firstHalf+1; j<=i; j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Invalid input");
        }
    }
    public static void main(String[] args) {
        NinthPattern.getPattern(7);
    }
}
