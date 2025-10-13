package prog.ii.tp4;

import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        var nomina = instanciarNomina(5);
        imprimirNomina(nomina);
        System.out.println("Aumentamos algunos salarios...");
        nomina[2].aumentarSalario(5000);
        nomina[4].aumentarSalario(0.5); // 50%
        imprimirNomina(nomina);
    }
    
    /**
     * Instancia una nómina de empleados con la cantidad indicada
     */
    private static Empleado[] instanciarNomina(int cantidad) {
        System.out.println("Instanciando nómina:");
        var random = new Random();
        var nomina = new Empleado[cantidad];
        for(int i = 0; i < nomina.length; i++) {
            if (random.nextBoolean()) {
                // constructor completo
                nomina[i] = new Empleado(
                        i, 
                        "Empleado " + i, 
                        "Puesto", 
                        random.nextDouble(500, 1000)
                );    
            } else {
                // constructor reducido
                nomina[i] = new Empleado("Empleado " + i, "Puesto");
            }
        }
        return nomina;
    }

    private static void imprimirNomina(Empleado[] nomina) {
        System.out.println("Imprimiendo nómina:");
        System.out.println(
                "- Total de empleados: " 
                        + Empleado.mostrarTotalEmpleados());
        for(int i = 0; i < nomina.length; i++) {
            System.out.println("- Empleado " + i+ ": " + nomina[i]);
        }
    }
}
