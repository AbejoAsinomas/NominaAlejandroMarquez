package com.alejandromarquez.dominioam;

public class Directo extends Empleado {
    private long salarioAlejo;

    // Constructor que recibe el nombreAlejo y el salarioAlejo
    public Directo(String nombreAlejo, long salarioAlejo) {
        super(nombreAlejo);  // Llama al constructor de la clase base (Empleado) con el nombreAlejo
        this.salarioAlejo = salarioAlejo;  // Inicializa el salarioAlejo con el valor proporcionado
    }

    // Método para calcular el salario del empleado directo
    @Override
    public long calcularSalarioMarquez() {
        // Calcula el salario total restando la salud y la pensión del salarioAlejo
        long salarioTotal = salarioAlejo - calcularSaludMarquez() - calcularPensionMarquez();
        return salarioTotal;
    }

    // Método para calcular la contribución a la pensión
    public Long calcularPensionMarquez() {
        return (long) (salarioAlejo * 0.065);
    }

    // Método para calcular la contribución a la salud
    public Long calcularSaludMarquez() {
        return (long) (salarioAlejo * 0.05);
    }

    // Getter para obtener el salarioAlejo
    public long getSalarioAlejo() {
        return salarioAlejo;
    }

    // Setter para establecer el salarioAlejo
    public void setSalarioAlejo(long salarioAlejo) {
        this.salarioAlejo = salarioAlejo;
    }
}
