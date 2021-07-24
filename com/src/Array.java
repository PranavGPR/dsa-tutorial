package com.src;

import java.util.Arrays;

public class Array {

    int length = 0;

    Array(int arrayLength) {
        length = arrayLength;
    }

    int items[] = new int[length];

    int bigArray[] = new int[length + 1];

    public void insert(int a) {
        System.out.println(items.length);
        for (int i = 0; i < length; i++) {
            bigArray[i] = items[i];
        }
        bigArray[length] = a;
        System.out.println(Arrays.toString(bigArray));
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.println(items[i]);
        }
    }

    public void removeAt() {

    }
}
