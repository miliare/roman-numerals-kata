import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsTest {

    @Test
    public void should_generate_Is_for_1_2_3() {
        assertThat(RomanNumerals.generate(1)).isEqualTo("I");
        assertThat(RomanNumerals.generate(2)).isEqualTo("II");
        assertThat(RomanNumerals.generate(3)).isEqualTo("III");
    }

    @Test
    public void should_generate_IV_for_4() {
        assertThat(RomanNumerals.generate(4)).isEqualTo("IV");
    }

    @Test
    public void should_generate_V_for_5() {
        assertThat(RomanNumerals.generate(5)).isEqualTo("V");
    }

    @Test
    public void should_generate_VI_for_6() {
        assertThat(RomanNumerals.generate(6)).isEqualTo("VI");
    }

    @Test
    public void should_generate_IV_for_9() {
        assertThat(RomanNumerals.generate(9)).isEqualTo("IX");
    }

    @Test
    public void should_generate_X_for_10() {
        assertThat(RomanNumerals.generate(10)).isEqualTo("X");
    }

    @Test
    public void should_generate_XX_for_20() {
        assertThat(RomanNumerals.generate(20)).isEqualTo("XX");
    }

    @Test
    public void should_generate_XXIX_for_29() {
        assertThat(RomanNumerals.generate(29)).isEqualTo("XXIX");
    }

    @Test
    public void should_generate_L_for_50() {
        assertThat(RomanNumerals.generate(50)).isEqualTo("L");
    }

    @Test
    public void should_generate_XLIV_for_44() {
        assertThat(RomanNumerals.generate(44)).isEqualTo("XLIV");
    }


}
