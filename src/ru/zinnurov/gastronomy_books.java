package ru.zinnurov;

public class gastronomy_books  extends IT_books{
    String[] gastronomyBooks = new String[] { "Выпечка", "Супы", "Закуски"};

    @Override
    protected String getBook(int key) {
        return this.gastronomyBooks[key];
    }
}
