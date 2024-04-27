/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_practico_poo_2;

/**
 *
 * @author HP AiO
 */
public class EXAMEN_PRACTICO_POO_2 {

    public static void main(String[] args) {
        Empleado empleado1 = new EmpleadoDePlanta("Saul", 3000);
        Empleado empleado2 = new EmpleadoPorHoras("Raul", 0, 120, 10);
        Empleado empleado3 = new EmpleadoContrato("Emiliano", 4000);

        // Imprimir los datos de cada empleado
        imprimirDatos(empleado1);
        imprimirDatos(empleado2);
        imprimirDatos(empleado3);
    }

    // Método para imprimir los datos de un empleado
    public static void imprimirDatos(Empleado empleado) {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario anual: " + empleado.calcularSalarioAnual());
        System.out.println("-----------------------------");
    }
}
