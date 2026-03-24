package uy.edu.um;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Circulo {
    private double radio;
    private String nombre;

    public Circulo(double radio) {
        this.radio = radio;
        this.nombre = "Círculo";
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void printPerimetro(String unidad){
        System.out.println("El perímetro del círculo es: " + getPerimetro() + " " + unidad);
    }

    public void printArea(String unidad){
        System.out.println("El área del círculo es: " + getArea() + " " + unidad);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
