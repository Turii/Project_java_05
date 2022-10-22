import org.testng.Assert;
import org.testng.annotations.Test;

public class MActionTest {
    //Given an integer M perform the following conditional actions:
    //If M is multiple of 7 and 9 then return "Good Number".
    //If M is only multiple of 9 and not of 7  then return "Bad Number"
    //If M is only multiple of 11 then return "Poor Number"
    //If M doesn't satisfy any of the above conditions then return "-1"


    // If M is multiple of 7 and 9 then return "Good Number". number = 126
    @Test
    public void testMActionNumberMultiple63() {
        int number = 126;
        String acttualResult = "Good Number";
        String expectedResult = new MAction().mAction(number);

        Assert.assertEquals(acttualResult, expectedResult);
    }

    //If M is only multiple of 9 and not of 7  then return "Bad Number"
    @Test
    public void testMActionNumberMultiple9Not7() {
        int number = 45;
        String acttualResult = "Bad Number";
        String expectedResult = new MAction().mAction(number);

        Assert.assertEquals(acttualResult, expectedResult);
    }

    //If M is only multiple of 11 then return "Poor Number"
    @Test
    public void testMActionNumberMultiple11() {
        int number = 33;
        String acttualResult = "Poor Number";
        String expectedResult = new MAction().mAction(number);

        Assert.assertEquals(acttualResult, expectedResult);
    }


    //If M doesn't satisfy any of the above conditions then return "-1"
    @Test
    public void testMActionNumberNotSatisfyConditions() {
        int number = 145;
        String acttualResult = "-1";
        String expectedResult = new MAction().mAction(number);

        Assert.assertEquals(acttualResult, expectedResult);
    }
}
