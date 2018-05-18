public class Ex7_bigger_of_two {
    public static void main(String[] args) {
        int a = 55;
        int b = 6;
        System.out.println(higher(a,b));
    }

    public static int higher (int a, int b) {
        if (a>b)
            return a;
        else return b;
    }
}
