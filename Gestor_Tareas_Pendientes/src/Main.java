import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Paso 1: Se declaran variables.
        Scanner lector = new Scanner(System.in);
        ArrayList<String> listaTareas = new ArrayList<>();

        //Paso 2: Se crea bucle para la introducción de datos del usuario.
        while(true){
            System.out.print("Introduce una tarea (o escribe 'salir' para terminar: ");
            String nuevaTarea = lector.nextLine();

            if(nuevaTarea.equalsIgnoreCase("salir")){
                break;
            }
            listaTareas.add(nuevaTarea);
        }

        //Paso 3: Se crea bucle para imprimir la lista de tareas introducida por el usuario.
        for (int i = 0; i <= listaTareas.size(); i++) {

            String nuevaTarea = listaTareas.get(i);

            if (i == 0){
                System.out.println("Esta es tu lista de tareas: ");
            }
            System.out.printf("%d. %s\n", i + 1, nuevaTarea);
        }

        //Paso 4: Se cierran recursos.
        lector.close();
    }
}