package paquete05;

import java.util.ArrayList;
import java.util.Scanner;
import paquete04.Estudiante;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de estudiantes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
         */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        boolean continuar = true;
        int contador = 0;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución
        int opc;

        do {
            System.out.println("[1] Estudiante Presencial");
            System.out.println("[2] Estudiante Distancia");
            opc = entrada.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese los nombres del estudiante");
                    nombresEst = entrada.nextLine();
                    System.out.println("Ingrese los apellidos del estudiante");
                    apellidosEst = entrada.nextLine();
                    System.out.println("Ingrese la identificación del estudiante");
                    identificacionEst = entrada.nextLine();
                    System.out.println("Ingrese la edad del estudiante");
                    edadEst = entrada.nextInt();
                    System.out.println("Ingrese el número de créditos");
                    numeroCreds = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada créditos");
                    costoCred = entrada.nextDouble();
                    estudiantes.add(new EstudiantePresencial(nombresEst, apellidosEst, identificacionEst, edadEst, numeroCreds,costoCred));
            }

            contador++;
            System.out.println("¿Desea ingresar otro Estudiante? (Si / No)");
            if (!entrada.next().equalsIgnoreCase("Si")) { //nextLine
                continuar = false;
                break;
            }
        } while (continuar);

        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
