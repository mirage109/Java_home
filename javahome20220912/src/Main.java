public class Main {
    public static void main(String[] args) {
//�������� ����� String replace(String str, char oldChar, char newChar) ������� � ���������� ������ str ������ ��� �������  oldChar �� ������� newChar.  ��������: replace(�����, �c�, ��) -> �����
        String str = "help";
        char oldChar = 'h';
        char newChar = 'm';
        System.out.println(replace(str, oldChar, newChar));
    }

    public static String replace(String str, char oldChar, char newChar) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == oldChar) {
                result += newChar;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }
}