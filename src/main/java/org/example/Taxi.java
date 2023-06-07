package org.example;

public class Taxi extends Automovil{
    private String placa;
    private String nombreDelConductor;
    private int inicioDeTaximetro;

    public Taxi() {
    }

    public Taxi(String marca, String modelo, int anio, String estado, String tipo, int numDePasajeros, String acciones, String placa, String nombreDelConductor, int inicioDeTaximetro) {
        super(marca, modelo, anio, estado, tipo, numDePasajeros, acciones);
        this.placa = placa;
        this.nombreDelConductor = nombreDelConductor;
        this.inicioDeTaximetro = inicioDeTaximetro;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombreDelConductor() {
        return this.nombreDelConductor;
    }

    public void setNombreDelConductor(String nombreDelConductor) {
        this.nombreDelConductor = nombreDelConductor;
    }

    public int getInicioDeTaximetro() {
        return this.inicioDeTaximetro;
    }

    public void setInicioDeTaximetro(int inicioDeTaximetro) {
        this.inicioDeTaximetro = inicioDeTaximetro;
    }

    public String toString() {
        return "Taxi{placa='" + this.placa + "', nombreDelConductor='" + this.nombreDelConductor + "', inicioDeTaximetro=" + this.inicioDeTaximetro + ", estado='" + this.estado + "', tipo='" + this.tipo + "', numDePasajeros=" + this.numDePasajeros + ", acciones='" + this.acciones + "', marca='" + this.marca + "', modelo='" + this.modelo + "', anio=" + this.anio + "}";
    }

    public void encendiendo() {
        this.estado = "Encendiendo...";
        System.out.println("\nEl taxi de " + this.nombreDelConductor + " esta " + this.estado);
    }

    public void apagar() {
        this.estado = "Apagado...";
        System.out.println("\nEl taxi de " + this.nombreDelConductor + " se ha " + this.estado);
    }

    public void acelerar() {
        this.acciones = "Avanzando...";
        System.out.println("\nEl taxi de " + this.nombreDelConductor + " esta " + this.acciones);
    }

    public void retroceder() {
        this.acciones = "Retrocediendo...";
        System.out.println("\nEl taxi de " + this.nombreDelConductor + " esta " + this.acciones);
    }

    public void inicioDeViaje() {
        this.inicioDeTaximetro = 8;
        System.out.println("Inicia el viaje de" + this.nombreDelConductor);
    }

    public void detencion() {
        this.placa = "WSL-194";
        System.out.println("Detuvieron el taxi de " + this.nombreDelConductor + " porque su placa con terminacion: " + this.placa + "\n Indica que no circula...");
    }
}
