package Lesson_4;

public class Main {

    public static void main(String[] args) {

        String[][] validArray = {
                { "1", "2", "3", "4" },
                { "5", "6", "7", "8" },
                { "9", "10", "11", "12" },
                { "13", "14", "15", "16" }
        };

        String[][] invalidArray = {
                { "1", "2", "three", "4" },
                { "5", "6", "7" },
                { "9", "10", "11", "12" },
                { "13", "14", "15", "16" }
        };

        try {
            int sum = checkAndSumArray(validArray);
            System.out.println("Сумма элементов корректного массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            int sum = checkAndSumArray(invalidArray);
            System.out.println("Сумма элементов некорректного массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int checkAndSumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4x4!");
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Невозможно преобразовать значение в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }

        return sum;
    }
}
