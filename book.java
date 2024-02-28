import java.util.Scanner;

public class Books {
    private String author;
    private String judul;
    private double harga;
    private String publisherNumber;

    public Books(String author, String judul, double harga, String publisherNumber) {
        this.author = author;
        this.judul = title;
        this.harga = price;
        this.publisherNumber = publisherNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getJudul() {
        return title;
    }

    public double getHarga() {
        return price;
    }

    public String getPublisherNumber() {
        return publisherNumber;
    }
}


public class Main {
    public static void main(String[] args) {

        Books book1 = new Books("Agatha Cristie", "Curtain", 60000.00, "12345");
        Books book2 = new Books("MOOSEBOO", "BETA TEST", 40000.00, "54321");
        Books book3 = new Books("James Clear", "Atomic Habits", 120000.00, "98765");


        double totalPrice = book1.getharga() + book2.getHarga() + book3.getHarga();


        System.out.println("Total price of all books: $" + totalPrice);
    }
}