package com.company.Pract;

import java.util.Scanner;

class Pair{
    void pair(int [] arr, int k ){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i]+arr[j])%k == 0){
                    System.out.println("Pair : "+(i+1)+","+(j+1));
                }
            }
        }
    }
}
public class PairCriteria {
    public static void main(String[] args) {
        Pair p =new Pair();
        int [] arr ={1, 2, 3, 4, 5, 6};
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        p.pair(arr, k);
    }
}
