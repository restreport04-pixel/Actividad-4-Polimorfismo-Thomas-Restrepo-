package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        Automovil auto1 = new Automovil("Toyota", "Corolla", 2022, true);
        Camion camion1 = new Camion("Volvo", "FH16", 2018, 12.5);
        MotoCicleta moto1 = new MotoCicleta("Yamaha", "MT-07", 2023, 689);

        listaVehiculos.add(auto1);
        listaVehiculos.add(camion1);
        listaVehiculos.add(moto1);

        System.out.println("=== CÁLCULO DE MANTENIMIENTO DE LA FLOTA ===");

        for (Vehiculo v : listaVehiculos) 
            {
                double costo = v.calcularMantenimiento();

                System.out.println("Vehículo: " + v.getMarca() + " " + v.getModelo() + " | Costo Mantenimiento: $" + costo);
            }
    }
}