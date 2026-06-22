public class Main {
    public static void main(String[] args) {

        //Creamos la instancia heroe dándole un nombre y un nivel que son los atributos necesarios.
        Personaje montaraz = new Personaje("Aragorn", 1, 100.0);

        //A través de esta función imprimiremos por pantalla los datos iniciales del personaje.
        montaraz.mostrarInfo();

        //Con esta función, el personaje recibirá daño.
        montaraz.recibirDanio(35.5);

        //Volvemos a mostrar la información del personaje después del daño recibido.
        montaraz.mostrarInfo();

        //Con esta función, el personaje sube un nivel tras ganar el combate.
        montaraz.subirNivel();

        //Al final mostramos los datos actualizados del personaje.
        montaraz.mostrarInfo();

    }
}