public class Main {
    public static void main(String[] args) {
        //���� ����� ����� num. ���������� �������� ���������, ������� ������� �� ����� ������� ��������� num  �� 10. ��������, ���� num=3 �� ����� ������ ���� �����:
        //           	3*1=3
        //           	3*2=6
        //           	3*3=9
        //           	-----
        //          	3*9=27
        //           	3*10=30

        int num1 = 3;
        int num2 = 1;
        int produkt = 0;
        while (num2 <= 10) {
            produkt = num1 * num2;
            System.out.println(num1 + "*" + num2 + "=" + produkt);
            num2 += 1;
        }
    }
}