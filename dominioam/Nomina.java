package com.alejandromarquez.dominioam;

import java.util.ArrayList;

public class Nomina {

    private ArrayList<Empleado> empleadosAlejo;

    // Constructor que recibe una lista de empleados
    public  Nomina(ArrayList<Empleado> empleados) {
        this.empleadosAlejo = new ArrayList<>();
    }

    // Método para calcular la nómina de los empleados
    public void calcularNominaMarquez() {
        for (Empleado empleado : empleadosAlejo) {
            double salario = empleado.calcularSalarioMarquez();
            System.out.println("El salario de " + empleado.getNombreAlejo() + " es: $" + salario);
        }
    }

    // Getter para obtener la lista de empleados
    public ArrayList<Empleado> getEmpleadosAlejo() {
        return empleadosAlejo;
    }

    // Setter para establecer la lista de empleados
    public void setEmpleadosAlejo(ArrayList<Empleado> empleadosAlejo) {
        this.empleadosAlejo = empleadosAlejo;
    }
}
