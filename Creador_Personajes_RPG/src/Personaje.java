public abstract class Personaje {
    //Atributos de la clase.
    private final String nombre;
    private int nivel;
    private double puntosVida;

    //Constructor de la clase.
    public Personaje(String nombre, int nivel, double puntosVida){
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    //Getters de la clase.
    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public double getPuntosVida() {
        return puntosVida;
    }

    //Setters de la clase con regla de seguridad.
    public void setPuntosVida(double puntosVida) {

        if(puntosVida < 0.0){
            puntosVida = 0.0;
        } else if (puntosVida > 100.0) {
            puntosVida = 100.0;
        }
        this.puntosVida = puntosVida;
    }

    //Función para imprimir los datos del personaje.
    public void mostrarInfo(){
        System.out.println(" ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de vida: " + puntosVida);
    }

    //Función al recibir daño el personaje.
    public void recibirDanio (double cantidad){
        setPuntosVida(this.puntosVida - cantidad);
        System.out.println(" ");
        System.out.println(nombre + ", ha recibido " + cantidad + " puntos de daño!");
    }

    //Función al subir de nivel el personaje.
    public void subirNivel(){
        nivel += 1;
        puntosVida = 100;
        System.out.println(" ");
        System.out.println(nombre + ", ha subido al nivel " + nivel + " y se restauró su vida.");
    }

    public abstract void atacar();
}
