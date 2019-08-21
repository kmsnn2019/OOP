package NIIT.Book;

import java.util.Arrays;

public class Book {

    private String Name;
    private Author [] author;
    private double price;
    private int qty;

    public Book(String name, Author[] author, double price) {
        Name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author[] author, double price, int qty) {
        Name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return Name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", author=" + Arrays.toString(author) +"\n"+
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames()
    {
        String S = "[";
        for (int i=0; i<author.length-1; i++)
             S = S + author[i].getName()+ ","  ;
        S = S + author[author.length-1].getName() +"]";
        return S;
    }
}

