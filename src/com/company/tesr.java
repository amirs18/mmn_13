package com.company;

import java.util.Arrays;

public class tesr {


    public static void main(String[] args) {
        Square3x3 square3x3 = new Square3x3();
        Boolean[] booleans = new Boolean[9];
        for (int i=0;i<booleans.length;i++)
            booleans[i]=false;

        square3x3.whosThereCol(1,booleans);
        System.out.println(square3x3.toString() + square3x3.allThere());
        for (int i=0;i<booleans.length;i++)
            System.out.print(booleans[i]+" ");

    }
}