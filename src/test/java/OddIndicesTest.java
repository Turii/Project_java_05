import org.testng.annotations.Test;

public class OddIndicesTest {

    /*Написать алгоритм OddIndices, который принимает массив целых чисел,
     и возвращает массив значений нечетных индексов
    Test Data:
    Input = {-45, 590, 234, 985, 12, 68}
    Expected Result =  {590, 985, 68}
*/

    @Test
    public void tesReturnArrrayOfOddIndices() {
        int[] Input = new int[]{-45, 590, 234, 985, 12, 68};
        int[] expctedResult = {590, 985, 68};
        int[] actualResult = new OddIndices().oddIndices(Input);
    }
}
