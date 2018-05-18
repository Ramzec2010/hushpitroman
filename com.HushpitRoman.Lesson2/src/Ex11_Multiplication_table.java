public class Ex11_Multiplication_table {

    public static void main(String[] args) {
        int a = 12;
        MultiplicationTable(12);
    }
    static void MultiplicationTable (int n) {
        for (int i = 0; i <=10; i++) {
            System.out.println(i + "*" + n + " = " + (i*n));
        }
    }
}
