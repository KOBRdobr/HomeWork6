package ru.zinnurov;

public class IT_books {

    private String book;
    private String[] itbooks = new String[] {"Совершенный код", "Справочкик программиста",
            "Структуры и Итерпретация Компьютерных программ", "Философия Java" };

    public void whatBook(String book) {
        this.book = book;
    }

    protected String getBook(int key) {
        return this.itbooks[key];
    }
    public void searchBook() {
        int k = 0;
        for(int i = 0; i < itbooks.length; i++) {
            if(book.equalsIgnoreCase(itbooks[i])) {
                System.out.println("Мы нашли вашу книгу! ");

                String books = getBook(i);
                System.out.println("Вот, держите книгу " + books);
                k = 1;
                break;

            }
        }
        if(k == 0) {
            System.out.println("К сожалению такой книги нет");
        }
    }
}
