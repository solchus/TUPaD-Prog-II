/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Nicolás
 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Ana", 300000));
        empleados.add(new EmpleadoTemporal("Luis", 2000, 80));
        empleados.add(new EmpleadoPlanta("Marta", 350000));
        empleados.add(new EmpleadoTemporal("Juan", 2500, 60));

        for (Empleado empleado : empleados) {
            double sueldo = empleado.calcularSueldo();

            String tipo;
            if (empleado instanceof EmpleadoPlanta) {
                tipo = "Empleado de planta";
            } else if (empleado instanceof EmpleadoTemporal) {
                tipo = "Empleado temporal";
            } else {
                tipo = "Otro tipo de empleado";
            }

            System.out.println(tipo + " - " + empleado.getNombre()
                    + " - Sueldo: $" + sueldo);
        }
    }
}
