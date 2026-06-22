public class Personaje {
    //Atributos de la clase.
    String nombre;
    int nivel;

    //Constructor de la clase.
    public Personaje(String nombreRecibido, int nivelRecibido){
        nombre = nombreRecibido;
        nivel = nivelRecibido;
    }

    //Función para imprimir los datos del personaje.
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
    }
}
