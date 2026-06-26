public class Cazador extends Aventurero{

    public Cazador(String nombre, int misionesCompletadas) {
        super(nombre, misionesCompletadas);
    }

    public double calcularSalario(){

        return getMisionesCompletadas() * 150.0;

    }
}
