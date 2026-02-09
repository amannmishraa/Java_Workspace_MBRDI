package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList list=new ArrayList();
        List list=new ArrayList();
        list.add("Upasana");//String
        list.add(13);//Integer
        list.add(true);//Boolean
        list.add(12.55);//Double
        System.out.println(list);

        List<String> list1=new ArrayList();
        list1.add("Upasana");//String
        list1.add("Rita");//Integer
        list1.add("Gita");//Boolean
        list1.add("Virat");//Double
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
        List<Book> bookList=new ArrayList();
        Book b2=new Book(100,"Java","James Gosling");
        bookList.add(b2);
        bookList.add(new Book(100,"Tell me your dreams","Sidney Sheldon"));
        System.out.println(bookList);


    }
}
