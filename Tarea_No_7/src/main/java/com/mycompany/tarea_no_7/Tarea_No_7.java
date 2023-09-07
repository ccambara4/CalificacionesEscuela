/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea_no_7;


import java.util.Scanner;

/**
 *
 * @author PREDATOR
 */
public class Tarea_No_7 {

    public static void main(String[] args) {
       
        Escuela escuela = new Escuela();
        Scanner scanner = new Scanner(System.in);//Este se utiliza para leer cada dato que se ingrese
        String nombre = "";
        String apellido = "";
        int carnet;
        int matematicas, sociales, naturales, ingles, fisica, lenguaje;
        int matematicas2, sociales2, naturales2, ingles2, fisica2, lenguaje2;
        int matematicas3, sociales3, naturales3, ingles3, fisica3, lenguaje3;
        int matematicas4, sociales4, naturales4, ingles4, fisica4, lenguaje4;
        double promedio = 0;
        double promedio2 = 0;
        double promedio3 = 0;
        double promedio4 = 0;
        double total = 0;
        //Ingreso de datos del alumno
        System.out.println("\nIngrese el nombre del alumno: ");
        nombre = scanner.nextLine();
        
        System.out.println("\nIngrese el apellido del alumno: ");
        apellido = scanner.nextLine();
        
        System.out.println("\nIngrese el carnet: ");
        carnet = scanner.nextInt();
        
        //Primer Bimestre
        System.out.println("");
        System.out.println("Primer Bimestre");
        //Aqui se ingresan las notas de cada materia
        System.out.println("\nIngrese la nota de matematicas: ");
        matematicas = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Ciencias Sociales: ");
        sociales = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Ciencias Naturales: ");
        naturales = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Ingles: ");
        ingles = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Educación Fisica: ");
        fisica = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Comunicacion y Lenguaje: ");
        lenguaje = scanner.nextInt();
        //Aquí se muestran los metodos get y set llamados desde la clase Escuela
        escuela.setMatematicas(matematicas);
        escuela.setSociales(sociales);
        escuela.setNaturales(naturales);
        escuela.setIngles(ingles);
        escuela.setFisica(fisica);
        escuela.setLenguaje(lenguaje);
        escuela.setPromedio(promedio);//Con set se puede traer la formula de promedio de la clase Escuela hacia aquí
        System.out.println("Nota de matematicas: " + escuela.getMatematicas());
        System.out.println("Nota de Ciencias Sociales: " + escuela.getSociales());
        System.out.println("Nota de Ciencias Naturales: " + escuela.getNaturales());
        System.out.println("Nota de Ingles: " + escuela.getIngles());
        System.out.println("Nota de Educación Física: " + escuela.getFisica());
        System.out.println("Nota de Comunicacion y Lenguaje: " + escuela.getLenguaje());
        System.out.println("Su promedio del primer bimestre es: " + escuela.getPromedio());
        
       //Segundo Bimestre
        System.out.println("\nSegundo Bimestre");
        System.out.println("\nIngrese la nota de matematicas: ");
        matematicas2 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Ciencias Sociales: ");
        sociales2 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Ciencias Naturales: ");
        naturales2 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Ingles: ");
        ingles2 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Educación Fisica: ");
        fisica2 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Comunicacion y Lenguaje: ");
        lenguaje2 = scanner.nextInt();
        
        escuela.setMatematicas2(matematicas2);
        escuela.setSociales2(sociales2);
        escuela.setNaturales2(naturales2);
        escuela.setIngles2(ingles2);
        escuela.setFisica2(fisica2);
        escuela.setLenguaje2(lenguaje2);
        escuela.setPromedio2(promedio2);
        System.out.println("Nota de matematicas: " + escuela.getMatematicas2());
        System.out.println("Nota de Ciencias Sociales: " + escuela.getSociales2());
        System.out.println("Nota de Ciencias Naturales: " + escuela.getNaturales2());
        System.out.println("Nota de Ingles: " + escuela.getIngles2());
        System.out.println("Nota de Educación Física: " + escuela.getFisica2());
        System.out.println("Nota de Comunicacion y Lenguaje: " + escuela.getLenguaje2());
        System.out.println("Su promedio del segundo bimestre es: " + escuela.getPromedio2());
        
        //Tercer Bimestre
        System.out.println("\nTercer Bimestre");
        System.out.println("\nIngrese la nota de matematicas: ");
        matematicas3 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Ciencias Sociales: ");
        sociales3 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Ciencias Naturales: ");
        naturales3 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Ingles: ");
        ingles3 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Educación Fisica: ");
        fisica3 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Comunicacion y Lenguaje: ");
        lenguaje3 = scanner.nextInt();
        
        escuela.setMatematicas3(matematicas3);
        escuela.setSociales3(sociales3);
        escuela.setNaturales3(naturales3);
        escuela.setIngles3(ingles3);
        escuela.setFisica3(fisica3);
        escuela.setLenguaje3(lenguaje3);
        escuela.setPromedio3(promedio3);
        System.out.println("Nota de matematicas: " + escuela.getMatematicas3());
        System.out.println("Nota de Ciencias Sociales: " + escuela.getSociales3());
        System.out.println("Nota de Ciencias Naturales: " + escuela.getNaturales3());
        System.out.println("Nota de Ingles: " + escuela.getIngles3());
        System.out.println("Nota de Educación Física: " + escuela.getFisica3());
        System.out.println("Nota de Comunicacion y Lenguaje: " + escuela.getLenguaje3());
        System.out.println("Su promedio del tercer bimestre es: " + escuela.getPromedio3());
        
        //Cuarto Bimestre
        System.out.println("\nCuarto Bimestre");
        System.out.println("\nIngrese la nota de matematicas: ");
        matematicas4 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Ciencias Sociales: ");
        sociales4 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Ciencias Naturales: ");
        naturales4 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Ingles: ");
        ingles4 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Educación Fisica: ");
        fisica4 = scanner.nextInt();
        
        System.out.println("\nIngrese la nota de Comunicacion y Lenguaje: ");
        lenguaje4 = scanner.nextInt();
        
        escuela.setMatematicas4(matematicas4);
        escuela.setSociales4(sociales4);
        escuela.setNaturales4(naturales4);
        escuela.setIngles4(ingles4);
        escuela.setFisica4(fisica4);
        escuela.setLenguaje4(lenguaje4);
        escuela.setPromedio4(promedio4);
        System.out.println("Nota de matematicas: " + escuela.getMatematicas4());
        System.out.println("Nota de Ciencias Sociales: " + escuela.getSociales4());
        System.out.println("Nota de Ciencias Naturales: " + escuela.getNaturales4());
        System.out.println("Nota de Ingles: " + escuela.getIngles4());
        System.out.println("Nota de Educación Física: " + escuela.getFisica4());
        System.out.println("Nota de Comunicacion y Lenguaje: " + escuela.getLenguaje4());
        System.out.println("Su promedio del cuarto bimestre es: " + escuela.getPromedio4());
        
        escuela.setNombre(nombre);
        System.out.println("");
        escuela.setApellido(apellido);
        System.out.println("");
        escuela.setCarnet(carnet);
        System.out.println("Datos del alumno: ");//Se muestran los datos del alumno con su promedio total
        System.out.println("Nombre: " + escuela.getNombre());
        System.out.println("Apellido: " + escuela.getApellido());
        System.out.println("Carnet: " + escuela.getCarnet());
        
        escuela.setTotal(total);//Aquí se trae la formula del promedio total de cada bimestre
        System.out.println("Su promedio total de todo el año fue de " + escuela.getTotal());//
        //Se creó un If para definir si el estudiante aprobó o no el año
        if(escuela.getTotal() > 60){
           System.out.println("El alumno aprobó el año");
         }
        else
        {
          System.out.println("El alumno no aprobó el año");  
        }
        
    }
}
