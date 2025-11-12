package Ejercicio07;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var licencia = new Licencia(
                "Maria Sol Couchot", 
                "36777999",
                LocalDate.now(),
                LocalDate.now(),
                "A1"
        );
        var conductor = new Conductor("Maria Sol Couchot", licencia);
        var motor = new Motor("PRS87965474", TipoMotor.HIBRIDO);
        var vehiculo = new Vehiculo(
                "AC000JK", 
                "PEPPER UP",
                motor, 
                conductor
        );
        
        System.out.println(vehiculo);
    }
}
