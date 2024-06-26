package paquete06;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
         */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        boolean continuar = false;
        int contador = 0;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // inicio de solución
        do {
            System.out.println("[1] Estudiante Presencial");
            System.out.println("[2] Estudiante Distancia");
            tipoEstudiante = entrada.nextInt();

            entrada.nextLine(); // consume ese consome de linea.

            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();

            switch (tipoEstudiante) {
                case 1:

                    System.out.println("Ingrese el número de créditos");
                    numeroCreds = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada créditos");
                    costoCred = entrada.nextDouble();
                    EstudiantePresencial studP = new EstudiantePresencial();

                    studP.establecerNombresEstudiante(nombresEst);
                    studP.establecerApellidoEstudiante(apellidosEst);
                    studP.establecerIdentificacionEstudiante(identificacionEst);
                    studP.establecerEdadEstudiante(edadEst);
                    studP.establecerNumeroCreditos(numeroCreds);
                    studP.establecerCostoCredito(costoCred);

                    estudiantes.add(studP);
                    break;

                case 2:

                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();
                    costoCred = entrada.nextDouble();
                    EstudianteDistancia studD = new EstudianteDistancia();
                    studD.establecerNombresEstudiante(nombresEst);
                    studD.establecerApellidoEstudiante(apellidosEst);
                    studD.establecerIdentificacionEstudiante(identificacionEst);
                    studD.establecerEdadEstudiante(edadEst);
                    studD.establecerNumeroAsginaturas(numeroAsigs);
                    studD.establecerCostoAsignatura(costoAsig);
                    estudiantes.add(studD);
                    break;
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
