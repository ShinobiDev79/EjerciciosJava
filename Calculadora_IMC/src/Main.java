import java.util.Scanner; // Paso 1: Importamos la herramienta Scanner

public class Main {
    public static void main(String[] args) {
        // Paso 2: Creamos el Scanner y le llamamos "lector"
        Scanner lector = new Scanner(System.in);

        // Paso 3: Imprimimos por pantalla que queremos que realice el usuario.
        System.out.printf("Hola, introduzca su peso en Kilogramos: ");
        // Paso 4: Pedimos que el dato introducido sea un "double" y que se guarde en la variable "peso"
        double peso = lector.nextDouble();

        // Paso 5: Imprimimos por pantalla que queremos que realice el usuario.
        System.out.printf("Hola, introduzca su altura en Metros: ");
        // Paso 6: Pedimos que el dato introducido sea un "double" y que se guarde en la variable "altura"
        double altura = lector.nextDouble();

        // Paso 7: Se realiza el cálculo del IMC y se guarda en la variable creada para ello.
        double imc = peso / (altura * altura);

        // Paso 8: Se imprime el resultado del cálculo anterior.
        System.out.printf("Tu IMC es: %.2f " + imc);

        // Paso 9: Se evalúa el diagnóstico basándonos en el resultado obtenido en el IMC.
        if (imc < 18.5){
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc <=24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25.0 && imc <=29.9){
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
        // Es una buena práctica cerrar el Scanner al terminar.
        lector.close();
    }
}