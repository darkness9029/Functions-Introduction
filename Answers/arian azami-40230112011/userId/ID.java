// package userId;
import java.util.Scanner;

public class ID {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = new String();
        x = scan.next();
        while (check(x)=="0") {
            x=scan.next();
        }
         System.out.println(check(x));
    }

    public static String check(String x) {
        if (x.length() < 14 && x.length() > 4) {
            return x;
        }
        return "0";
    }
}