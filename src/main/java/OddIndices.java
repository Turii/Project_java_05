public class OddIndices {
    /*Написать алгоритм OddIndices, который принимает массив целых чисел,
     и возвращает массив значений нечетных индексов
    Test Data:
    Input = {-45, 590, 234, 985, 12, 68}
    Expected Result =  {590, 985, 68}
*/
    public int[] oddIndices(int[] array) {
        /*if (array[0] = null) {

            return array{0};
        }*/

        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 != 0) {
                int[] arrayresult = new int[array.length / 2];
                arrayresult[i] = array[i + 1];
                System.out.println(arrayresult[i]);

                return arrayresult;
            } else if (array.length % 2 == 0) {
                int[] arrayresult = new int[array.length / 2];
                arrayresult[i] = array[i + 1];
                System.out.println(arrayresult[i]);

                return arrayresult;
            } else

                return new int[0]; 
        }
         return new int[0];
    }
}
