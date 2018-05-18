public class Ex8_Even_Odd {
    public static void main(String[] args) {
        int a = 1 ;
        EvenOrOdd(a);
    }
    static void EvenOrOdd (int a) {
        if (a%2 == 0)
            System.out.println("This number is Even");
        else if(a%2 !=0)
            System.out.println("Tjhis number is Odd");
    }
}
