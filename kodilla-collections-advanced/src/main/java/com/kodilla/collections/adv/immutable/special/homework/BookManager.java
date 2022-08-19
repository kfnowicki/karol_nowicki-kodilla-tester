package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookManager {
    private static List<Book> books = new ArrayList<>();

    public static Book createBook(String author,String title){
        Book tempBook = new Book(author,title);
        boolean condition = false;
        for (Book book : books) {
            if (tempBook.equals(book)) {
                tempBook = book;
                condition = true;
            }
        }
        if (!condition)
            books.add(tempBook);

        return tempBook;
    }
}
