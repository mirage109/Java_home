public class Main {
    public static void main(String[] args) {

        //� ���������� ������, ��� ������� �����, ������� ������� �� 2 �������� ������� ��������� �� 2�. ��� ������� �����, ������� ������� �� 3 �������� ������� �������� �� 3�

        int num1 = 1;
        int num2 = 10;

        if (num1 <= num2) {
            while (num1 <= num2) {
                System.out.print("\n" + num1);
                if (num1 % 2 == 0) {
                    System.out.print(" ����� ������� �� 2.");
                }
                if (num1 % 3 == 0) {
                    System.out.print(" ����� ������� �� 3.");
                }
                num1 = num1 + 1;
            }
        } else if (num2 <= num1) {
            while (num2 <= num1) {
                System.out.print("\n" + num2);
                if (num2 % 2 == 0) {
                    System.out.print(" ����� ������� �� 2.");
                }
                if (num2 % 3 == 0) {
                    System.out.print(" ����� ������� �� 3");
                }
                num2 = num2 + 1;
            }
        }
    }
}