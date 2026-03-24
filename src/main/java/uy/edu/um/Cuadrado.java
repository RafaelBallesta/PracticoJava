package uy.edu.um;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Cuadrado {
    private double lado;
    private String nombre;

    public Cuadrado(double lado) {
        this.nombre = "Cuadrado";
        this.lado = lado;
    }

    public double getPerimetro() {
        return 4 * lado;
    }

    public double getArea() {
        return Math.pow(lado, 2);
    }

    public void printPerimetro(String unidad){
        System.out.println("El perímetro del cuadrado es: " + getPerimetro() + " " + unidad);
    }

    public void printArea(String unidad){
        System.out.println("El área del cuadrado es: " + getArea() + " " + unidad);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
