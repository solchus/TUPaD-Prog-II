package Ejercicio07;

public class Motor {
    private String numeroSerie;
    private TipoMotor tipo;

    public Motor(String numeroSerie, TipoMotor tipo) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motor{" + "numeroSerie=" + numeroSerie + ", tipo=" + tipo + '}';
    }
    
}
