import model.CalculatorPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import runner.BaseTest;

public final class CalculatorTest extends BaseTest {

    @Test
    public void testGetInitialValue() {
        String initialValue = new CalculatorPage()
                .clickAC()
                .getResultLine();

        Assertions.assertEquals("0", initialValue, "Initial value is not equals to 0.");
    }

    @Test
    public void testGetUpperLine() {
        String sumUpperLine = new CalculatorPage()
                .clickOne()
                .clickPlus()
                .clickTwo()
                .clickEquals()
                .getUpperLine();

        Assertions.assertEquals("1 + 2 =", sumUpperLine, "The upper line does not contain '1 + 2 ='.");
    }

    @Test
    public void testGetSum() {
        String sum = new CalculatorPage()
                .clickOne()
                .clickZero()
                .clickPlus()
                .clickTwo()
                .clickThree()
                .clickEquals()
                .getResultLine();

        Assertions.assertEquals("33", sum, "The 10 + 23 is not equals to 33.");
    }

    @Test
    public void testGetSubtract() {
        String subtract = new CalculatorPage()
                .clickFour()
                .clickFive()
                .clickSubtract()
                .clickSix()
                .clickDot()
                .clickZero()
                .clickEquals()
                .getResultLine();

        Assertions.assertEquals("39", subtract, "The 45 - 6 is not equals to 39.");
    }

    @Test
    public void testGetDivide() {
        String divide = new CalculatorPage()
                .clickFive()
                .clickDivide()
                .clickTwo()
                .clickEquals()
                .getResultLine();

        Assertions.assertEquals("2.5", divide, "The 5 / 2 is not equals to 2.5.");
    }

    @Test
    public void testGetMultiply() {
        String multiply = new CalculatorPage()
                .clickSeven()
                .clickEight()
                .clickMultiply()
                .clickNine()
                .clickEquals()
                .getResultLine();

        Assertions.assertEquals("702", multiply, "The 78 * 9 is not equals to 702.");
    }

    @Test
    public void testHandInput() {
        String result = new CalculatorPage()
                .startHandInput("12+3")
                .clickEquals()
                .getResultLine();

        Assertions.assertEquals("15", result, "The 12 + 3 is not equals to 15.");
    }
}
