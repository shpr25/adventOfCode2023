import java.util.ArrayList;

public class PartOne {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>(){{
            add("1abc2");
            add("pqr3stu8vwx");
            add("a1b2c3d4e5f");
            add("treb7uchet");
        }};

        System.out.println(sum(str));
    }

    private static int sum(ArrayList<String> A) {
        int sum = 0;
        for (int i = 0; i < A.size(); i++) {
            String number = getNumber(A.get(i));
            sum += Integer.parseInt(number);
        }

        return sum;
    }

    private static String getNumber(String word) {
        int l = 0;
        int r = word.length() - 1;
        int lIndex = -1;
        int rIndex = -1;
        while (lIndex == -1 || rIndex == -1) {
            if (lIndex == -1 && isDigit(word.charAt(l))) {
                lIndex = l;
            }

            if (rIndex == -1 && isDigit(word.charAt(r))) {
                rIndex = r;
            }
            l++;
            r--;
        }
        return word.charAt(lIndex) + "" + word.charAt(rIndex);
    }

    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

}
