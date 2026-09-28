package com.example;

public class Automovil extends Vehiculo{

    private boolean esElectrico;

    public Automovil(String marca, String modelo, int año, boolean esElectrico){
        super(marca, modelo, año);
        this.esElectrico = esElectrico;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    @Override 
    public double calcularMantenimiento(){
        double costoBase = super.calcularMantenimiento();
        double recargoElectrico = 0.0;
        if (this.esElectrico)
        {
            recargoElectrico = 50.0;
        }
        return  costoBase + recargoElectrico;
    }
    

}
