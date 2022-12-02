package com.example.pattern;

public class SeventhPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0; i<n; i++){
            if(i==0 || i==n-1){
                for(int k=0; k<n; k++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            for(int j=0;j<n;j++){
                if(i!=n-1 && (j==0 || j==n-1)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
