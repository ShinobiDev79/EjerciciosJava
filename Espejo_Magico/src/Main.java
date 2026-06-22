import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Paso 1: Declaramos las variables.
        Scanner lector = new Scanner(System.in);
        String textoInvertido = "";

        //Paso 2: Pedimos al usuario la introducción de datos necesarios.
        System.out.print("Introduzca una palabra: ");
        String palabra = lector.nextLine();

        //Paso 3: Creamos el bucle que nos invertirá el texto introducido por el usuario.
        for (int longitudPalabra = palabra.length() - 1; longitudPalabra >= 0; longitudPalabra--) {

            textoInvertido += palabra.charAt(longitudPalabra);

        }

        //Paso 4: Imprimimos por pantalla la palabra introducida por el usuario y esa misma palabra invertida.
        System.out.printf("La palabra introducida era: %s\n", palabra);
        System.out.printf("La palabra invertida es: %s", textoInvertido);

        //Paso 5: Se cierra el lector.
        lector.close();
    }
}