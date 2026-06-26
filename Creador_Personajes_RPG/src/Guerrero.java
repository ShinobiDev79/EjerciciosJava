public class Guerrero extends Personaje implements Comerciante{
    //Atributo de la clase.
    private int oro;

    //Constructor de la clase.
    public Guerrero(String nombre, int nivel, double puntosVida, int oro) {
        super(nombre, nivel, puntosVida);
        this.oro = oro;
    }

    //Sobrescritura de la función atacar de la clase abstracta Personaje para utilizarla en la subclase Guerrero.
    @Override
    public void atacar(){
        System.out.println("!" + getNombre() + ", blande su espada de acero y asesta un golpe crítico!");
    }

    @Override
    public void comprar(String item, int precio){
        this.oro -= precio;
        System.out.println(getNombre() + ", ha comprado " + item + " por " + precio + " monedas de oro! Oro restante: " + this.oro);
    }
}
