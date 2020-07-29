
import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserInterface i = new UserInterface(scanner);
        i.start();
    }

}
