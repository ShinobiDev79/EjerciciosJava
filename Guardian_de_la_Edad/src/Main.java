import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        boolean datosValidos = false;
        int edad = 0;

        while(!datosValidos){
            try {
                System.out.print("Introduzca su edad: ");
                edad = lector.nextInt();
                datosValidos = true;
            } catch (Exception e){
                System.out.print("Error: Debes introducir un número entero. Inténtalo de nuevo.\n");
                lector.nextLine();
            }
        }

        System.out.printf("Su edad es: %d", edad);

        lector.close();
    }
}