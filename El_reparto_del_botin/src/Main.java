//Main limpio para realizar pruebas aisladas.

public class Main {
    public static void main(String[] args) {
        int oroTotal = 500;
        int aventurerosActivos = 0; // ¡Oh, no! No queda nadie.

        // 1. Abre el búnker de pruebas
        try {
            System.out.println("Intentando calcular el reparto del botín...");

            // Esta línea va a lanzar un ArithmeticException porque no se puede dividir por 0
            int oroPorPersona = oroTotal / aventurerosActivos;

            System.out.println("A cada aventurero le tocan: " + oroPorPersona + " monedas.");

        }
        // 2. Atrapamos el error específico de matemáticas
        catch (ArithmeticException e) {
            System.out.println("⚠️ ¡ERROR CRÍTICO! No puedes dividir el oro entre 0 aventureros.");
            System.out.println("Motivo técnico del sistema: " + e.getMessage());
        }
        // 3. El cierre seguro
        finally {
            System.out.println("🧹 Limpieza del sistema: Proceso de reparto finalizado.");
        }

        System.out.println("🚀 ¡El programa no se colgó! Continuamos con el juego de forma segura.");
    }
}