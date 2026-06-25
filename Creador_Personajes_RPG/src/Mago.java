public class Mago extends Personaje{
    //Atributos de la clase.
    private int mana;

    //Constructor de la clase.
    public Mago(String nombre, int nivel, double puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    //Función solo para este personaje que consume 10 de maná.
    public void lanzarHechizo(){
        mana -= 10;
        System.out.println(" ");
        System.out.println("!" + getNombre() + ", ha lanzado una bola de fuego! Mana restante: " + mana);
    }

    //Sobrescritura de la función mostrarInfo de la clase Personaje para utilizarla en una versión mejorada en la subclase Mago.
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Maná actual: " + mana);
    }

    @Override
    public void atacar(){
        System.out.println("!" + getNombre() + ", ataca con un rayo de energía arcana!");
    }
}
