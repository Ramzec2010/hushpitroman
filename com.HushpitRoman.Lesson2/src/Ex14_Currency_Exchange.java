public class Ex14_Currency_Exchange {
    public static void main(String[] args) {
        double grivna = 526.25;
        double rates = 26.54;
        double dollars = Exchange(grivna, rates);
        System.out.println(dollars);
    }
    static double Exchange (double grivna, double rates) {
        return grivna/rates;
    }
}
