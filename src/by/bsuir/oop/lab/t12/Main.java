package by.bsuir.oop.lab.t12;


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("Author");
        book1.setTitle("Title");
        book1.setPrice(123);
        Book.setEdition(12);
        Book book2 = new Book();
        book2.setAuthor("Author");
        book2.setTitle("Title");
        book2.setPrice(123);
        System.out.println(book1.toString());
        System.out.println(book1.equals(book2));



        ProgrammerBook programmerBook1 = new ProgrammerBook();
        programmerBook1.setAuthor("ProgrammerAuthor");
        programmerBook1.setTitle("ProgrammerTitle");
        programmerBook1.setPrice(1234);
        programmerBook1.setLanguage("Belarusian");
        programmerBook1.setLevel(2);

        ProgrammerBook programmerBook2 = new ProgrammerBook();
        programmerBook2.setAuthor("ProgrammerAutor");
        programmerBook2.setTitle("ProgrammerTitle");
        programmerBook2.setPrice(1234);
        programmerBook2.setLanguage("Belarusian");
        programmerBook2.setLevel(2);
        System.out.println(programmerBook1.toString());

        System.out.println(programmerBook1.equals(programmerBook2));
    }
}
