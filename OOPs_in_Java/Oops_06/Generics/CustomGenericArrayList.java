package com.Kunal.Oops_06.Generics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]); // kyoki size++ ho rha hai aur waha koi element nhi hai tb ek previous ka hi delete hoga
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;

    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                " data = " + Arrays.toString(data) +
                ", size=" + size +
                '}';// we can also modify it only print till size.
    }

    public static void main(String[] args) {
/*
        ArrayList list = new ArrayList();
        list.add(45);
        list.remove(0);
        list.get(0);
        list.set(1, 6784);
        list.size();
        list.isEmpty();
*/

//        CustomArrayList list = new CustomArrayList();
//        list.add(5);
//        list.remove();
//        list.get(0);
//        list.set(1,2);
//        list.add(7);
//        list.add(9);

        // Problem in this arrayList that it can only allow for the Integers not for any other things but in
        // original arrayList we can any data items using some specifiers for ex
        //   ArrayList<Integer> l = new ArrayList<>(); this is only for Integer
        //   this (<Integer>) this is known as Generics
        // whatever things will come the place of Generics that will must be Class not primitive data types


//        for (int i = 0; i < 14; i++) {
//            list.add(2*i);
//        }
//
//        System.out.println(list);


        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        //list.add(34);
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list);
    }
}
