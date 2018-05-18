public class Ex9_double_or_not {
    public static void main(String[] args) {

        System.out.println(int_or_not(2.1));
    }
    static boolean int_or_not (double a) {
        int b = (int) a;
        if (b == a)
            return true;
        else
            return false;


    }
}
