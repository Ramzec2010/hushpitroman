public class Ex15_triangle {
    public static void main(String[] args) {
        Triangle(10,12);
    }
    static void Triangle (double a1, double a2) {
        System.out.println("Площадь прямоугольного треугольника: " + a1*a2/2);
        double c = Math.sqrt((a1*a1) + (a2*a2));
        System.out.println("Гипотеноза: " + c);
        System.out.println("Периметр треугольника: " + (a1 + a2 + c));
    }
}
