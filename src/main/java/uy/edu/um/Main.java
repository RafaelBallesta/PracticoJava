package uy.edu.um;

public class Main {
    public static void main(String[] args) {

        //Cuadrado
        Cuadrado c1 = new Cuadrado(9);
        Cuadrado c2 = new Cuadrado(5, "Cuadrado 2");

        System.out.println(c1.getArea());
        c2.printArea("metros");
        c1.printArea("cm\n");

        //Triangulo
        Triangulo t1 = new Triangulo(4, 6);
        Triangulo t2 = new Triangulo(3, 5, "Triángulo 2");

        System.out.println(t1.getPerimetro());
        t2.printPerimetro("metros");
        t1.printPerimetro("cm\n");

        //Rectangulo
        Rectangulo r1 = new Rectangulo(4, 6);
        Rectangulo r2 = new Rectangulo(3, 5, "Rectángulo 2");

        System.out.println(r1.getArea());
        r2.printArea("metros");
        r1.printArea("cm\n");

        //Circulo
        Circulo ci1 = new Circulo(5);
        Circulo ci2 = new Circulo(3, "Círculo 2");

        System.out.println(ci1.getPerimetro());
        ci2.printPerimetro("metros");
        ci1.printPerimetro("cm\n");

        //Trapecio
        Trapecio tr1 = new Trapecio(4, 6, 3);
        Trapecio tr2 = new Trapecio(3, 5, 2, "Trapecio 2");

        System.out.println(tr1.getArea());
        tr2.printArea("metros");
        tr1.printArea("cm");
    }
}