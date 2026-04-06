package uy.edu.um;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public abstract class Figura implements Dibujable {
    protected String nombre;

    public Figura() {
        this.nombre = "Figura";
    }

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getArea();

    public abstract double getPerimetro();

    public abstract String getTipo();

    @Override
    public void dibujar() {
        System.out.println("Dibujando " + getTipo() + ": " + nombre);
    }

    public void printArea(String unidad) {
        System.out.println("El área del " + getTipo() + " es: " + getArea() + " " + unidad);
    }

    public void printPerimetro(String unidad) {
        System.out.println("El perímetro del " + getTipo() + " es: " + getPerimetro() + " " + unidad);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
