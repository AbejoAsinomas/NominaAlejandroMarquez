package com.alejandromarquez.dominioam;

public final class Vendedor extends Directo {
    private long ventasDelMesAlejo;

    // Constructor que recibe el nombreAlejo, salarioAlejo y ventasDelMesAlejo
    public Vendedor(String nombreAlejo, long salarioAlejo, long ventasDelMesAlejo) {
        super(nombreAlejo, salarioAlejo);  // Llama al constructor de la clase base (Directo) con el nombreAlejo y salarioAlejo
        this.ventasDelMesAlejo = ventasDelMesAlejo;  // Inicializa ventasDelMesAlejo con el valor proporcionado
    }

    // Método para calcular el salario del vendedor
    @Override
    public long calcularSalarioMarquez() {
        // Calcula el salario sumando el salario base y la comisión basada en las ventas
        long salarioTotal = super.calcularSalarioMarquez() + calcularComisionMarquez();
        return salarioTotal;
    }

    // Método para calcular la comisión del vendedor basada en las ventas
    public Long calcularComisionMarquez() {
        if (getSalarioAlejo() < 999999) {
            return (long) (ventasDelMesAlejo * 0.04);
        } else if (getSalarioAlejo() >= 1000000) {
            return (long) (ventasDelMesAlejo * 0.035);
        } else {
            return 0L;  // No hay comisión si no se cumple ninguna de las condiciones
        }
    }

    // Getter para obtener la cantidad de ventas del mes
    public long getVentasDelMesAlejo() {
        return ventasDelMesAlejo;
    }

    // Setter para establecer la cantidad de ventas del mes
    public void setVentasDelMesAlejo(long ventasDelMesAlejo) {
        this.ventasDelMesAlejo = ventasDelMesAlejo;
    }
}
