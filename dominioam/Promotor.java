package com.alejandromarquez.dominioam;

public class Promotor extends Empleado {
    private int volantesRepartidosAlejo;
    private long valorVolanteAlejo;
    private int comprasVolanteAlejo;

    // Constructor que recibe el nombreAlejo, volantesRepartidosAlejo, valorVolanteAlejo y comprasVolanteAlejo
    public Promotor(String nombreAlejo, int volantesRepartidosAlejo, long valorVolanteAlejo, int comprasVolanteAlejo) {
        super(nombreAlejo);  // Llama al constructor de la clase base (Empleado) con el nombreAlejo
        this.volantesRepartidosAlejo = volantesRepartidosAlejo;  // Inicializa volantesRepartidosAlejo con el valor proporcionado
        this.valorVolanteAlejo = valorVolanteAlejo;  // Inicializa valorVolanteAlejo con el valor proporcionado
        this.comprasVolanteAlejo = comprasVolanteAlejo;  // Inicializa comprasVolanteAlejo con el valor proporcionado
    }

    // Método para calcular el salario del promotor
    @Override
    public long calcularSalarioMarquez() {
        // Calcula el salario sumando el valor de los volantes repartidos y el valor de las compras de volantes
        long salarioTotal = (long) (valorVolanteAlejo * volantesRepartidosAlejo + 15000 * comprasVolanteAlejo);
        return salarioTotal;
    }



    // Getter para obtener la cantidad de volantes repartidos
    public int getVolantesRepartidosAlejo() {
        return volantesRepartidosAlejo;
    }

    // Getter para obtener el valor de un volante
    public long getValorVolanteAlejo() {
        return valorVolanteAlejo;
    }

    // Getter para obtener la cantidad de compras de volantes
    public int getComprasVolanteAlejo() {
        return comprasVolanteAlejo;
    }

    // Setter para establecer la cantidad de volantes repartidos
    public void setVolantesRepartidosAlejo(int volantesRepartidosAlejo) {
        this.volantesRepartidosAlejo = volantesRepartidosAlejo;
    }

    // Setter para establecer el valor de un volante
    public void setValorVolanteAlejo(long valorVolanteAlejo) {
        this.valorVolanteAlejo = valorVolanteAlejo;
    }

    // Setter para establecer la cantidad de compras de volantes
    public void setComprasVolanteAlejo(int comprasVolanteAlejo) {
        this.comprasVolanteAlejo = comprasVolanteAlejo;
    }
}
