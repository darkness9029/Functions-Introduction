import java.util.Scanner;

public class increapt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x = new String();
        x = scan.nextLine();
       int y= scan.nextInt();
     System.out.println(shift(x, y));
    }

    public static String shift(String x, int y) {
        String G = "";
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i)==' ') {
                G=G+' ';
                continue;
            }
            char H=x.charAt(i);
            int F = x.charAt(i) - y;
            if (F<65) {
                F+=26;
            }
            else if(H>=97 && F<97){
             F+=26;
            }
            char D = (char) F;
            G = G + D;
        }
        return G;
    }
}
