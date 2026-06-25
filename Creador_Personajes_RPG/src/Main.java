import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Creamos una lista dinámica para nuestro ejército.
        ArrayList<Personaje> ejercito = new ArrayList<>();

        Guerrero guerrero1 = new Guerrero("Aragorn", 2, 64.5);
        ejercito.add(guerrero1);
        Mago magoGris = new Mago("Gandalf", 2, 100, 40 );
        ejercito.add(magoGris);
        Guerrero guerrero2 = new Guerrero("Boromir", 1, 80);
        ejercito.add(guerrero2);
        Mago magoBlanco = new Mago("Saruman", 5,100,50);
        ejercito.add(magoBlanco);

        for(int i = 0; i < ejercito.size(); i++){
            ejercito.get(i).mostrarInfo();
            ejercito.get(i).atacar();
        }

        /*
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

        //Se crea un nuevo personaje Mago que hereda de la clase Personaje, pero también tiene sus atributos y métodos propios.
        Mago mago = new Mago("Gandalf", 1, 100.0, 50);

        //Mostramos la información del personaje Mago mejorada.
        mago.mostrarInfo();

        //Se lanza la función específica para el personaje Mago.
        mago.lanzarHechizo();*/
    }
}