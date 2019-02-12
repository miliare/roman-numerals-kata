public class RomanNumerals {
    public static String compute(int number) {
        String numerals = "";
        while (number > 0) {
            if (number % 10 == 0) {
                numerals += "X";
                number -= 10;
            } else if (number % 5 == 0) {
                numerals += "V";
                number -= 5;
            } else if (number % 10 == 9) {
                numerals += "XI";
                number -= 9;
            } else if (number % 5 == 4) {
                numerals += "VI";
                number -= 4;
            } else {
                numerals += "I";
                number -= 1;
            }
        }

        return new StringBuilder(numerals).reverse().toString();
    }
}
