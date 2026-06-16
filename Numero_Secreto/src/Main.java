import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numSecret = 42;
        int numUser = 0;
        Scanner lector = new Scanner(System.in);

        do{
            System.out.printf("Introduzca el número secreto: ");
            numUser = lector.nextInt();
            //System.out.printf("\n");

            if(numUser < numSecret){

                System.out.println("¡No! El número secreto es mayor.");

            } else if (numUser > numSecret) {

                System.out.println("¡No! El número secreto es menor.");

            } else{
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        }while(numUser != numSecret);

        lector.close();
    }
}
