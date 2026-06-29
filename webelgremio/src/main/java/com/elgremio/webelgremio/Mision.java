package com.elgremio.webelgremio;

//Librerías importadas.
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //Identifica esta clase como una entidad.
public class Mision {

    @Id // Identificador único para utilizar como Primary Key en la base de datos.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrementa en uno los valores id.
    //Atributos de la clase.
    private Long id; //Se modifica el tipo de dato para no provocar errores en el servidor.

    private String titulo;
    private int recompensaOro;
    private boolean completada;

    //Constructor de la clase.
    public Mision(String titulo, int recompensaOro, boolean completada) {
        this.titulo = titulo;
        this.recompensaOro = recompensaOro;
        this.completada = completada;
    }

    //Constructor vacío que faltaba.
    public Mision() {
    }

    //Getters de la clase.
    public Long getId() {return id;}
    public String getTitulo() {return titulo;}
    public int getRecompensaOro() {return recompensaOro;}
    public boolean isCompletada() {return completada;}

    //Setters de la clase.
    public void setId(Long id) {this.id = id;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setRecompensaOro(int recompensaOro) {this.recompensaOro = recompensaOro;}
    public void setCompletada(boolean completada) {this.completada = completada;}
}
