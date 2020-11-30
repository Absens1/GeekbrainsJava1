package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    static char[][] map;
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';

    public static void main(String[] args)
    {
        // 1. Инициализация поля
        initMap();

        // 1.1 Вывод поля
        printMap();

        // в цикле
        while (true)
        {
            // 3. Ход первого игрока.
            makeHumanTurn();
            // 4. Вывод поля.
            printMap();
            // 5. Проверка на 3 в ряд и диагональ.
            if (hasWin(DOT_X))
            {
                System.out.println("Победил человек!");
                break;
            }
            // 6. Проверка на ничью.
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }

            // 7. Ход второго игрока (ИИ).
            makeAiTurn();

            // 8. Вывод поля.
            printMap();

            // 9. Проверка на x в ряд и диагональ.
            if (hasWin(DOT_O))
            {
                System.out.println("Победил ИИ");
                break;
            }

            // 10. Проверка на ничью.
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
        }
    }

    // 1. Инициализация.
    static void initMap()
    {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // Вывод поля
    static void printMap()
    {
        for (int i = 0; i <= map.length; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < map.length; i++)
        {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    // Ход первого игрока (человека)
    static void makeHumanTurn()
    {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    // Ход второго игрока (ИИ)
    static void makeAiTurn()
    {
        Random random = new Random();

        int x;
        int y;

        do
        {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер сходил в точку: " + (x + 1) + " " + (y + 1));

        map[y][x] = DOT_O;
    }

    // Проверка хода
    static boolean isCellValid(int x, int y)
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
        {
            return false;
        }
        else if (map[y][x] == DOT_EMPTY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Проверка диагоналей
    // offsetX и offsetY отвечают за уровни смещения
    static boolean checkDiagonal(char symb, int offsetX, int offsetY) {
        boolean toright;
        boolean toleft;
        toright = true;
        toleft = true;
        for (int i=0; i<DOTS_TO_WIN; i++) {
            // проверка слева направо осуществляется путем сравнивания содержимого одинаковых индексов по X и Y с символом symb
            toright &= (map[i+offsetX][i+offsetY] == symb);
            // проверка справа налево осуществляется с помощью формулы "кол-во фишек для победы" -текущее положение -1 и -смещение
            toleft &= (map[DOTS_TO_WIN-i-1+offsetX][i+offsetY] == symb);
        }

        if (toright || toleft) return true; // возврат true в случае положительного резульата toright или toleft

        return false;
    }

    // Проверка горизонтальных и вертикальных линий
    // offsetX и offsetY отвечают за уровни смещения
    static boolean checkLanes(char symb, int offsetX, int offsetY) {
        boolean cols;
        boolean rows;
        for (int col=offsetX; col<DOTS_TO_WIN+offsetX; col++) {
            cols = true;
            rows = true;
            for (int row=offsetY; row<DOTS_TO_WIN+offsetY; row++) {
                cols &= (map[col][row] == symb); // проверка true с результатом выражения map[col][row] == symb
                rows &= (map[row][col] == symb); // проверка true с результатом выражения map[row][col] == symb
            }

            if (cols || rows) return true;  // возврат true в случае положительного резульата cols или rows
        }
        return false;
    }

    // Проверка на победу
    static boolean hasWin(char symb)
    {
        // Циклы для смещения, + 1 нужен для того, чтобы пройтись по всем возможным вхождениям DOTS в SIZE
        // Смещение будет происходить по одному индексу сначала по колонке, потом по строке, потом по обеим осям
        for (int col=0; col<SIZE-DOTS_TO_WIN+1; col++) {
            for (int row=0; row<SIZE-DOTS_TO_WIN+1; row++) {
                if (checkDiagonal(symb, col, row) || checkLanes(symb, col, row)) return true;
            }
        }
        return false;
    }

    // Ничья
    static boolean isMapFull()
    {
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                if (map[i][j] == DOT_EMPTY)
                {
                    return false;
                }
            }
        }
        return true;
    }

}
