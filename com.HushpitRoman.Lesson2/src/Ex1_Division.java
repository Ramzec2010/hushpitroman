import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1_Division {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int q;
        int w;
        do {
            System.out.print("Enter a natural number q: ");
            q = Integer.parseInt(reader.readLine());
        }
        while (q <= 0);
        do {
            System.out.print("Enter a natural number w: ");
            w = Integer.parseInt(reader.readLine());
        }
        while (w <0);
        System.out.println("Result of division: " + (q/w) + " %: " + (q%w));
    }
}
