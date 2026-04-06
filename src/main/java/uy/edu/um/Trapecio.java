package uy.edu.um;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Trapecio extends Figura {
    private double baseMayor;
    private double baseMenor;
    private double altura;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        super("Trapecio");
        validarDimensiones(baseMayor, baseMenor, altura);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public Trapecio(double baseMayor, double baseMenor, double altura, String nombre) {
        super(nombre);
        validarDimensiones(baseMayor, baseMenor, altura);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    private void validarDimensiones(double baseMayor, double baseMenor, double altura) {
        if (baseMayor <= 0 || baseMenor <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Las bases y altura del trapecio deben ser mayores a 0");
        }
    }

    @Override
    public double getArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    @Override
    public double getPerimetro() {
        return baseMayor + baseMenor + 2 * Math.sqrt(Math.pow((baseMayor - baseMenor) / 2, 2) + Math.pow(altura, 2));
    }

    @Override
    public String getTipo() {
        return "trapecio";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}