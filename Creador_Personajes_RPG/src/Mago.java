public class Mago extends Personaje{
    //Atributos de la clase.
    private int mana;

    //Constructor de la clase.
    public Mago(String nombre, int nivel, double puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    //Función solo para este personaje que consume 10 de maná.
    public void lanzarHechizo(String nombre){
        mana -= 10;
        System.out.printf("%s ha lanzado una bola de fuego! Mana restante: %d", nombre, mana);
    }
}
