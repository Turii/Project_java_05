import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Struct;

public class IsPosittiveNumberTest {
    //Напишите алгоритм IsPositiveNumber,
    // который возвращает true, если численный  параметр больше или равен нулю,
    // и возвращает false, если параметр меньше 0.
    //Проверьте работу метода на числах 555, 0 и -555.
    @Test
    public void isPositiveNumberPosittive() {
        int number = 555;
        boolean expectedResult = true;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void isPositiveNumberNegative() {
        int number = -555;
        boolean expectedResult = false;
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
