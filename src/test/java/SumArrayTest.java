import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    //Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    //
    //Test Data:
    //{0, 1, 2, 3, 4, 5} → 15
    //{-7, -3} → -10

    //happy path positive numbers
    @Test
    public void sumArraypositiveNumbers() {
        int[] array = new int[]{0, 1, 2, 3, 4, 5};
        int expctedResult = 15;
        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult, expctedResult);
    }


    //happy path negative numbers
    @Test
    public void sumArrayNegativeNumbers() {
        int[] array = new int[]{-7, -3};
        int expctedResult = -10;
        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult, expctedResult);
    }


    //happy path eqqual numbers
    @Test
    public void sumArrayEqualNumbers() {
        int[] array = new int[]{500000, -500000, -5, 5};
        int expctedResult = 0;
        int actualResult = new SumArray().sumArray(array);
        Assert.assertEquals(actualResult, expctedResult);
    }
}
