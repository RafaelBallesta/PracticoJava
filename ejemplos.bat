@echo off
REM Script de ejemplos para ejecutar el programa con argumentos de línea de comandos
REM Cambiar a la carpeta del proyecto si es necesario

echo.
echo ===== EJEMPLOS DE USO DEL PROGRAMA CON ARGUMENTOS =====
echo.

echo.
echo 1. Ejecución sin argumentos (demostración estándar)
echo Comando: java uy.edu.um.Main
echo.

echo.
echo 2. Crear un cuadrado con lado 5
echo Comando: java uy.edu.um.Main cuadrado 5
echo.

echo.
echo 3. Crear un cuadrado con lado 7.5 y nombre personalizado
echo Comando: java uy.edu.um.Main cuadrado 7.5 "Mi Cuadrado"
echo.

echo.
echo 4. Crear un triángulo con base 4 y altura 6
echo Comando: java uy.edu.um.Main triangulo 4 6 "Mi Triángulo"
echo.

echo.
echo 5. Crear un rectángulo con largo 5 y ancho 3
echo Comando: java uy.edu.um.Main rectangulo 5 3 "Mi Rectángulo"
echo.

echo.
echo 6. Crear un círculo con radio 7
echo Comando: java uy.edu.um.Main circulo 7 "Mi Círculo"
echo.

echo.
echo 7. Crear un trapecio con bases 8 y 4, altura 3
echo Comando: java uy.edu.um.Main trapecio 8 4 3 "Mi Trapecio"
echo.

echo.
echo 8. Ver la ayuda
echo Comando: java uy.edu.um.Main ayuda
echo.

echo.
echo 9. Intentar crear un cuadrado con valor negativo (error)
echo Comando: java uy.edu.um.Main cuadrado -5
echo.

echo.
echo 10. Intentar crear un círculo con valor no numérico (error)
echo Comando: java uy.edu.um.Main circulo abc
echo.

echo ===== FIN DE LOS EJEMPLOS =====

