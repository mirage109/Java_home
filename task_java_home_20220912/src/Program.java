
public class Program {
    public static void main(String[] args) {
        counting();
        summa();

        trio();

        triofirst(8);
        System.out.println(firstTwoLetters("hello"));
        System.out.println(capitalLetters("hello"));
    }

    static void counting() {
        //First level: C помощью цикла for написать метод, печатающий цифры от 1 до  числа  n
        int n = 15;
        for (int i = 0; i <= n; i += 1) {
            System.out.println(i + " ");
        }
    }

    static void summa() {
        //C помощью цикла for написать метод возвращающий сумму цифр от 1 до числа n
        int num = 10;
        int y;
        int result = 0;
        for (y = 0; y <= num; y += 1) {
            result += y;
        }
        System.out.println("Sum of numbers from 1 to 10 is " + result);
    }

    // Задача 2 вывести треугольник из цифр 1 до числа n
    static void trio() {
        int n = 5;
        for (int z = 1; z <= n; z++) {
            for (int j = 1; j <= z; j++) {
                System.out.print(z);
            }
            System.out.println();
        }
    }

    static void triofirst(int s) {
        for (int r = 1; r <= s; r++) {
            for (int t = 1; t <= r; t++) {
                System.out.print(t);
            }
            System.out.println();
        }
    }
    public static String firstTwoLetters(String string){
        return string.substring(0,2);
    }
    public static String capitalLetters(String string){
        return string.toUpperCase();
    }
}