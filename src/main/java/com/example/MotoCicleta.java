package com.example;

public class MotoCicleta extends Vehiculo{

    private int cilindraje;

    public MotoCicleta(String marca, String modelo, int año, int cilindraje){
        super(marca, modelo, año);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje(){
        return cilindraje;
    }

    public void setCilindraje(int cilindraje){
        this.cilindraje = cilindraje;
    }

    @Override 
    public double calcularMantenimiento(){
        double costoBase = super.calcularMantenimiento();
        double recargoCilindraje = this.cilindraje * 0.15;
        return  costoBase + recargoCilindraje;
    }

}
