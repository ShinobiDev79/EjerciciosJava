public class Caballero extends Aventurero implements Escudero{

    public Caballero(String nombre, int misionesCompletadas) {
        super(nombre, misionesCompletadas);
    }

    public double calcularSalario(){

        return (getMisionesCompletadas() * 200.0) + honor();

    }

    @Override
    public double honor(){
        return 50.0;
    }
}
