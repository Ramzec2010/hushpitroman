public class Ex16_Farenheit {
    public static void main(String[] args) {
        System.out.println(ExchangeToFarenheit(-20));
    }
    static double ExchangeToFarenheit (double t) {
        return t*9/5 + 32;
    }
}
