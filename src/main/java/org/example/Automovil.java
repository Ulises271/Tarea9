package org.example;

public class Automovil extends Vehiculo{
    protected String estado;
    protected String tipo;
    protected int numDePasajeros;
    protected String acciones;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int anio, String estado, String tipo, int numDePasajeros, String acciones) {
        super(marca, modelo, anio);
        this.estado = estado;
        this.tipo = tipo;
        this.numDePasajeros = numDePasajeros;
        this.acciones = acciones;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumDePasajeros() {
        return this.numDePasajeros;
    }

    public void setNumDePasajeros(int numDePasajeros) {
        this.numDePasajeros = numDePasajeros;
    }

    public String getAcciones() {
        return this.acciones;
    }

    public void setAcciones(String acciones) {
        this.acciones = acciones;
    }

    public void encendiendo() {
        this.estado = "Encendiendo...";
        System.out.println("\nEl automovil se esta" + this.estado);
    }

    public void apagar() {
        this.estado = "Apagado...";
        System.out.println("\nEl automovil se ha " + this.estado);
    }

    public void acelerar() {
        this.acciones = "Avanzando...";
        System.out.println("\nEl automovil esta " + this.acciones);
    }

    public void retroceder() {
        this.acciones = "Retrocediendo...";
        System.out.println("\nEl automovil esta " + this.acciones);
    }

}
