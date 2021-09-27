package by.bsuir.oop.lab.t12.comparators;

import by.bsuir.oop.lab.t12.Book;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book obj1, Book obj2) {
        return obj1.getAuthor().compareTo(obj2.getAuthor());
    }

    /*@Override
    public Comparator<Book> thenComparing(Comparator<? super Book> other) {
        return null;
    }*/
}
