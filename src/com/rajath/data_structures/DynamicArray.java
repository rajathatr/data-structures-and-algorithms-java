package com.rajath.data_structures;

import java.util.Iterator;

public class DynamicArray <T> implements Iterable<T>{

    private T[] arr;
    private int length = 0; //length of the array
    private int capacity = 0; //Actual array size

    public DynamicArray() {

        this.capacity = 16;
        arr = (T[]) new Object[capacity];
    }

    public DynamicArray(int capacity) {
        if(capacity < 0)
            throw new IllegalArgumentException("Illegal capacity : " + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size(){
        return length;
    }

    public boolean isEmpty(){
        return size()==0 ;
    }

    public T get(int index){
        return arr[index];
    }

    public void set(int index,T element){
        arr[index] = element;
    }

    public void clear(){
        for(int i=0;i<capacity;i++)
            arr[i]=null;
        length = 0;
    }

    public void add(T element){
        if(length + 1 >= capacity){
            if(length == 0)
                capacity = 1;
            else
                capacity *= 2;
            T[] new_arr = (T[]) new Object[capacity];
            for (int i=0;i<length;i++)
                new_arr[i] = arr[i];
            arr = new_arr;
        }
        arr[length++] = element;
    }

    public T removeAt(int removeIndex){
        if(removeIndex < 0 || removeIndex > length)
            throw new IndexOutOfBoundsException();
        T data = arr[removeIndex];
        T[] new_arr = (T[]) new Object[length -1];
        for (int i=0,j=0;i<length;i++,j++){
            if(i==removeIndex)
                j--;
            else
                new_arr[j] = arr[i];
        }
        arr = new_arr;
        capacity = --length;
        return data;
    }

    public boolean remove(Object object){
        for (int i=0;i<length;i++){
            if(arr[i].equals(object)){
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object object){
        for (int i=0;i<length;i++){
            if(arr[i].equals(object))
                return i;
        }
        return -1;
    }

    public boolean contains(Object object){
        return indexOf(object) != -1;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < length;
            }

            @Override
            public T next() {
                return arr[index++];
            }
        };
    }

    @Override
    public String toString(){
        if(length == 0)
            return "[]";
        StringBuilder sb = new StringBuilder(length).append("[");
        for(int i=0;i<length-1;i++){
            sb.append(arr[i] + ", ");
        }
        return sb.append(arr[length-1]+"]").toString();
    }
}
