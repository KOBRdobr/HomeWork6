package ru.zinnurov;

public class history_books extends IT_books {
    String[] historyBooks = new String[] { "История СССР", "Древний Египет", "Средневековье"};

    @Override
    protected String getBook(int key) {
        return this.historyBooks[key];
    }
}
