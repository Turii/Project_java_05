import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {
    //Напишите алгоритм AreNumbersEqual, который принимает на вход 2 любых int числа, и возвращает
    //0, если числа равны
    //-1, если первое число меньше второго
    //1, если первое число больше второго
    //Test Data:
    //89, 89
    //Expected result: 0
    //-89, 89
    //Expected result: -1
    //89, -89
    //Expected result: 1

    @Test
    public void testEqualNumbers() {
        int number1 = 89;
        int number2 = 89;
        int expectedResult = 0;
        int actualResult = new AreNumbersEqual().areNumbersEqual(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNotEqualNumbersFirstBigger() {
        int number1 = -89;
        int number2 = 89;
        int expectedResult = -1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNotEqualNumbersSecondBigger() {
        int number1 = 89;
        int number2 = -89;
        int expectedResult = 1;
        int actualResult = new AreNumbersEqual().areNumbersEqual(number1, number2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
