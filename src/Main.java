import ru.zinnurov.*;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {


    //Выбор жанра и книги
    private static void choiceGenre() {
        int choice = input(); //Выбор жанра
        Library lib = new Library(choice);
        String[] books = lib.createBook();

        Book book = new Book(books);
        book.listBooks();

        System.out.println("\nКакую книгу вы решили выбрать?\n");
        choice = input();
        book.choiceBook(choice);

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