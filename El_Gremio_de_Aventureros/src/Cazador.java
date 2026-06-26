public class Cazador extends Aventurero{

    public Cazador(String nombre, int misionesCompletadas, double salario) {
        super(nombre, misionesCompletadas, salario);
    }

    public double calcularSalario(){

        return getMisionesCompletadas() * 150.0;

    }
}
