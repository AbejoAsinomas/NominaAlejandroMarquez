package com.alejandromarquez.dominioam;

public abstract class Empleado {
    private String nombreAlejo;

    // Constructor que recibe el nombreAlejo
    public Empleado(String nombreAlejo) {
        this.nombreAlejo = nombreAlejo;  // Inicializa el nombreAlejo con el valor proporcionado
    }

    // Método abstracto para calcular el salario del empleado (debe ser implementado en subclases)
    public abstract long calcularSalarioMarquez();



    // Getter para obtener el nombreAlejo
    public String getNombreAlejo() {
        return nombreAlejo;
    }

    // Setter para establecer el nombreAlejo
    public void setNombreAlejo(String nombreAlejo) {
        this.nombreAlejo = nombreAlejo;
    }
}

