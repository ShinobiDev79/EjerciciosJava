package webgremio;

public class Aventurero {
    private String nombre;
    private String clase;
    private int misionesCompletadas;

    // Constructor
    public Aventurero(String nombre, String clase, int misionesCompletadas) {
        this.nombre = nombre;
        this.clase = clase;
        this.misionesCompletadas = misionesCompletadas;
    }

    // GETTERS (¡Obligatorios! Spring Boot los usa para leer los datos y armar el JSON)
    public String getNombre() { return nombre; }
    public String getClase() { return clase; }
    public int getMisionesCompletadas() { return misionesCompletadas; }
}
