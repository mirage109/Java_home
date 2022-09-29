public class Main {
    private static int[] array;

    public static void main(String[] args) {
        /*

        2. Дан массив int. Реализовать метод, который считает сумму положительных  элементов массива.
        {3, 2, -1, 5, -3} ->10 */
        int[] array = {2, 5, 10, 34, -34, -21, 80, -10};
        System.out.println(getSummOfArray(array));
    }

    public static long getSummOfArray(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i += 1) {
            sum = arr[i]>0 ? sum+arr[i]:sum;
        }
        return sum;
    }

}