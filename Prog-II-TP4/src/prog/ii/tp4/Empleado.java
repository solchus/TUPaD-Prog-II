package prog.ii.tp4;

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int contadorId =100;

    //CONSTRUCTOR 1 - todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        contadorId++;
    }
    //CONSTRUCTOR 2 - NOMBRE Y PUESTO, ID AUTO (empieza a partir de 100), SALARIO DEFAULT
    public Empleado(String nombre, String puesto){
        this.nombre = nombre;
        this.puesto = puesto;
        totalEmpleados++;
        contadorId++;
        this.id = contadorId;
        this.salario = 200000;    
    }
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto="
                + puesto + ", salario=" + salario + '}';
    }
    
    public void aumentarSalario(int cantidadFija) {
        this.salario += cantidadFija;
    }
    
    public void aumentarSalario(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 1) {
            throw new IllegalArgumentException(
                    "Porcentaje de aumento debe estar entre 0 y 1"
            );
        }
        this.salario = this.salario + (this.salario * porcentaje);
    }
}
