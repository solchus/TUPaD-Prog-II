package Ejercicio04;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var banco = new Banco("Santander", "25456321");
        var cliente = new Cliente("Sol Couchot", "37666444");
        var tarjeta = new TarjetaDeCredito(
                "4710254865241236", 
                LocalDate.now(), 
                cliente, 
                banco
        );
        
        System.out.println(tarjeta);
    }
}
