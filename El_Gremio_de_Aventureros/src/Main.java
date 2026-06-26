import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Aventurero> gremio = new ArrayList<>();

        Cazador cazador = new Cazador("Gretel", 2);
        gremio.add(cazador);
        Caballero caballero = new Caballero("Hansel",4);
        gremio.add(caballero);

        for(int i=0; i < gremio.size(); i++) gremio.get(i).mostrarInfo();
    }
}