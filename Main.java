package com.company;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Main extends Thread {

    public static void main(String[] args) {
       int a=3,b=4,c=5;
        System.out.println(m(a,b));
        System.out.println(m(a,b,c));
        System.out.println(VyrahuvatySerednie(1,2,3,4,5,6,7));
        System.out.println(VyrahuvatySerednie(2,5,7,34,654,1,4324,123,421,12,513,1234,3432,12314,2));
    }
    private static double VyrahuvatySerednie(int... chysla){
        int suma=0;
        for(int i:chysla)
            suma+=i;
        return (double) suma/chysla.length;
    }
    private static int m(int a,int b){
        return a+b;
    }
    private static int m(int a, int b, int c){
        return a+b+c;
    }
}


