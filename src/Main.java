import ru.zinnurov.*;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {


    //Выбор жанра и книги
    private static void choiceGenre() {
        int choice = input(); //Выбор жанра

        Library lib = new Library();
        Book[] books = lib.getBooksByGenre(choice);
        Book itBooks = createBook(choice);
        itBooks.listBooks();
        System.out.println("\nКакую книгу вы решили выбрать?\n");
        choice = input();
        itBooks.choiceBook(choice);

    }

    private static Book createBook(int bookType) {
        Book book = null;
        switch (bookType) {
            case  1:
                book = new Book(new String[]{"Совершенный код", "Справочник разработчика", "Алгоритмы", "Базы данных"});
                break;
            case  2:
                book = new Book(new String[] {"Властелин колец", "Игра престолов", "Задверье", "Гарри Поттер"});
                break;
            case  3:
                book = new Book(new String[]{"Быпечка", "Салаты", "Супы", "Второе"});
                break;
            case  4:
                book = new Book(new String[]{"СССР", "Древняя греция", "Каменный век", "Крестовые походы"});
                break;
        }

        return book;
    }

    //Метод ввода
    private static int input() {
        Scanner in = new Scanner(System.in);
        int choice;  //Переменная хранящая выбор пользователя

        while (true) {
            if (in.hasNextInt()) {
                choice = in.nextInt();
                if (choice == 0 | choice > 4) {
                    System.out.println("Введите числа от 1 до 4!");
                    continue;
                }
                break;
            } else {
                System.out.println("Введите числа!");
                in.next();
            }
        }

        return choice;
    }

    public static void main(String[] args) {

        System.out.println("Добро пожаловать в библиотеку!");
        System.out.println("В библиотеке пока только 4 жанра книг");
        System.out.println("1.IT\n2.Истоия\n3.Кулинария\n4.Художенственная литература");
        System.out.println("\nКакой жанр вас интересует?\n");

        choiceGenre(); //Выбор жанра и книги


    }
}