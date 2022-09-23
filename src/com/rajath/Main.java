package com.rajath;

import com.rajath.data_structures.DynamicArray;

public class Main {

    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray();
        dynamicArray.add(10);
        dynamicArray.add(1);
        dynamicArray.add(100);
        dynamicArray.remove(10);
        dynamicArray.removeAt(1);
        System.out.println(dynamicArray.toString());
    }
}
