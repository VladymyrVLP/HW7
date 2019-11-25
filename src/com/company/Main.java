package com.company;


import java.util.ArrayList;
import java.util.Collection;

public class Main {


    public static void main(String[] args) {
        // write your code here
        //Collections col1= creatFirstCollections();

         myCollection MyCollection = new myCollection();
         MyCollection.add("1");
         MyCollection.add("2");
         MyCollection.add("3");
         MyCollection.add("4");
         MyCollection.add("5");
         MyCollection.add("6");
         MyCollection.add("7");
         MyCollection.add("8");
         MyCollection.add("9");
         MyCollection.add("10");
         MyCollection.add("11");
         MyCollection.add("12");
         MyCollection.add("13");

         myCollection newCollect = MyCollection;
         System.out.println(MyCollection.toString());
         System.out.println(MyCollection.getsize());
         System.out.println(MyCollection.get(5));
         MyCollection.delete(5);
         System.out.println(MyCollection.get(5));
         System.out.println(MyCollection.toString());
         System.out.println(MyCollection.contains("10"));
         System.out.println(MyCollection.indexOf("13"));
         System.out.println(MyCollection.equals(newCollect));
         MyCollection.clear();
         System.out.println(MyCollection.getsize());

    }
}
