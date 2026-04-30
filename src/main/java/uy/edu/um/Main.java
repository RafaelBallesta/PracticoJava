package uy.edu.um;

public class Main {
    public static void main(String[] args) {
        demostracion();
    }
    
    private static void demostracion() {
        System.out.println("=== DEMOSTRACIÓN ===");
        
        System.out.println("=== Figuras Válidas ===\n");
        
        //Cuadrado
        Cuadrado c1 = new Cuadrado(9);
        Cuadrado c2 = new Cuadrado(5, "Cuadrado 2");
        
        c1.dibujar();
        c2.dibujar();
        System.out.println(c1.getArea());
        c2.printArea("metros");
        c1.printArea("cm\n");

        //Triangulo
        Triangulo t1 = new Triangulo(4, 6);
        Triangulo t2 = new Triangulo(3, 5, "Triángulo 2");
        
        t1.dibujar();
        t2.dibujar();
        System.out.println(t1.getPerimetro());
        t2.printPerimetro("metros");
        t1.printPerimetro("cm\n");

        //Rectangulo
        Rectangulo r1 = new Rectangulo(4, 6);
        Rectangulo r2 = new Rectangulo(3, 5, "Rectángulo 2");
        
        r1.dibujar();
        r2.dibujar();
        System.out.println(r1.getArea());
        r2.printArea("metros");
        r1.printArea("cm\n");

        //Circulo
        Circulo ci1 = new Circulo(5);
        Circulo ci2 = new Circulo(3, "Círculo 2");
        
        ci1.dibujar();
        ci2.dibujar();
        System.out.println(ci1.getPerimetro());
        ci2.printPerimetro("metros");
        ci1.printPerimetro("cm\n");

        //Trapecio
        Trapecio tr1 = new Trapecio(4, 6, 3);
        Trapecio tr2 = new Trapecio(3, 5, 2, "Trapecio 2");
        
        tr1.dibujar();
        tr2.dibujar();
        System.out.println(tr1.getArea());
        tr2.printArea("metros");
        tr1.printArea("cm\n");

        System.out.println("=== Ejemplos de Validación (Robustez) ===\n");
        
        // Intentar crear un cuadrado con lado negativo
        try {
            System.out.println("Intentando crear Cuadrado con lado = -5...");
            Cuadrado c3 = new Cuadrado(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error capturado: " + e.getMessage() + "\n");
        }
        
        // Intentar crear un triángulo con altura cero
        try {
            System.out.println("Intentando crear Triángulo con altura = 0...");
            Triangulo t3 = new Triangulo(5, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error capturado: " + e.getMessage() + "\n");
        }
        
        // Intentar crear un rectángulo con dimensiones negativas
        try {
            System.out.println("Intentando crear Rectángulo con largo = -4...");
            Rectangulo r3 = new Rectangulo(-4, 6);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error capturado: " + e.getMessage() + "\n");
        }
        
        // Intentar crear un círculo con radio cero
        try {
            System.out.println("Intentando crear Círculo con radio = 0...");
            Circulo ci3 = new Circulo(0);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error capturado: " + e.getMessage() + "\n");
        }
        
        // Intentar crear un trapecio con bases inválidas
        try {
            System.out.println("Intentando crear Trapecio con baseMayor = -3...");
            Trapecio tr3 = new Trapecio(-3, 5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error capturado: " + e.getMessage() + "\n");
        }

        System.out.println("=== Fin del programa ===");
    }
}