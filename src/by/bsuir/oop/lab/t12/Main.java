package by.bsuir.oop.lab.t12;


import by.bsuir.oop.lab.t12.comparators.AuthorComparator;
import by.bsuir.oop.lab.t12.comparators.PriceComparator;
import by.bsuir.oop.lab.t12.comparators.TitleComparator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Title", "Author", 123, 1);
        Book.setEdition(12);
        Book book2 = new Book("Title", "Author", 122, 2);
        System.out.println(book1.toString());
        System.out.println(book1.equals(book2));



        ProgrammerBook programmerBook1 = new ProgrammerBook("ProgrammerTitle", "ProgrammerAuthor", 1234, 3,"Belarusian", 2);

        ProgrammerBook programmerBook2 = new ProgrammerBook("ProgrammerTitle", "Author", 1234, 4, "Belarusian", 2);
        System.out.println(programmerBook1.toString());

        System.out.println(programmerBook1.equals(programmerBook2));

        Book book3 = book1.clone();
        System.out.println(book3.toString());
        System.out.println(book3 == book1);
        System.out.println(book3.equals(book1));
        System.out.println(book1.compareTo(book2));
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        Comparator<Book> titleComparator = new TitleComparator();
        Comparator<Book> titleAuthorComparator = new TitleComparator().thenComparing(new AuthorComparator());
        Comparator<Book> authorTitleComparator = new AuthorComparator().thenComparing(new TitleComparator());
        Comparator<Book> authorTitlePriceComparator = authorTitleComparator.thenComparing(new PriceComparator());

        list.sort(authorTitlePriceComparator);
        System.out.println(list.get(0).getPrice());
    }
}
