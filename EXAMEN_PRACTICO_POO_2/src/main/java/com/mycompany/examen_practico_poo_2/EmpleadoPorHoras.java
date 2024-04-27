/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_practico_poo_2;

/**
 *
 * @author HP AiO
 */
public class EmpleadoPorHoras extends Empleado {
    private final int horasTrabajadas;
    private final double salarioPorHora;

    public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas, double salarioPorHora) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }
    @Override
    public double calcularSalarioAnual() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
}
