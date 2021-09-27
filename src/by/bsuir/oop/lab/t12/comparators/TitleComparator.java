package by.bsuir.oop.lab.t12.comparators;

import by.bsuir.oop.lab.t12.Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book obj1, Book obj2) {
        return obj1.getTitle().compareTo(obj2.getTitle());
    }

    /*@Override
    public Comparator<Book> thenComparing(Comparator<? super Book> other) {
        return null;
    }*/
}
