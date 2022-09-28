public class Main {
    public static void main(String[] args) {
//Дан массив целых чисел ( не пустой) . Написать метод, возвращающий наибольший элемент  этого массива .
        int[] arr = {55, -100, 300, 56, 1, -69, 1000, -1888, -2, 1, 3, 6, -1, 4, -5, 9};
        System.out.println("max =  " + maxArray(arr));
        System.out.println("min =  " + minArray(arr));
        System.out.println("Difference  " + minMaxDifference(arr));
    }

    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //Дан массив целых чисел ( не пустой) . Написать метод, возвращающий разницу между наибольшим и наименьшим  элементами  этого массива .
    public static int minArray(int[] arr) {
        int min = arr[0];

        for (int j = 1; j < arr.length; ++j) {
              if (arr[j]<min){
                  min = arr[j];
              }
        }
        return min;
    }
    public static int minMaxDifference(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int j = 1; j < arr.length; ++j) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        for (int i = 1; i < arr.length; ++i) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        return max-min;
    }
}