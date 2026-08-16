package com.ratipatil.corejava.oops.librarymanagement;

public class Book {

    public String title ;
    public String author ;
    public double price;


    Book(String title , String author , double price){
        this.title = title ;
        this.author = author;
        this.price = price;


    }

    Book(){}

    void displayInfo(){
        System.out.println("Boot Title Is : " + title);
        System.out.println("Book Author Name Is : "  + author);
        System.out.println("Book Price is : " + price);


    }



    double calculateDiscount(double price){
        double discount = price*0.10;
        return discount;

    }
}

class Ebook extends Book{
    public double fileSizeBytes;

    Ebook(String title , String author , double price , double fileSizeBytes){

        super(title,author,price);

        this.fileSizeBytes = fileSizeBytes;

    }

    @Override
    void displayInfo(){
        System.out.println("Boot Title Is : " + title);
        System.out.println("Book Author Name Is : "  + author);
        System.out.println("Book Price is : " + price);
        System.out.println("EBook  File size is : " + fileSizeBytes);

    }

    @Override
    double calculateDiscount(double price){
        double discount = price*0.20;
        return discount;

    }


    public static void main(String [] args){
        Ebook eb = new Ebook("AtomicHabit","JamesClear",900,60);

        eb.displayInfo();

        double finaldiscount = eb.calculateDiscount(eb.price);
        System.out. println("Final Discount " + finaldiscount);
    }

}
