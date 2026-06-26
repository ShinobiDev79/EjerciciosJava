public class Main {
    public static void main(String[] args) {

        // Una mochila con solo 3 posiciones (índices 0, 1 y 2)
        String[] mochila = {"Poción de Vida", "Escudo de Madera", "Cuerda"};

        // CAMBIA ESTE NÚMERO PARA HACER TUS PRUEBAS:
        // Prueba con: 1 (Funciona), 5 (Error de índice), -1 (Otro error de índice)
        int indiceElegido = 5;

        try {
            System.out.println("🎒 Abriendo la mochila en la posición " + indiceElegido + "...");

            String objeto = mochila[indiceElegido]; // <- Línea peligrosa

            System.out.println("✨ ¡Has sacado: " + objeto + "!");

        }
        // Ventanilla 1: Error si el índice está fuera de los límites del Array
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠️ ¡Error en la mochila! Ese espacio no existe. Tu mochila solo tiene " + mochila.length + " huecos.");
        }
        // Ventanilla 2: Un catch genérico por si ocurre cualquier OTRO error inesperado
        catch (Exception e) {
            System.out.println("🚨 Ha ocurrido un error desconocido: " + e.getMessage());
        }

        System.out.println("🚀 Fin del inventario. El juego continúa.");
    }
}