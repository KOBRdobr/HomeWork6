package ru.zinnurov;

public class Fantazy  extends  IT{
    String[] books = new String[] {"Властелин колец", "Игра престолов", "Задверье", "Гарри Поттер"};

    @Override
    protected String getGenre(int i){
        return this.books[i];
    }

    @Override
    protected String getBook(int key) {
        return this.books[key-1];
    }

}
