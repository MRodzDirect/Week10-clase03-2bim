/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @authores Marco Abarca y Luis Aguilar
 */
public class Ejecutor {

    public static void main(String[] args) {
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
         */

        // inicio de la solución
        int opc;
        int contador=0;
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        ArrayList<Figura> figuras = new ArrayList<>();

        do {
            System.out.println("Elija el tipo de figura:");
            System.out.println("[1] Cuadrado");
            System.out.println("[2] Rombo");
            System.out.println("[3] Triangulo");
            System.out.println("[0] Salir");
            opc = entrada.nextInt();

            entrada.nextLine(); // consume ese consome de linea.

            System.out.println("Ingrese las caracteristicas de la figura");
            String car = entrada.nextLine();

            switch (opc) {
                case 1:

                    System.out.println("Ingrese el lado del cuadrado");
                    double lado = entrada.nextDouble();

                    Cuadrado cuad = new Cuadrado(lado, car);
                    figuras.add(cuad);
                    break;

                case 2:

                    System.out.println("Ingrese la diagonal menor del Rombo");
                    double diag_m = entrada.nextDouble();
                    System.out.println("Ingrese la diagonal mayor del Rombo");
                    double diag_M = entrada.nextDouble();

                    Rombo romb = new Rombo(diag_m, diag_M, car);
                    figuras.add(romb);
                    break;
                case 3:

                    System.out.println("Ingrese la base del Triangulo");
                    double base = entrada.nextDouble();
                    System.out.println("Ingrese la altura del Triangulo");
                    double alto = entrada.nextDouble();

                    Triangulo tri = new Triangulo(base, alto, car);
                    figuras.add(tri);
                    break;
            }

            contador++;
            System.out.println("¿Desea ingresar otra Figura? (Si / No)");
            if (!entrada.next().equalsIgnoreCase("Si")) { //nextLine
                opc = 0;
                break;
            }
        } while (opc != 0);

        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcularArea();

            System.out.printf("Datos de Figura\n"
                    + "%s\n",
                    figuras.get(i));
        }
    }
}
/* Prueba de escritorio:

Elija el tipo de figura:
[1] Cuadrado
[2] Rombo
[3] Triangulo
[0] Salir
1
Ingrese las caracteristicas de la figura
da
Ingrese el lado del cuadrado
5
�Desea ingresar otra Figura? (Si / No)
si
Elija el tipo de figura:
[1] Cuadrado
[2] Rombo
[3] Triangulo
[0] Salir
2
Ingrese las caracteristicas de la figura
ra
Ingrese la diagonal menor del Rombo
6
Ingrese la diagonal mayor del Rombo
8
�Desea ingresar otra Figura? (Si / No)
Si
Elija el tipo de figura:
[1] Cuadrado
[2] Rombo
[3] Triangulo
[0] Salir
3
Ingrese las caracteristicas de la figura
daada
Ingrese la base del Triangulo
5
Ingrese la altura del Triangulo
9
�Desea ingresar otra Figura? (Si / No)
No
Datos de Figura
Cuadrado{lado=5.0, caracteristicas=da, area=25.0}
Datos de Figura
Rombo{diag_m=6.0, diag_M=8.0, caracteristicas=ra, area=0.0}
Datos de Figura
Triangulo{base=5.0, alto=9.0, caracteristicas=daada, area=22.5}
BUILD SUCCESSFUL (total time: 1 minute 21 seconds)
*/