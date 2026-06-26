public abstract class Aventurero {
    //Atributos de la clase.
    private final String nombre;
    private int misionesCompletadas;

    //Constructor de la clase.
    public Aventurero(String nombre, int misionesCompletadas) {
        this.nombre = nombre;
        this.misionesCompletadas = misionesCompletadas;
    }

    //Getters de la clase.
    public String getNombre() {
        return nombre;
    }

    public int getMisionesCompletadas() {
        return misionesCompletadas;
    }

    //Setters de la clase.
    public void setMisionesCompletadas(int misionesCompletadas) {
        if(misionesCompletadas < 0){
            misionesCompletadas = 0;
        }
        this.misionesCompletadas = misionesCompletadas;
    }

    //Función mostrar datos de los personajes.
    public void mostrarInfo(){
        System.out.println(" ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Misiones Completadas: " + getMisionesCompletadas());
        System.out.println("Salario: " + calcularSalario());
    }

    //Función abstracta.
    public abstract double calcularSalario();
}
