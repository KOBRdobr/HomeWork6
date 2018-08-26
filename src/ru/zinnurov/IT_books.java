package ru.zinnurov;

public class IT_books {

    private String book;
    private String[] itbooks = new String[] {"1. Совершенный код", "2. Справочкик программиста",
            "3. Структуры и Итерпретация Компьютерных программ", "4. Философия Java" };

    public void whatBook(String book) {
        this.book = book;
    }

    protected String getBook(int i) {
        return this.itbooks[i];
    }
    public void listBook() {
        for(String i : itbooks) System.out.println(i);
    }

    public void giveBook(int key) {
        if(key >= this.itbooks.length ) System.out.println("Введите меньшее число!");
        else {
            String book = getBook(key-1);
            System.out.println("Вот ваша книга: " + book);
        }
    }
}
