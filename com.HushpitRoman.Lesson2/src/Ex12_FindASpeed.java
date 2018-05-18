import java.util.Scanner;

public class Ex12_FindASpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is a distans in km: ");
        double N = sc.nextDouble();
        System.out.print("How much time do you have in hour: ");
        double T  = sc.nextDouble();
        FindASpeed(N,T);
    }
    static void FindASpeed (double N, double T) {
        double velosity = N/T;
        System.out.println("Velosity you beed to be in time is " + velosity);
    }
}
