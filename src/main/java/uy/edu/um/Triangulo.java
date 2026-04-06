package uy.edu.um;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super("Triángulo");
        validarDimensiones(base, altura);
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double altura, String nombre) {
        super(nombre);
        validarDimensiones(base, altura);
        this.base = base;
        this.altura = altura;
    }

    private void validarDimensiones(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("La base y altura del triángulo deben ser mayores a 0");
        }
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return 3 * base;
    }

    @Override
    public String getTipo() {
        return "triángulo";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
