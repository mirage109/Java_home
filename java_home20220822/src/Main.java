public class Main {
    //Используя знания об операторе IF, напишите программу, которая выводит на экран большее из 3 чисел. Числа заданы в виде переменных num1, num2, num3.
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 60;
        int num3 = 70;
        int max;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        System.out.println("Самое большое число " + max);
    }
}
