public class Main {
    public static void main(String[] args) {
        String str = "     Java is a very popular language   ";
        String firstWord = "";
        String lastWord = "";
        int leftIndex = 0;
        int rightIndex = str.length() - 1;

        // 1. skip last spaces
        for (; rightIndex >= 0 && str.charAt(rightIndex) == ' '; rightIndex = rightIndex - 1) {
        }
        // 2. accumulate last word
        for (; rightIndex >= 0 && str.charAt(rightIndex) != ' '; rightIndex = rightIndex - 1) {
            lastWord = str.charAt(rightIndex) + lastWord;
        }
        // 3. skip leading spaces
        for (;leftIndex < rightIndex && str.charAt(leftIndex) == ' '; leftIndex += 1) {
        }
        //4. accumulate first word
        for (;leftIndex < rightIndex && str.charAt(leftIndex) != ' '; leftIndex += 1) {
            firstWord += str.charAt(leftIndex);
        }
        if (firstWord != "" && lastWord != "") {
            System.out.println(firstWord + " " + lastWord);
        } else {
            System.out.println(lastWord);
        }

    }
}