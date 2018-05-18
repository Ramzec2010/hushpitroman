public class Ex4_tree_digits_number {
    public static void main(String[] args) {
        int n = 123;
        //int summ = n/100 + (n%100)/10 + n%10;
       // System.out.println(summ);
        int summ2 = 0;
        for (int i = n; i > 0;){
            int a = i%10;
            summ2 +=a;
            i = i/10;
        }
        System.out.println(summ2);
    }
}
