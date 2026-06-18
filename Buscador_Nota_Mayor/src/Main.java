import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Paso 1: Se declaran variables
        Scanner lector = new Scanner(System.in);
        double[] notas = new double[5];
        double notaMayor = 0;
        int cont = 0;

        //Paso 2: Petición al usuario de introducir las notas para evaluar.
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Introduce la nota %d: ", i);
            notas[cont] = lector.nextDouble();
            cont += 1;
        }

        //Paso 3: Evaluamos las notas ingresadas para determinar la mayor nota.
        for (int i = 0; i < 5; i++){
                if(notas[i] >= notaMayor){
                    notaMayor =  notas[i];
                }
            }

        //Paso 4: Se imprime por pantalla la nota mayor de las introducidas por el usuario.
        System.out.printf("La nota más alta de la clase es: %.2f", notaMayor);
    }
}