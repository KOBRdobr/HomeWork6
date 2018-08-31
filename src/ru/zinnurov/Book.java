package ru.zinnurov;

public class Book {
    private String[] books;

    public Book(String[] books) {
        this.books = books;
    }

    public void listBooks() {
        for(int i = 0; i < this.books.length; i++) {
            System.out.println(books[i]);
        }
    }

    public void choiceBook(int key) {
        if(key > this.books.length) {
            System.out.println("Такой книги нет!");
        }
        else {
            String book = getBook(key);
            System.out.println("Возьмите вашу книгу: " + book);
        }
    }



    protected String getBook(int key) {
        return this.books[key-1];
    }

}
