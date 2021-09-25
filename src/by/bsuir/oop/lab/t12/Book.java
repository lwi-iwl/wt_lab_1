package by.bsuir.oop.lab.t12;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public static void setEdition(int value){
        edition = value;
    }

    public static int getEdition(){
        return  edition;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }

        Book book = (Book) obj;
        return price == book.price
                && (title == book.title || title != null && title.equals(book.getTitle()))
                && (author == book.author || author != null && author.equals(book.getAuthor()));
    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + price;
        result = 31 * result + ((title == null) ? 0 : title.hashCode());
        result = 31 * result + ((author == null) ? 0 : author.hashCode());
        return result;
    }

    @Override
    public String toString(){
        String result = "";
        result = result + "Title: " + ((title == null) ? "none" : title) + ", Author: " +
                ((author == null) ? "none" : author) + ", Price: " +
                price + ", Edition: " + edition;
        return result;
    }

    @Override
    public Book clone(){
        Book result = new Book();
        result.setTitle(title);
        result.setAuthor(author);
        result.setPrice(price);
        return result;
    }
}