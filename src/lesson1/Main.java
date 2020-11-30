package lesson1;

// Основной класс для первого доманшего задания
public class Main {

    // Основной метод класса MainClass
    public static void main (String[] args) {

        // Создание и инициализация переменных целочисленного типа
        byte byteVariable = 1;
        short shortVariable = 1;
        int integerVariable = 1;
        long longVariable = 1;
        // Создание и инициализация переменных с плавающей запятой
        float floatVariable = 1.11f;
        double doubleVariable = 1.11;
        // Создание и инициализация переменных символьного типа
        char charVariable = 'А';
        // Создание и инициализация переменных логического типа
        boolean booleanVariable = true;

        // Вызов первого метода, который вычисляет выражение a * (b + (c / d))
        System.out.println("Резултат вычисления выражения a * (b + (c / d)) со значениями 1,1,1,1 равен: " + FirstMathMethod(1,1,1,1));
        // Вызов второго метода, который проверяет сумму двух чисел в диапазоне от 10 до 20
        System.out.println("Сумма двух чисел 10 и 5 входит в диапазон от 10 до 20? " + SecondMathMethod(10, 5));
        // Вызов третьего метода, который проверяет положительное ли число или отрицательное
        ThirdMathMethod(-100);
        // Вызов четвертого метода, который проверяет положительное ли число или отрицательное, и выводящий true если число отрицательное
        System.out.println("Число -5 отрицательное? : " + FourthMathMethod(-5));
        // Вызов пятого метода, который выводит фразу "Привет, указанное_имя!"
        FifthMethod("Даниил");
        // Вызов шестого метода, который проверяет високосный ли год или нет
        SixthMathMethod(2020);
    }

    // Метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    public static double FirstMathMethod (double a, double b, double c, double d) {
        // Возвращение результата выражения;
        return a * (b+ (c / d));
    }

    /* Метод, проверяющий что сумма двух чисел лежит в пределах от 10 до 20 (включительно),
       если да – вернуть true, в противном случае – false**/
    public static boolean SecondMathMethod (double firstNumber, double secondNumber) {
        /* Проверяет суммы чисел на соответствующий диапазон и,
           в зависимости от результата возвразает true или false**/
        return firstNumber + secondNumber >= 10 && firstNumber + secondNumber <= 20;
    }

    // Метод, проверяющий положительное ли число или отрицительное
    public static void ThirdMathMethod (int integerNumber) {
        // Проверка и вывод результата через тернарный оператор, можно было через стандартный if else
        System.out.println(integerNumber >= 0 ? "Результат: " + integerNumber + " число положительное" : "Результат: " +
                integerNumber + " число отрицательное");
    }

    // Метод, проверяющий положительное ли число или отрицительное, и возвращающий true если число отрицательное
    public static boolean FourthMathMethod (int integerNumber) {
        // Проверка и возвращение результата
        return integerNumber <= 0;
    }

    // Метод, возвращающий фразу «Привет, указанное_имя!»
    public static void FifthMethod (String firstName) {
        // Вывод фразы
        System.out.println("Привет, " + firstName + "!");
    }

    // Метод, проверяющий является ли год високосным
    public static void SixthMathMethod (int year) {
        // Проверка переданного года через условие и вывод результата
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " - високосный год");
        } else System.out.println(year + " - не високосный год");
    }
}
