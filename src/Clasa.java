import java.util.Scanner;

public class Clasa {
    public static void main (String[]arg){

        System.out.println("Arata temperatura:");
        Scanner sc = new Scanner(System.in);
        int temp =  sc.nextInt();
        if (temp >=100){

            System.out.println("Apa clocoteste");

        }else{

            System.out.println("Apa nu clocoteste");
        }
    }

}