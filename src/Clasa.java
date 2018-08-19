import java.util.Random;
import java.util.Scanner;

public class Clasa {
    public static void main (String[]arg){

        Random generator = new  Random();
        int die  = generator.nextInt (6)+1;
        int count = 0;
        if (die != 6){

            System.out.println(die + "valoare");
            count++;
            die = generator.nextInt(6)+1;
        }System.out.println("ai rulat" +count +"ori");
    }
}