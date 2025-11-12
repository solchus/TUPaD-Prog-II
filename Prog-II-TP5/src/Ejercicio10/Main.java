package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        var titular = new Titular("Alejandro Perez", "93939393");
            var cuenta = new CuentaBancaria(
                    "123123123123123123123", 
                    5200d, 
                    titular, 
                    "Test543"
            );
            
        System.out.println(cuenta);
    }
}
