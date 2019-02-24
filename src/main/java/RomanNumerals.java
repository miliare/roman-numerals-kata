import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    static Map<Integer, String> arabicToRoman = new LinkedHashMap<Integer, String>() {{
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public static String generate(int number) {
        StringBuilder numerals = new StringBuilder();
        convert(number, numerals);
        return numerals.toString();
    }

    private static void convert(int number, StringBuilder numerals) {
        for (Map.Entry<Integer, String> m : arabicToRoman.entrySet()) {
            while (number >= m.getKey()) {
                numerals.append(m.getValue());
                number -= m.getKey();
            }
        }
    }
}
