import java.util.Scanner;
public class infoshift {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       String x=new String();
       x=scan.nextLine();
       String A=x;
       for(int i=0;i<x.length();i++){
        int F=x.charAt(i)+3;
        char D=(char)F;
           System.out.print(D);
       }
  //   char A='Z';
  //   int G=A;
  //  //  char M=(char)G;
  //   System.out.println(G);
  //  //  System.out.println(D);
    }

}