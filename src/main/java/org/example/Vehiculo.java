package org.example;

public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String toString() {
        return "Vehiculo{marca='" + this.marca + "', modelo='" + this.modelo + "', anio=" + this.anio + "}";
    }

    public void encendiendo() {
        System.out.println("\nEl vehiculo se esta encendiendo...");
    }

    public void apagar() {
        System.out.println("\nEl vehiculo se apago...");
    }
}
