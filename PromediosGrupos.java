package Practica1Sp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PromediosGrupos {
    public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    // Definir los grupos y el arreglo para almacenar los promedios
    String[] grupos = {"1A", "1B", "4A", "4B", "4C"};
    double[] promedios = new double[grupos.length];
    
    // Pedir la cantidad de alumnos en cada grupo
    for (int i = 0; i < grupos.length; i++) {
        System.out.print("Ingrese la cantidad de alumnos en el grupo " + grupos[i] + ": ");
        int cantidadAlumnos = Integer.parseInt(reader.readLine());
        
        // Calcular el promedio del grupo
        double sumaCalificaciones = 0;
        for (int j = 0; j < cantidadAlumnos; j++) {
            System.out.print("Escribe el promedio individual del estudiante con el ID " + (j+1) + " del grupo " + grupos[i] + ": ");
            double calificacion = Double.parseDouble(reader.readLine());
            sumaCalificaciones += calificacion;
        }
        double promedioGrupo = sumaCalificaciones / cantidadAlumnos;
        
        // Almacenar el promedio en el arreglo
        promedios[i] = promedioGrupo;
    }
    
    // Imprimir los promedios individuales del grupo
    System.out.println("Promedios individuales del grupo:");
    for (int i = 0; i < grupos.length; i++) {
        System.out.println("Grupo " + grupos[i] + ": " + promedios[i]);
    }
    
    // Calcular el promedio general
    double sumaPromedios = 0;
    for (double promedio : promedios) {
        sumaPromedios += promedio;
    }
    double promedioGeneral = sumaPromedios / promedios.length;
    
    // Imprimir el promedio general
    System.out.println("Promedio general del grupo: " + promedioGeneral);
}
}