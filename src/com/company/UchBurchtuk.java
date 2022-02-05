package com.company;

public class UchBurchtuk {
    int a;// 10
    int b;// 10
    int c;// 10

    void area(int a, int b, int c) {
        int ayant = (a + b + c ) /2;
        System.out.println(" jalpy aynty " + Math.sqrt(ayant*(ayant - a) * (ayant - b) * (ayant - c)));
    }
}