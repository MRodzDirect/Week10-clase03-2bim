package paquete06;

import java.util.ArrayList;
import java.util.Scanner;
import paquete04.Estudiante;

public class EjecutaEstudiante2 {

    public static void main(String[] args) {
        String name = "Marcus";
        String surname = "A.R";
        String id = "1000101001";
        int age = 15;
        // if those are not instantiated, then calcularMatricula() = 0.0 as all attributes are 0 by default;
        double costoCred = 300.15;
        int numeroCreds = 5;
        double costoAsig = 400.65;
        int numeroAsigs = 10;

        EstudianteDistancia studD = new EstudianteDistancia(numeroAsigs, costoAsig, surname, surname, surname, numeroAsigs);
        
        System.out.println(studD.toString() );
       // EstudianteDistancia studD = new EstudianteDistancia(name, surname, id, age);

    }
}
