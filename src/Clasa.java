import java.util.Random;
import java.util.Scanner;

public class Clasa {
    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        System.out.println("adauga un text");

        String text = input.nextLine();

        switch(text){

            case"start":

                System.out.println("Masina ruleaza");
                break;

            case "stop":
                System.out.println("Masina nu ruleaza");
                break;

            default:
                System.out.println("Aici nu este nimic");
        }

    }
}