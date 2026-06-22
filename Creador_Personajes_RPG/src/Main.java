public class Main {
    public static void main(String[] args) {

        //Creamos la instancia heroe dándole un nombre y un nivel que son los atributos necesarios.
        Personaje heroe = new Personaje("Aragorn", 1);

        //A través de esta función imprimiremos por pantalla los datos del personaje.
        heroe.mostrarInfo();

    }
}