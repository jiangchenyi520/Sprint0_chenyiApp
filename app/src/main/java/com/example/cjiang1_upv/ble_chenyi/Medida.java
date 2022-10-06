package com.example.cjiang1_upv.ble_chenyi;

public class Medida {

    private int id;
    private float valor;
    private String tiempo;
    private String nombre;
    private Coordenadas coordenadas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Medida(int id, float valor, String tiempo, String nombre, Coordenadas coordenadas) {
        this.id = id;
        this.valor = valor;
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.coordenadas = coordenadas;
    }
}
