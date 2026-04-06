package uy.edu.um;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        validarLado(lado);
        this.lado = lado;
    }

    public Cuadrado(double lado, String nombre) {
        super(nombre);
        validarLado(lado);
        this.lado = lado;
    }

    private void validarLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("El lado del cuadrado debe ser mayor a 0");
        }
    }

    @Override
    public double getArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double getPerimetro() {
        return 4 * lado;
    }

    @Override
    public String getTipo() {
        return "cuadrado";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
