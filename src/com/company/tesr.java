package com.company;

import java.util.Arrays;

public class tesr {


    public static void main(String[] args) {
        Square3x3 square3x3 = new Square3x3();
        Boolean[] booleans = new Boolean[9];
        Arrays.fill(booleans, false);

        square3x3.whosThereCol(2,booleans);
        System.out.println(square3x3.toString() + square3x3.allThere());
        for (Boolean aBoolean : booleans) System.out.print(aBoolean + " ");

    }
}