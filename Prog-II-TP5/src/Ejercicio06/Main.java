package Ejercicio06;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        var mesa = new Mesa(10, 8);
        var cliente = new Cliente("Juan Couchot", 011, 15452563);
        var reserva = new Reserva(LocalDate.now(), LocalTime.NOON, cliente, mesa);
        
        System.out.println(reserva);
    }
}
