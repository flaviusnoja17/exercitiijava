import java.util.Scanner;

public class Clasa {
    public static void main (String[]arg){

        System.out.println("Arata temperatura:");
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double farneheit = 9.0 / 5 * celsius +32;
        System.out.println("Farneheit :" +farneheit);

    }

}
