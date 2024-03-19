import java.util.Scanner;

public class answer {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String x = new String();
    String y = new String();
    x = scan.next();
    y = scan.next();
    System.out.println(firstname(x) +" "+ lastname(y));
  }

  public static String firstname(String x) {

    return (x.toUpperCase().charAt(0) + x.toLowerCase().substring(1, x.length()));
  };

  public static String lastname(String x) {
    return (x.toUpperCase().charAt(0) + x.toLowerCase().substring(1, x.length()));
  }
}
