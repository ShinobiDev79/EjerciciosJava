public class Mago extends Personaje{

    private int mana;

    public Mago(String nombre, int nivel, double puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    public void lanzarHechizo(String nombre){
        mana -= 10;
        System.out.printf("%s ha lanzado una bola de fuego! Mana restante: %d", nombre, mana);
    }
}
