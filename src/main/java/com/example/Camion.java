package com.example;

public class Camion extends Vehiculo{

    private double capacidadCarga;

    public Camion(String marca, String modelo, int año, double capacidadCarga){
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga(){
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    @Override 
    public double calcularMantenimiento(){
        double costoBase = super.calcularMantenimiento();
        double recargoCarga = this.capacidadCarga * 50.0;
        return costoBase + recargoCarga;
    }

}
