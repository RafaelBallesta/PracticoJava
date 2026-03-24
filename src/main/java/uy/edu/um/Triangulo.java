package uy.edu.um;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Triangulo {
    private double base;
    private double altura;
    private String nombre;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.nombre = "Triángulo";
    }

    public double getPerimetro() {
        return 3 * base;
    }

    public double getArea() {
        return (base * altura) / 2;
    }

    public void printPerimetro(String unidad){
        System.out.println("El perímetro del triángulo es: " + getPerimetro() + " " + unidad);
    }

    public void printArea(String unidad){
        System.out.println("El área del triángulo es: " + getArea() + " " + unidad);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
