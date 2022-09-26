public class Main {
    private static int min;
    private static int[] arr;

    public static void main(String[] args) {
        //Задача №1. Дан массив целых чисел. Реализовать метод, который возвращает минимальное значение в данном массиве. Например: {1,3,6,-1,4,-5,9} -> -5
        int arr[] = {55, -100, 300, 56, 1, -69, 1000, -1888, -2, 1, 3, 6, -1, 4, -5, 9
        };
        printIntArray(arr);
        System.out.println("Min="+getMin(arr));
    }

    public static void printIntArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d  ", i, arr[i]);
            if (i % 5 == 0 && i != 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}