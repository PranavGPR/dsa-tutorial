package com.src;

// import java.util.Arrays;

public class Array {

    private int count;
    private int[] items;

    public Array(int arrayLength) {
        // count = arrayLength;
        items = new int[arrayLength];
    }

    public void insert(int item) {
        items[count++] = item;

        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
                items = newItems;
            }
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void removeAt() {

    }
}
