public class Lesson_1 {

    public static void main(String[] args) {

        // 1:
        printThreeWords();


        // 2:
        checkSumSign();


        // 3:
        printColor();


        // 4:
        compareNumbers();


        // 5:
        int num1 = 5;
        int num2 = 7;
        boolean result = isSumInRange(num1, num2);
        System.out.println("Сумма в диапазоне от 10 до 20: " + result);


        // 6:
        int num3 = 5;
        int num4 = -3;
        int num5 = 0;
        checkNumber(num3);
        checkNumber(num4);
        checkNumber(num5);


        // 7:
        int count1 = -5;
        int count2 = 3;
        int count3 = 0;
        System.out.println(count1 + " является отрицательным? " + isNegative(count1));
        System.out.println(count2 + " является отрицательным? " + isNegative(count2));
        System.out.println(count3 + " является отрицательным? " + isNegative(count3));


        // 8:
        printString("Hello, World!", 3);


        // 9:
        int year = 2024;
        boolean isLeapYear = isLeap(year);
        System.out.println(year + " год является високосным? " + isLeapYear);


        // 10:
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив:");
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("Измененный массив:");
        printArray(array);


        // 11:
        int[] x = new int[100];
        for (int i = 0; i < x.length; i++) {
                x[i] = i + 1;
        }
        for (int num : x) {
            System.out.print(num + " ");
        }


        // 12:
        int[] y = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < y.length; i++) {
            if (y[i] < 6) {
                y[i] *= 2;
            }
        }
        for (int num : y) {
            System.out.println(num + " ");
        }


        // 13:
        int n = 5;
        int[][]z = new int[n][n];
        for (int i = 0; i < n; i++) {
            z[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }


        // 14:
        int len = 5;
        int initialValue = 10;
        int[] resultArray = createFilledArray(len, initialValue);
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }

    // 1:
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2:
    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3:
    public static void printColor() {
        int value = 75;
        
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4:
    public static void compareNumbers() {
        int a = 8;
        int b = 12;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5:
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6:
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " является положительным.");
        } else {
            System.out.println("Число " + number + " является отрицательным.");
        }
    }

    // 7:
    public static boolean isNegative(int count) {
        return count < 0;
    }

    // 8:
    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    // 9:
    public static boolean isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // 10:
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // 14:
    public static int[] createFilledArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}