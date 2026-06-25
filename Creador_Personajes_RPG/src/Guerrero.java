public class Guerrero extends Personaje{

    public Guerrero(String nombre, int nivel, double puntosVida) {
        super(nombre, nivel, puntosVida);
    }

    @Override
    public void atacar(){
        System.out.println("!" + getNombre() + ", blande su espada de acero y asesta un golpe crítico!");
    }
}
