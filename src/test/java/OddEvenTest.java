import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    //positive test Odd
    @Test
    public void testOddNumber_Happy_Path() {
        int number = 8;

        int expectedResult = 8;
        int actualRResult = new OddEven().oddEven(number);
        Assert.assertEquals(expectedResult, actualRResult);
    }

    //positive test Even
    @Test
    public void testEvenNumber_Happy_Path() {
        int number = 11;

        int expectedResult = 11;
        int actualRResult = new OddEven().oddEven(number);
        Assert.assertEquals(expectedResult, actualRResult);
    }


    //positive test Odd negattive number
    @Test
    public void testOddNegativeNumber_Happy_Path() {
        int number = -38;

        int expectedResult = -38;
        int actualRResult = new OddEven().oddEven(number);
        Assert.assertEquals(expectedResult, actualRResult);
    }

    //positive test Even negative number
    @Test
    public void testEvenNegativeNumber_Happy_Path() {
        int number = -11;

        int expectedResult = -11;
        int actualRResult = new OddEven().oddEven(number);
        Assert.assertEquals(expectedResult, actualRResult);
    }

    //positive test Even negative number
    @Test
    public void testEvenZeroNumber_Happy_Path() {
        int number = 0;

        int expectedResult = 0;
        int actualRResult = new OddEven().oddEven(number);
        Assert.assertEquals(expectedResult, actualRResult);
    }
}
