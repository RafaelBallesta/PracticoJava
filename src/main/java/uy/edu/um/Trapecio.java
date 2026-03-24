package uy.edu.um;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Trapecio {
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private String nombre;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.nombre = "Trapecio";
    }

    public double getPerimetro() {
        return baseMayor + baseMenor + 2 * Math.sqrt(Math.pow((baseMayor - baseMenor) / 2, 2) + Math.pow(altura, 2));
    }

    public double getArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public void printPerimetro(String unidad){
        System.out.println("El perímetro del trapecio es: " + getPerimetro() + " " + unidad);
    }

    public void printArea(String unidad){
        System.out.println("El área del trapecio es: " + getArea() + " " + unidad);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}