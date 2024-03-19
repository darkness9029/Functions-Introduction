import java.util.Scanner;

public class habit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] x = new String[10];
        for (int i = 0; i < 10; i++) {
            x[i] = scan.nextLine();
        }
        System.out.print(" {");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " , ");
        }
        System.out.print(" } ");
    }
}
