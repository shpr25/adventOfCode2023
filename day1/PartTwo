import java.util.ArrayList;
import java.util.HashMap;

public class PartTwo {
    static HashMap<String, String> numbersMapping = new HashMap<String, String>(){{
        put("one", "1");
        put("two", "2");
        put("three", "3");
        put("four", "4");
        put("five", "5");
        put("six", "6");
        put("seven", "7");
        put("eight", "8");
        put("nine", "9");
    }};

    private static int sum(ArrayList<String> A) {
        int sum = 0;
        for(int i = 0; i< A.size(); i++){
            String word = A.get(i);
            String number = getNumber(word);
            sum += Integer.parseInt(number);
        }

        return sum;
    }

    private static String getNumber(String word) {
        int l = 0;
        int r = word.length()-1;
        String lNum = "";
        String rNum= "";
        int N = word.length();
        while(lNum.isEmpty() || rNum.isEmpty()){
            if(lNum.isEmpty()){
                if(isDigit(word.charAt(l))){
                    lNum = word.charAt(l)+"";
                }else{
                    for(int i = 3; i <= 5 && l+i < N; i++){
                        String substring = word.substring(l, l+i);
                        String convertedDigit = convertToDigit(substring);
                        if(!convertedDigit.isEmpty()){
                            lNum = convertedDigit;
                            break;
                        }
                    }
                }
            }

            if(rNum.isEmpty()){
                if(isDigit(word.charAt(r))){
                    rNum = word.charAt(r) +"";
                }else{
                    for(int i = 2; i <= 4&& r-i >= 0; i++)  {
                        String substring = word.substring(r - i, r+1);
                        String convertedDigit = convertToDigit(substring);
                        if(!convertedDigit.isEmpty()){
                            rNum = convertedDigit;
                            break;
                        }
                    }
                }

            }
            l++;
            r--;
        }
        return lNum+rNum;
    }

    private static String convertToDigit(String word) {
        String matchedDigit = numbersMapping.get(word);
        return matchedDigit == null ? "": matchedDigit;
    }

    private static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<String>(){{
            add("two1nine");
            add("eightwothree");
            add("abcone2threexyz");
            add("xtwone3four");
            add("4nineeightseven2");
            add("zoneight234");
            add("7pqrstsixteen");
        }};
        System.out.println(sum(A));
    }
