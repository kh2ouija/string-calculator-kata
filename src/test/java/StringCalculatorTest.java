import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    private StringCalculator calculator;

    @Before
    public void setup() {
        calculator = new StringCalculator();
    }

    @Test
    public void shouldAcceptInputStrings() {}

    @Test
    public void shouldReturnZeroOnEmptyString() {}

    @Test
    public void shouldReturnSameOnSingleNumber() {}

    @Test
    public void shouldReturnSumOfTwoNumbersDelimitedByComma() {}

    @Test
    public void shouldReturnSumOfMultipleNumbersDelimitedByCommas() {}

    @Test
    public void shouldThrowExceptionOnNegativeInput() {}

    @Test
    public void shouldIgnoreNumbersLargerThanThousand() {}

    @Test
    public void shouldAllowNewlineDelimiter() {}

    @Test
    public void shouldAllowSpecifiedSingleCharacterDelimiter() {
        // sample valid input: //:\n1:2 or //|\n1|2|3
    }

    @Test
    public void shouldAllowSpecifiedDelimiterOfAnySize() {
        // sample valid input: //[and]\n1and2
    }

    @Test
    public void shouldAllowMultipleSpecifiedDelimitersOfAnySize() {
        // sample valid input: //[and][also][+]\n1and2also3+4
    }

}
