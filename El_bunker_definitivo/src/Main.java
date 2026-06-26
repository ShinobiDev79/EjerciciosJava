public class Main {

    // Un método estático simulando el "setter" de tu personaje
    public static void setMisionesCompletadas(int misiones) {
        if (misiones < 0) {
            // Lanzamos activamente un error de "Argumento Ilegal"
            throw new IllegalArgumentException("¡Las misiones no pueden ser negativas! Valor recibido: " + misiones);
        }
        System.out.println("✅ Misiones actualizadas con éxito a: " + misiones);
    }

    public static void main(String[] args) {

        // PRUEBA 1: El entorno feliz
        try {
            System.out.println("Intentando registrar misiones válidas...");
            setMisionesCompletadas(5); // Esto funcionará bien
        } catch (IllegalArgumentException e) {
            System.out.println("Error atrapado: " + e.getMessage());
        }

        System.out.println("-------------------------------------------");

        // PRUEBA 2: El tramposo
        try {
            System.out.println("Intentando registrar un hackeo de misiones...");
            setMisionesCompletadas(-10); // ¡Esto va a disparar el throw!
            System.out.println("Este mensaje nunca se leerá porque el throw corta el flujo.");
        }
        catch (IllegalArgumentException e) {
            System.out.println("🛡️ ¡BÚNKER ACTIVADO! Se intentó saltar las reglas.");
            System.out.println("Mensaje del sistema: " + e.getMessage());
        }

        System.out.println("\n🚀 ¡Fin de la simulación! El juego sigue a salvo.");
    }
}