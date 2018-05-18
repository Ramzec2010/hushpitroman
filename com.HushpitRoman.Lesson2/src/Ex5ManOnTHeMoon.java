import java.util.Scanner;

public class Ex5ManOnTHeMoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mass: ");
        int mass = sc.nextInt();
        double g = 9.81;
        double weigtOnEarth = g*mass;
        double weightOnMoon = weigtOnEarth*0.17;
        System.out.println("Your weight on the Moon is: " + weightOnMoon + " N");

    }
}
