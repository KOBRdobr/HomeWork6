package ru.zinnurov;

/**
 * @author Danil Popov
 * BadPit@211.ru
 * on 30.08.18
 */
public class Book {
    private Genre genre;
    private String name;
    //private String[] books;// = new String[] {"Совершенный код", "Справочник разработчика", "Алгоритмы", "Базы данных"};

    public Book(String[] books) {
        this.books = books;
    }

    public void listBooks() {
        for(int i = 0; i < this.books.length; i++) {
            System.out.println(getGenre(i));
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

    protected String getGenre(int i){
        return this.books[i];
    }

    protected String getBook(int key) {
        return this.books[key-1];
    }

    public String[] getBooks() {
        return books;
    }
}
