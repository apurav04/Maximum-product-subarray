package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr=new int[5];
        Scanner s= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int product=maximunsubarray(arr);
        System.out.println("Product ="+product);

    }
    public static int maximunsubarray(int[] arr){
        int result=Integer.MIN_VALUE;
        int product=1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                product=1;
                for(int k=i;k<=j;k++){
                    product=product*arr[k];
                }
                result=Math.max(result,product);
            }
        }
        return product;
    }
}
