package com.zufrost.learn;

import java.util.Objects;

public class Program {
    public static void main(String[] args) {
        A a1 = new A(1);
        A a2 = new A(1);
        System.out.print(a1 == a2);
        System.out.print(", " + a1.equals(a2));
        System.out.print(", " + Objects.equals(a1, a2));
        System.out.print(", " + Objects.deepEquals(a1, a2));
    }
}