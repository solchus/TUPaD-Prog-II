package Ejercicio05;

public class Main {
    public static void main(String[] args) {
        var placa = new PlacaMadre("Gigabyte B760m Ax-p Kawaii Ddr5", "B850");
        var propietario = new Propietario("Nicolas Macaris", "4564562");
        var pc = new Computadora("Gigabyte", "ATX6589654", placa, propietario);
        
        System.out.println(pc);
    }
}