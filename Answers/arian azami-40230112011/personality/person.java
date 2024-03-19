package personality;

import java.util.Scanner;
import javax.lang.model.type.NullType;

public class person {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] intrest = new String[10];
        String x = new String();
        String y;
        String z;
        System.out.println("full name:  ");
        x = scan.nextLine();
        System.out.println("phone number: ");
        y = scan.next();
        System.out.println("user ID:  ");
        z = scan.next();
        System.out.println("intrests: ");
        for (int i = 0; i <= intrest.length; i++) {
            intrest[i] = scan.nextLine();
        }
        System.out.println("hello my name is " + x + ". my id is " + z + ". here are some of my intrest:");
        for (int i = 0; i < intrest.length; i++) {
           System.out.println();
            System.out.print(i+1);
            System.out.print(". ");
            System.out.print(intrest[i]);
        }
    }
}
