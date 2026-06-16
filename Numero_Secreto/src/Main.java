import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numSecret = (int) (Math.random() * 100) + 1;
        int numUser = 0;
        int intentos = 0;

        Scanner lector = new Scanner(System.in);

        do{
            System.out.printf("Introduzca el número secreto: ");
            numUser = lector.nextInt();
            intentos += 1;
            //System.out.printf("\n");

            if(numUser < numSecret){

                System.out.println("¡No! El número secreto es mayor.");

            } else if (numUser > numSecret) {

                System.out.println("¡No! El número secreto es menor.");

            } else{
                System.out.println("¡Felicidades! Has adivinado el número.");
                System.out.printf("Te ha llevado %d intentos", intentos);
            }
        }while(numUser != numSecret);

        lector.close();
    }
}