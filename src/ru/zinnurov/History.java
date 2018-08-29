package ru.zinnurov;

public class History  extends IT{
    String[] books = new String[] {"СССР", "Древняя греция", "Каменный век", "Крестовые походы"};

    @Override
    protected String getGenre(int i){
        return this.books[i];
    }

    @Override
    protected String getBook(int key) {
        return this.books[key-1];
    }
}
