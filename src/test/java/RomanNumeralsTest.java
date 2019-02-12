import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsTest {

    @Test
    public void should_generate_as_much_I_as_count_units_from_1_to_3() {
        assertThat(RomanNumerals.compute(1)).isEqualTo("I");
        assertThat(RomanNumerals.compute(2)).isEqualTo("II");
        assertThat(RomanNumerals.compute(3)).isEqualTo("III");
    }

    @Test
    public void should_generate_IV_for_4() {
        assertThat(RomanNumerals.compute(4)).isEqualTo("IV");
    }

    @Test
    public void should_generate_V_for_5() {
        assertThat(RomanNumerals.compute(5)).isEqualTo("V");
    }

    @Test
    public void should_generate_V_and_as_much_I_as_count_units_from_6_to_8() {
        assertThat(RomanNumerals.compute(6)).isEqualTo("VI");
        assertThat(RomanNumerals.compute(7)).isEqualTo("VII");
        assertThat(RomanNumerals.compute(8)).isEqualTo("VIII");
    }

    @Test
    public void should_generate_IX_for_9() {
        assertThat(RomanNumerals.compute(9)).isEqualTo("IX");
    }

    @Test
    public void should_generate_X_for_10() {
        assertThat(RomanNumerals.compute(10)).isEqualTo("X");
    }

    @Test
    public void should_generate_X_and_as_much_I_as_count_units_from_11_to_13() {
        assertThat(RomanNumerals.compute(11)).isEqualTo("XI");
        assertThat(RomanNumerals.compute(12)).isEqualTo("XII");
        assertThat(RomanNumerals.compute(13)).isEqualTo("XIII");
    }

}
