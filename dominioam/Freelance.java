package com.alejandromarquez.dominioam;

public class Freelance extends Empleado {
    private long valorHoraAlejo;
    private int horasTrabajadasAlejo;

    // Constructor que recibe el nombreAlejo, valorHoraAlejo y horasTrabajadasAlejo
    public Freelance(String nombreAlejo, long valorHoraAlejo, int horasTrabajadasAlejo) {
        super(nombreAlejo);  // Llama al constructor de la clase base (Empleado) con el nombreAlejo
        this.valorHoraAlejo = valorHoraAlejo;  // Inicializa el valorHoraAlejo con el valor proporcionado
        this.horasTrabajadasAlejo = horasTrabajadasAlejo;  // Inicializa las horasTrabajadasAlejo con el valor proporcionado
    }

    // Método para calcular el salario del empleado freelance
    @Override
    public long calcularSalarioMarquez() {
        // Calcula el salario multiplicando el valor por hora por las horas trabajadas
        return valorHoraAlejo * horasTrabajadasAlejo;
    }


    // Getter para obtener el valorHoraAlejo
    public long getValorHoraAlejo() {
        return valorHoraAlejo;
    }

    // Getter para obtener las horasTrabajadasAlejo
    public int getHorasTrabajadasAlejo() {
        return horasTrabajadasAlejo;
    }

    // Setter para establecer el valorHoraAlejo
    public void setValorHoraAlejo(long valorHoraAlejo) {
        this.valorHoraAlejo = valorHoraAlejo;
    }

    // Setter para establecer las horasTrabajadasAlejo
    public void setHorasTrabajadasAlejo(int horasTrabajadasAlejo) {
        this.horasTrabajadasAlejo = horasTrabajadasAlejo;
    }
}

