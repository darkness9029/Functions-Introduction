import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String x=new String();
        x=scan.next();
       while (check(x)=="x") {
        System.out.println(" Wrong entry. Try again.");
        x=scan.next();
       }
       System.out.println(check(x));
    }

    public static String check(String x) {
        if (x.charAt(0) == '9' & x.length() == 10) {
            return ("0" + x);
        }
        return "x";
    }
}
