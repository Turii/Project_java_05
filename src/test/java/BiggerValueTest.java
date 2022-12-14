import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {
    //Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
    //Test Data:
    //3333, 9999
    //Expected Result = 9999

    @Test
    public void testbiggerValuePsitive() {
        int number1 = 3333;
        int number2 = 9999;
        int expctedResult = 9999;
        int actualResult = new BiggerValue().biggerValue(number1, number2);
        Assert.assertEquals(actualResult, expctedResult);
    }
}
