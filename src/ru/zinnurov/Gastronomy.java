package ru.zinnurov;

public class Gastronomy extends IT{
    String[] books = new String[] {"Быпечка", "Салаты", "Супы", "Второе"};

    @Override
    protected String getGenre(int i){
        return this.books[i];
    }

    @Override
    protected String getBook(int key) {
        return this.books[key-1];
    }
}
