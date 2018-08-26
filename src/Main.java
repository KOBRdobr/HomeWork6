import ru.zinnurov.IT_books;
import ru.zinnurov.history_books;
import  ru.zinnurov.gastronomy_books;
import java.util.Scanner;

public class Main {
    public static int input() {

        Scanner in = new Scanner(System.in);
        int choice2;
        while (true) {
            if (in.hasNextInt()) {
                choice2 = in.nextInt();
                if(choice2 > 3 || choice2 == 0) {
                    System.out.println("Введите число от 1 до 3!");
                    continue;
                }
                break;
            } else {
                System.out.println("Введите число!");
                in.next();
            }
        }
        return choice2;
    }
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в библиотеку!");
        System.out.println("Доступные жанры:");

        String[] genres = new String[] {"1.IT", "2.История", "3.Кулинария"};
        String choose;
        for(String i: genres) {
            System.out.println(i);
        }
        System.out.println("Какой жанр вам нужен?");
        Scanner in = new Scanner(System.in);
        int choice = input();

        if(choice == 1) {
            IT_books it = new IT_books();

            System.out.println("Поиск по названию или по первой букве?");
            System.out.println("1. По названию");
            System.out.println("2. По первой букве");
            System.out.println("3. Выйти");
            choice = input();
            if(choice == 1) {
                choose = in.nextLine();
                it.whatBook(choose);
                it.searchBook();
            }
            else if (choice == 2) {

            }
        }
        else if(choice == 2) {
            history_books hb = new history_books();


        }
        else {
            gastronomy_books gb = new gastronomy_books();
        }




    }
}