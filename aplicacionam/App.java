package com.alejandromarquez.aplicacionam;

import com.alejandromarquez.dominioam.*;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // Se crea una lista de empleados llamada empleadosAlejo
        ArrayList<Empleado> empleadosAlejo = new ArrayList<>();

        // Se crean objetos de diferentes tipos de empleados y se inicializan con valores
        Directo Juan = new Directo("Juan", 4_840_000);
        Vendedor Julian = new Vendedor("Julian", 2_050_000, 45_510_000);
        Freelance Johanna = new Freelance("Johanna", 71_000, 89);
        Vendedor Carolina = new Vendedor("Carolina", 980_000, 35_989_000);
        Promotor Pedro = new Promotor("Pedro", 1_200, 300, 62);
        Directo David = new Directo("David", 3_975_000);
        Freelance Gustavo = new Freelance("Gustavo", 42_500, 65);

        // Se agregan los objetos de empleados a la lista empleadosAlejo
        empleadosAlejo.add(Juan);
        empleadosAlejo.add(Julian);
        empleadosAlejo.add(Johanna);
        empleadosAlejo.add(Carolina);
        empleadosAlejo.add(Pedro);
        empleadosAlejo.add(David);
        empleadosAlejo.add(Gustavo);

        // Se crea un objeto de la clase Nomina y se le pasa la lista de empleados como argumento
        Nomina nomina = new Nomina(empleadosAlejo);

        // Se imprimen los salarios de cada empleado individualmente
        // utilizando métodos específicos de cada tipo de empleado
        System.out.println("El salario de " + David.getNombreAlejo() + " es de $" + David.calcularSalarioMarquez() + " siendo empleado directo");
        System.out.println("El salario de " + Juan.getNombreAlejo() + " es de $" + Juan.calcularSalarioMarquez() + " siendo empleado directo");
        System.out.println("El salario de " + Julian.getNombreAlejo() + " es de $" + Julian.calcularSalarioMarquez() + " siendo vendedor");
        System.out.println("El salario de " + Carolina.getNombreAlejo() + " es de $" + Carolina.calcularSalarioMarquez() + " siendo vendedor");
        System.out.println("El salario de " + Pedro.getNombreAlejo() + " es de $" + Pedro.calcularSalarioMarquez() + " siendo promotor");
        System.out.println("El salario de " + Johanna.getNombreAlejo() + " es de $" + Johanna.calcularSalarioMarquez() + " siendo freelance");
        System.out.println("El salario de " + Gustavo.getNombreAlejo() + " es de $" + Gustavo.calcularSalarioMarquez() + " siendo freelance");

        // Se llama al método calcularNominaMarquez() del objeto nomina para calcular la nómina total
        nomina.calcularNominaMarquez();
    }
}

