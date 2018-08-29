import ru.zinnurov.Fantazy;
import ru.zinnurov.Gastronomy;
import ru.zinnurov.IT;
import ru.zinnurov.History;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    //Выбор жанра и книги
    private static void choiceGenre() {

        int choice = input(); //Выбор жанра

        while(true) {
            if (choice != 0 || choice > 4) {

                if (choice == 1) {
                    IT itBooks = new IT();
                    itBooks.listBooks();
                    System.out.println("\nКакую книгу вы решили выбрать?\n");
                    choice = input();
                    itBooks.choiceBook(choice);
                } else if (choice == 2) {
                    History historyBooks = new History();
                    historyBooks.listBooks();
                    System.out.println("\nКакую книгу вы решили выбрать?\n");
                    choice = input();
                    historyBooks.choiceBook(choice);
                } else if (choice == 3) {
                    Gastronomy gastronomyBooks = new Gastronomy();
                    gastronomyBooks.listBooks();
                    System.out.println("\nКакую книгу вы решили выбрать?\n");
                    choice = input();
                    gastronomyBooks.choiceBook(choice);
                } else {
                    Fantazy fantazyBooks = new Fantazy();
                    fantazyBooks.listBooks();
                    System.out.println("\nКакую книгу вы решили выбрать?\n");
                    choice = input();
                    fantazyBooks.choiceBook(choice);
                }
            } else System.out.println("Введите числа от 1 до 4!");
        }

    }

    //Метод ввода
    private static int input() {
        Scanner in = new Scanner(System.in);
        int choice;  //Переменная хранящая выбор пользователя

        while(true) {
            if(in.hasNextInt()) {
                choice = in.nextInt();
                break;
            }
            else {
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