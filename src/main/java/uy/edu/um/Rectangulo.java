package uy.edu.um;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Rectangulo {
    private double largo;
    private double ancho;
    private String nombre;
    
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
        this.nombre = "Rectángulo";
    }
    
    public double getPerimetro() {
        return 2 * (largo + ancho);
    }
    
    public double getArea() {
        return largo * ancho;
    }
    
    public void printPerimetro(String unidad){
        System.out.println("El perímetro del rectángulo es: " + getPerimetro() + " " + unidad);
    }
    
    public void printArea(String unidad){
        System.out.println("El área del rectángulo es: " + getArea() + " " + unidad);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}