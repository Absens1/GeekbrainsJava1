package lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       while (isPlayNumberGameAgain()); // вызов метода игры с числами. Цикл завершится, если метод вернет false
       while (isPlayWordGameAgain()); // вызов метода игры со словами. Цикл завершится, если метод вернет false
    }

    public static boolean isPlayNumberGameAgain() {
         System.out.println("---------------------");
         Scanner sc = new Scanner(System.in); // создание объекта класса Scanner
         int randomNumber = (int) (Math.random() * 9); // генерация числа от 1 до 9
         for (int i = 0; i < 3; i++) {
             System.out.print("Введите число: ");
             int inputNumber = sc.nextInt(); // чтение целого числа
             if (inputNumber == randomNumber) {
                 System.out.println("Вы угадали!");
                 break;
             }
             if (randomNumber > inputNumber) {
                 System.out.println("Вы не угадали! Загаданное число больше.");
             } else System.out.println("Вы не угадали! Загаданное число меньше.");
         }
         System.out.print("Игра окончена. Хотите повторить игру ещё раз? y/n: ");
         char inputValue = sc.next().charAt(0); // чтение первого символа
         if (inputValue == 'y') {
             return true;
         }
         System.out.println("---------------------");
         return false;
     }

    public static boolean isPlayWordGameAgain() {
        String[] arrWords = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String conceivedWord = arrWords[(int) (Math.random() * 25)];
        System.out.println("Подсказка! - " +  conceivedWord + ". Лень лезть в отладчик.");
        Scanner sc = new Scanner(System.in); // создание объекта класса Scanner
        // Бесконечный цикл. Завершается при угадывании слова.
        while (true) {
            System.out.print("Введите слово: ");
            String inputWord = sc.nextLine(); // чтение всей строчки, ввод слова
            // обязательно используем equals для сравнения иначе будем сравнивать разные области памяти
            if (inputWord.equals(conceivedWord)) {
                System.out.println("Вы отгадали слово - " + conceivedWord + "!");
                break;
            } else {
                String hiddenWord = "";
                // проходимся по всем символам загаданного и введенного слова (для обоих, чтобы не выходить за пределы массива)
                for (int i = 0; i < conceivedWord.length() && i < inputWord.length(); i++) {
                    // если символ введенного слова в индексе i совпал с символом загаданного слова в индексе i
                    if (inputWord.charAt(i) == conceivedWord.charAt(i)) {
                        // добавить в скрытое слово данный символ
                        hiddenWord += String.valueOf(inputWord.charAt(i));
                        // в обратном случае скрыть данный символ знаком #
                    } else hiddenWord += "#";
                }
                System.out.println("Вы угадали буквы: " + hiddenWord);
            }
        }
        System.out.print("Игра окончена. Хотите повторить игру ещё раз? y/n: ");
        char inputValue = sc.next().charAt(0); // чтение первого символа
        if (inputValue == 'y') {
            return true;
        }
        System.out.println("---------------------");
        return false;
    }
}
