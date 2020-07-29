
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Plane p;
    private Passenger pass;
    private Seat s;
    private Scanner scanner;
    private int rows;
    private int cols;
    private ArrayList<String> list;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.p = new Plane(this.rows, this.cols);
        this.list = new ArrayList<>();
    }

    public void start() {

        while (true) {
            System.out.println("Ingrese la cantidad de filas:");
            this.rows = Integer.valueOf(scanner.nextLine());
            if (rows > 0 && rows <= 20) {

                break;
            }
            System.out.println("La cantidad de filas no tiene un valor de entre 1 a 20");
        }
        while (true) {
            System.out.println("Ingrese la cantidad de columnas:");
            this.cols = Integer.valueOf(scanner.nextLine());
            if (cols > 0 && cols <= 8) {

                break;
            }
            System.out.println("La cantidad de columnas no tiene un valor de entre 1 a 8");
        }
        p = new Plane(this.rows, this.cols);
        System.out.println(p.toString());
        while (true) {
            int c = 0;
            System.out.println("Este es el mapa del avion:");

            System.out.println();
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Ingresar pasajero");
            System.out.println("2. Consultar asiento");
            System.out.println("3. Consultar pasajero");
            System.out.println();
            System.out.print("Ingrese la opcion: ");
            int choice = Integer.valueOf(scanner.nextLine());
            System.out.println();
            switch (choice) {
                case 1: {
                    int row = 0;
                    String col = "";
                    System.out.println("Ingresar un pasajero:");
                    System.out.print("Ingrese el nombre del pasajero: ");
                    int name = Integer.valueOf(scanner.nextLine());

                    System.out.print("Ingrese el apellido del pasajero: ");
                    int lastname = Integer.valueOf(scanner.nextLine());
                    while (true) {
                        System.out.print("Ingrese la fila del asiento: ");
                        row = Integer.valueOf(scanner.nextLine());
                        System.out.print("Ingrese la columna del asiento: ");
                        col = scanner.nextLine();
                        if (s.isFree()) {
                            break;
                        }
                        System.out.println("Fila o columna ya fueron ingresadas!");
                    }
                    System.out.println();
                    s.setRow(row);
                    s.setCol(col);

                    System.out.println("¡Pasajero ingresado!");
                    c++;
                    System.out.println();
                    p.toString();
                }
                case 2: {
                    System.out.println("Consulta de asiento.");
                    System.out.print("Ingrese la fila del asiento: ");
                    int row = Integer.valueOf(scanner.nextLine());
                    System.out.print("Ingrese la columna del asiento: ");
                    String col = scanner.nextLine();
                    s.toString();
                }
                case 3: {
                    System.out.println("Consulta de pasajero.");
                    System.out.print("Ingrese el nombre y apellido: ");
                    String name = scanner.next();
                    String lastname = scanner.next();
                    if (!s.isFree()) {
                        System.out.println("El pasajero se encuentra en el asiento: ");
                    } else {
                        System.out.println("El pasajero no se encuentra en el avion");
                    }
                }
            }
        }
    }
}
