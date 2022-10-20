import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //positive test
    //if start <=end


    //start<end
    @Test

    public void testStartLessThanEnd_HappyPath() {
        int start = 1;
        int end = 20;
        String[] expctedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
        String[] actualResult = new FizzBuzz().fizzBuz(start, end);

        Assert.assertEquals(actualResult, expctedResult);

    }


    //start=end

    @Test

    public void testStartEquelsThanEnd_HappyPath() {
        int start = 1;
        int end = 1;
        String[] expctedResult = {"1"};
        String[] actualResult = new FizzBuzz().fizzBuz(start, end);

        Assert.assertEquals(actualResult, expctedResult);

    }


    //negative test
    // start < end

    @Test
    public void testStartGrreaterThanEnd_NegativeNambers_HappyPath() {
        int start = 20;
        int end = 1;
        String[] expctedResult = {};
        String[] actualResult = new FizzBuzz().fizzBuz(start, end);

        Assert.assertEquals(actualResult, expctedResult);

    }
}
