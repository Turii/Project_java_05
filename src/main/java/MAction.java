public class MAction {
    //Given an integer M perform the following conditional actions:
    //If M is multiple of 7 and 9 then return "Good Number".
    //If M is only multiple of 9 and not of 7  then return "Bad Number"
    //If M is only multiple of 11 then return "Poor Number"
    //If M doesn't satisfy any of the above conditions then return "-1"
    public String mAction(int number) {
        String myStr = "";

        if (number % 63 == 0) {
            myStr = "Good Number";
        } else if (number % 9 == 0 && number % 7 != 0) {
            myStr = "Bad Number";
        } else if (number % 11 == 0) {
            myStr = "Poor Number";
        } else {myStr = "-1";}

        return myStr;
    }


}
