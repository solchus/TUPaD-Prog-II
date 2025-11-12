package Ejercicio09;


import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        var obraSocial = new ObraSocial("OSDE", "OSDE");
        var paciente = new Paciente("Ricardo V.", obraSocial);
        var profesional = new Profesional("Alberto Méndez", "Cardiología");
        var cita = new CitaMedica(
                LocalDate.now(), 
                LocalTime.NOON, 
                paciente, 
                profesional
        );
                
        System.out.println(cita);
    }
}
