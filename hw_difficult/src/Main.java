import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Задание особой сложности *. Написать конвертер валют.
//        Пользователь вводит рубли, а программа печатает значение
//        в долларах и евро. Взять актуальный курс валют.

        System.out.println("\t\t\t***Добро пожаловать в конвертер валют***");
        System.out.println("Введите значение в рублях: ");
        Scanner sc = new Scanner(System.in);
        int ru = sc.nextInt();
        System.out.println("Введенное значение в US: " + (ru/93.2801));
        System.out.println("Введенное значение в EUR: " + (ru/98.4365));

    }
}
