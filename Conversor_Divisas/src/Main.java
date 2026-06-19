import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Paso 1: Declaramos las variables.
        Scanner lector = new Scanner(System.in);
        double cantidad;
        double conversion;

        //Paso 2: Se pide al usuario que introduzca los datos solicitados.
        System.out.print("Introduce la cantidad en euros: ");
        cantidad = lector.nextDouble();

        conversion = conversorDivisa(cantidad);

        System.out.printf("La cantidad introducida en dólares es: %.2f dólares", conversion);

        lector.close();
    }

    public static double conversorDivisa(double cantidad){
        return cantidad * 1.08;
    }
}