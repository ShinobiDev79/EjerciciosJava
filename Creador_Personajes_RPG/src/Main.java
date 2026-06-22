public class Main {
    public static void main(String[] args) {

        //Creamos la instancia montaraz dándole un nombre y un nivel que son los atributos necesarios.
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

        //Búnker del personaje, crearémos una forma de asegurar que no pueda tomar valores inferiores a 0.0 o mayores a 100.0
        montaraz.setPuntosVida(-50.0);
        montaraz.mostrarInfo();

        Mago mago = new Mago("Gandalf", 1, 100.0, 50);

        mago.mostrarInfo();

        mago.lanzarHechizo(mago.getNombre());

    }
}