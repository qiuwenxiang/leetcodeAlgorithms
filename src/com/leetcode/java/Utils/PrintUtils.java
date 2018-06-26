package com.leetcode.java.Utils;


public class PrintUtils {

    public static void printArray(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        String s = "191. Number of 1 Bits";
        String title= "_"+s.replace(" ","").replace(".","");
        String md= s.replace(".","  ");
        System.out.println(title);
        System.out.println(md);
    }
}
