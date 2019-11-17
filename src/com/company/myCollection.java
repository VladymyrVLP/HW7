package com.company;


import java.util.Arrays;

public class myCollection <E> {

   // private final int sizeColl = 10;
    private E[] array ;
    private int count = 0;

    public myCollection(){
        array = (E[]) new Object[0];
    }

    public boolean add(E item){

        if (count == array.length) {
              E[] newArray = array;
              array = (E[]) new Object[newArray.length+1];
              System.arraycopy(newArray,0,array,0,newArray.length);
             // array = newArray;
              array[array.length-1] = item;
              count++;
        }
          return true;
    }


    public void delete(int index){
        E[] newArray = array;
        array = (E[]) new Object[newArray.length-1];
        System.arraycopy(newArray,0,array,0,index);
        int elemAfterIndex = newArray.length - index -1;
        System.arraycopy(newArray,index+1 ,array, index,elemAfterIndex);

    }

    public E get (int index){
       return (E) array[index];
    }

    public int size(){
        return count;
    }

    @Override
    public String toString() {
        return "myCollection{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
