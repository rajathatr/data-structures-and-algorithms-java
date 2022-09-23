package com.rajath;

import com.rajath.data_structures.DoublyLinkedList;
import com.rajath.data_structures.DynamicArray;

public class Main {

    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray();
        dynamicArray.add(10);
        dynamicArray.add(1);
        dynamicArray.add(45);
        dynamicArray.add(100);
        dynamicArray.remove(10);
        System.out.println(dynamicArray.toString());
        System.out.println(dynamicArray.size());

        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(10);
        doublyLinkedList.add(20);
        doublyLinkedList.add(30);
        doublyLinkedList.remove(20);
        System.out.println(doublyLinkedList.toString());
    }
}
