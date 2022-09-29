public class Main {
    public static void main(String[] args) {

        /*Реализовать метод, который создает и заполняет массив числами int в диапазоне от minValue до maxValue*/
        int[] arr = getIntArray(5, 20);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i+"]= "+arr[i]);
        }
    }

    public static int[] getIntArray(int minValue, int maxValue) {
        int[] result = new int[maxValue - minValue];
        int index = 0;
        for (int i = minValue; i < maxValue; i++) {
            result[index] = i;
            index += 1;
        }
        return result;
    }


}