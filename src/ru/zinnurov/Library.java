package ru.zinnurov;

public class Library {

    private int choice;
    private String[] books;

    public Library(int choice) {
        this.choice = choice;
    }

    public String[] createBook() {
        switch (choice) {
            case  1:
                books = new String[]{"Совершенный код", "Справочник разработчика", "Алгоритмы", "Базы данных"};
                break;
            case  2:
                books = new String[]{"Властелин колец", "Игра престолов", "Задверье", "Гарри Поттер"};
                break;
            case  3:
                books = new String[]{"Быпечка", "Салаты", "Супы", "Второе"};
                break;
            case  4:
                books = new String[]{"СССР", "Древняя греция", "Каменный век", "Крестовые походы"};
                break;
        }

        return books;
    }
}
