public class Main {
    //�������� ���������, ������� ������� �� ����� ������� ��������� (������� ��������). �����������, ������������ �����.
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        while (y <= 9) {
            x = 1;
            while (x <= 9) {
                System.out.print(String.format("%4d",(x * y)));
                x += 1;
            }
            y += 1;
            System.out.println();
        }
    }
}