package uy.edu.um;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        validarRadio(radio);
        this.radio = radio;
    }

    public Circulo(double radio, String nombre) {
        super(nombre);
        validarRadio(radio);
        this.radio = radio;
    }

    private void validarRadio(double radio) {
        if (radio <= 0) {
            throw new IllegalArgumentException("El radio del círculo debe ser mayor a 0");
        }
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String getTipo() {
        return "círculo";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
