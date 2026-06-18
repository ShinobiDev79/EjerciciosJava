import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sumaTemperaturas = 0;
        double mediaTemperaturas = 0;
        Scanner lector = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Introduzca la temperatura del día %d: ", i);
            double nuevaTemperatura = lector.nextDouble();
            sumaTemperaturas += nuevaTemperatura;
        }

        mediaTemperaturas = sumaTemperaturas / 5;

        if (mediaTemperaturas >= 25){
            System.out.printf("\nHa sido una semana calurosa con una media de %.2f grados \n", mediaTemperaturas);
        }else {
            System.out.printf("\nHa sido una semana templada con una media de %.2f grados \n", mediaTemperaturas);
        }

        lector.close();
    }
}