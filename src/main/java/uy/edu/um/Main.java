package uy.edu.um;

public class Main {
    public static void main(String[] args) {
        
        // Si se proporcionan argumentos, procesarlos
        if (args.length > 0) {
            procesarArgumentos(args);
        } else {
            // Si no hay argumentos, ejecutar demostración estándar
            demostracionEstandar();
        }
    }
    
    // Método para procesar argumentos de línea de comandos
    private static void procesarArgumentos(String[] args) {
        System.out.println("=== Procesamiento de Argumentos de Línea de Comandos ===\n");
        System.out.println("Argumentos recibidos: " + args.length);
        
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
        System.out.println();
        
        try {
            // Procesar según el tipo de figura
            String tipoFigura = args[0].toLowerCase();
            
            switch (tipoFigura) {
                case "cuadrado":
                    if (args.length >= 2) {
                        double lado = Double.parseDouble(args[1]);
                        String nombreCuadrado = args.length >= 3 ? args[2] : "Cuadrado";
                        Cuadrado c = new Cuadrado(lado, nombreCuadrado);
                        mostrarFigura(c);
                    } else {
                        System.out.println("Uso: java Main cuadrado <lado> [nombre]");
                    }
                    break;
                    
                case "triangulo":
                    if (args.length >= 3) {
                        double base = Double.parseDouble(args[1]);
                        double altura = Double.parseDouble(args[2]);
                        String nombreTriangulo = args.length >= 4 ? args[3] : "Triángulo";
                        Triangulo t = new Triangulo(base, altura, nombreTriangulo);
                        mostrarFigura(t);
                    } else {
                        System.out.println("Uso: java Main triangulo <base> <altura> [nombre]");
                    }
                    break;
                    
                case "rectangulo":
                    if (args.length >= 3) {
                        double largo = Double.parseDouble(args[1]);
                        double ancho = Double.parseDouble(args[2]);
                        String nombreRectangulo = args.length >= 4 ? args[3] : "Rectángulo";
                        Rectangulo r = new Rectangulo(largo, ancho, nombreRectangulo);
                        mostrarFigura(r);
                    } else {
                        System.out.println("Uso: java Main rectangulo <largo> <ancho> [nombre]");
                    }
                    break;
                    
                case "circulo":
                    if (args.length >= 2) {
                        double radio = Double.parseDouble(args[1]);
                        String nombreCirculo = args.length >= 3 ? args[2] : "Círculo";
                        Circulo ci = new Circulo(radio, nombreCirculo);
                        mostrarFigura(ci);
                    } else {
                        System.out.println("Uso: java Main circulo <radio> [nombre]");
                    }
                    break;
                    
                case "trapecio":
                    if (args.length >= 4) {
                        double baseMayor = Double.parseDouble(args[1]);
                        double baseMenor = Double.parseDouble(args[2]);
                        double alturaT = Double.parseDouble(args[3]);
                        String nombreTrapecio = args.length >= 5 ? args[4] : "Trapecio";
                        Trapecio tr = new Trapecio(baseMayor, baseMenor, alturaT, nombreTrapecio);
                        mostrarFigura(tr);
                    } else {
                        System.out.println("Uso: java Main trapecio <baseMayor> <baseMenor> <altura> [nombre]");
                    }
                    break;
                    
                case "ayuda":
                case "--help":
                case "-h":
                    mostrarAyuda();
                    break;
                    
                default:
                    System.out.println("Tipo de figura no reconocido: " + tipoFigura);
                    mostrarAyuda();
            }
            
        } catch (NumberFormatException e) {
            System.out.println("✗ Error: Los valores deben ser números válidos");
            System.out.println("   Detalles: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("✗ Error de validación: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("✗ Error inesperado: " + e.getMessage());
        }
    }
    
    // Método para mostrar información de una figura
    private static void mostrarFigura(Figura figura) {
        System.out.println("\n--- Información de la Figura ---");
        figura.dibujar();
        figura.printArea("m²");
        figura.printPerimetro("m");
        System.out.println("Nombre: " + figura.getNombre());
    }
    
    // Método para mostrar ayuda
    private static void mostrarAyuda() {
        System.out.println("\n=== AYUDA: Uso de Figuras Geométricas ===\n");
        System.out.println("Sintaxis general: java Main <tipo> <parámetros> [nombre]\n");
        System.out.println("Tipos de figuras disponibles:\n");
        System.out.println("1. CUADRADO");
        System.out.println("   Comando: java Main cuadrado <lado> [nombre]");
        System.out.println("   Ejemplo: java Main cuadrado 5 \"Mi Cuadrado\"\n");
        System.out.println("2. TRIÁNGULO");
        System.out.println("   Comando: java Main triangulo <base> <altura> [nombre]");
        System.out.println("   Ejemplo: java Main triangulo 4 6 \"Mi Triángulo\"\n");
        System.out.println("3. RECTÁNGULO");
        System.out.println("   Comando: java Main rectangulo <largo> <ancho> [nombre]");
        System.out.println("   Ejemplo: java Main rectangulo 5 3 \"Mi Rectángulo\"\n");
        System.out.println("4. CÍRCULO");
        System.out.println("   Comando: java Main circulo <radio> [nombre]");
        System.out.println("   Ejemplo: java Main circulo 7 \"Mi Círculo\"\n");
        System.out.println("5. TRAPECIO");
        System.out.println("   Comando: java Main trapecio <baseMayor> <baseMenor> <altura> [nombre]");
        System.out.println("   Ejemplo: java Main trapecio 8 4 3 \"Mi Trapecio\"\n");
        System.out.println("Opciones adicionales:");
        System.out.println("   java Main ayuda      (Muestra esta ayuda)");
        System.out.println("   java Main --help     (Muestra esta ayuda)");
        System.out.println("   java Main -h         (Muestra esta ayuda)\n");
    }
    
    // Método para demostración estándar (sin argumentos)
    private static void demostracionEstandar() {
        System.out.println("=== DEMOSTRACIÓN ESTÁNDAR (sin argumentos) ===");
        System.out.println("Para usar argumentos de línea de comandos, ejecuta:");
        System.out.println("  java Main <tipo> <parámetros> [nombre]");
        System.out.println("Ejecuta: java Main ayuda (para más información)\n");
        
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