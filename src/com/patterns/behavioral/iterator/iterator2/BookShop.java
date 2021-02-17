package com.patterns.behavioral.iterator.iterator2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.patterns.behavioral.iterator.iterator1.Book;

public class BookShop implements Iterable<Book>{

    List<Book> books;

    public BookShop(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShopIterator();
    }

    private class BookShopIterator implements Iterator<Book>{

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (this.currentIndex >= books.size()){
                return false;
            }
            return true;
        }

        @Override
        public Book next() {
            return books.get(currentIndex++);
        }
    }
}
