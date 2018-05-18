import java.util.Arrays;

public class Ex6_IncreaseByTenPercent {
    public static void main(String[] args) {
        double [] array = {1, 2, 3, 5, 6, 7, 8, 12};
        double [] v = IncreaceByTenPersent(array, 4);
        System.out.println(Arrays.toString(v));
    }
    static double[] IncreaceByTenPersent (double[]array, int index) {
        double[] result = array;
        result[index] +=result[index]*0.1;
        return result;
    }
}
