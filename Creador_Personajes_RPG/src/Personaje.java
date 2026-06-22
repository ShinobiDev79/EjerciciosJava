public class Personaje {
    //Atributos de la clase.
    String nombre;
    int nivel;
    double puntosVida;

    //Constructor de la clase.
    public Personaje(String nombre, int nivel, double puntosVida){
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    //Función para imprimir los datos del personaje.
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de vida: " + puntosVida);
        System.out.println(" ");
    }

    //Función al recibir daño el personaje.
    public void recibirDanio (double cantidad){
        puntosVida = puntosVida - cantidad;
        System.out.printf("%s, ha recibido %.2f punto de daño!", nombre, cantidad);
        System.out.println(" ");
    }

    //Función al subir de nivel el personaje.
    public void subirNivel(){
        nivel += 1;
        puntosVida = 100;
        System.out.printf("%s ha subido al nivel %d y se restauró su vida.", nombre, nivel);
        System.out.println(" ");
    }
}
