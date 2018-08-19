import java.util.Random;
import java.util.Scanner;

public class Clasa {
    public static void main (String[]arg){

        //creaza scanner input
        Scanner scanner = new Scanner(System.in);
        //output the prompt
   /* System.out.println("adauga un numar");
    int value = scanner.nextInt();
    while (value != 5){

        System.out.println("adauga numarul");
        value = scanner.nextInt();
    } */
        int value = 0;
        do {
            System.out.println("adauga un nr");
            value = scanner.nextInt();


        }
        while ( value != 5);
        System.out.println("ai 5");
    }

}