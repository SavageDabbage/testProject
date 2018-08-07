package com.example;

/**
 * Created by Aadi on 8/6/18.
 */

public class testIndexOf {
    public static void main(String[] args) {
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";

        //write code here
        System.out.println(str.indexOf("c"));
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf(target1));
        System.out.println(str.indexOf(target2));

    }
}
