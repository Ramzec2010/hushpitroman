import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2_Sum_of_numb_in_n {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int sum;

        do {
            System.out.print("Write a number that hire than nine and less than 100: ");
            n = Integer.parseInt(reader.readLine());
        }
        while (n < 9 && n > 100);
        sum= n/10 + n%10;
        System.out.println("Result: " + sum);

    }
}
