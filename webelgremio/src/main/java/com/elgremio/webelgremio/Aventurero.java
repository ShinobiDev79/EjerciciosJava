package com.elgremio.webelgremio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // 👈 ¡ESTA ES LA ETIQUETA MÁGICA QUE FALTA!
public class Aventurero {

    @Id // 👈 Le dice a MySQL que este es el ID único
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremental (1, 2, 3...)
    private Long id;

    private String nombre;
    private String clase;
    private int misionesCompletadas;

    // 👈 CONSTRUCTOR VACÍO: Obligatorio para la Base de Datos
    public Aventurero() {
    }

    // Constructor normal para usar en tu Controlador
    public Aventurero(String nombre, String clase, int misionesCompletadas) {
        this.nombre = nombre;
        this.clase = clase;
        this.misionesCompletadas = misionesCompletadas;
    }

    // --- GETTERS Y SETTERS (Imprescindibles para Spring Boot) ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getClase() { return clase; }
    public void setClase(String clase) { this.clase = clase; }

    public int getMisionesCompletadas() { return misionesCompletadas; }
    public void setMisionesCompletadas(int misionesCompletadas) { this.misionesCompletadas = misionesCompletadas; }
}