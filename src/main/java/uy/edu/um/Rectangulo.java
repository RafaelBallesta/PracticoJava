package uy.edu.um;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        super("Rectángulo");
        validarDimensiones(largo, ancho);
        this.largo = largo;
        this.ancho = ancho;
    }

    public Rectangulo(double largo, double ancho, String nombre) {
        super(nombre);
        validarDimensiones(largo, ancho);
        this.largo = largo;
        this.ancho = ancho;
    }

    private void validarDimensiones(double largo, double ancho) {
        if (largo <= 0 || ancho <= 0) {
            throw new IllegalArgumentException("El largo y ancho del rectángulo deben ser mayores a 0");
        }
    }

    @Override
    public double getArea() {
        return largo * ancho;
    }

    @Override
    public double getPerimetro() {
        return 2 * (largo + ancho);
    }

    @Override
    public String getTipo() {
        return "rectángulo";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}