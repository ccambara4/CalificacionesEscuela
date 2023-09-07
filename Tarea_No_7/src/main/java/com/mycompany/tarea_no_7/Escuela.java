/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_no_7;

/**
 *
 * @author PREDATOR
 */
public class Escuela {
    //Aquí se definieron las variables necesarios para la aplicación
    String nombre;
    String apellido;
    int carnet;
    int matematicas, sociales, naturales, ingles, fisica, lenguaje;
    int matematicas2, sociales2, naturales2, ingles2, fisica2, lenguaje2;
    int matematicas3, sociales3, naturales3, ingles3, fisica3, lenguaje3;
    int matematicas4, sociales4, naturales4, ingles4, fisica4, lenguaje4;
    double promedio;
    double promedio2;
    double promedio3;
    double promedio4;
    double total;
    
    
    public Escuela(){
    
    }
    //Este el constructor de las variables nombre y apellido
    public Escuela(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //Aquí es donde a cada variable se le crea un método get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getMatematicas() {
        return matematicas;
    }

    public void setMatematicas(int matematicas) {
        this.matematicas = matematicas;
    }

    public int getSociales() {
        return sociales;
    }

    public void setSociales(int sociales) {
        this.sociales = sociales;
    }

    public int getNaturales() {
        return naturales;
    }

    public void setNaturales(int naturales) {
        this.naturales = naturales;
    }

    public int getIngles() {
        return ingles;
    }

    public void setIngles(int ingles) {
        this.ingles = ingles;
    }

    public int getFisica() {
        return fisica;
    }

    public void setFisica(int fisica) {
        this.fisica = fisica;
    }

    public int getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(int lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    public double getPromedio() {
        return promedio;
    }
    //Aquí está la fórmula para el promedio que se manda a la clase Tarea_No_7  y esto se hace con cada promedio de los diferentes bimestres
    public void setPromedio(double promedio) {
        this.promedio = (matematicas + sociales + naturales + ingles + fisica + lenguaje) /6;
    }

    public int getMatematicas2() {
        return matematicas2;
    }

    public void setMatematicas2(int matematicas2) {
        this.matematicas2 = matematicas2;
    }

    public int getSociales2() {
        return sociales2;
    }

    public void setSociales2(int sociales2) {
        this.sociales2 = sociales2;
    }

    public int getNaturales2() {
        return naturales2;
    }

    public void setNaturales2(int naturales2) {
        this.naturales2 = naturales2;
    }

    public int getIngles2() {
        return ingles2;
    }

    public void setIngles2(int ingles2) {
        this.ingles2 = ingles2;
    }

    public int getFisica2() {
        return fisica2;
    }

    public void setFisica2(int fisica2) {
        this.fisica2 = fisica2;
    }

    public int getLenguaje2() {
        return lenguaje2;
    }

    public void setLenguaje2(int lenguaje2) {
        this.lenguaje2 = lenguaje2;
    }

    public int getMatematicas3() {
        return matematicas3;
    }

    public void setMatematicas3(int matematicas3) {
        this.matematicas3 = matematicas3;
    }

    public int getSociales3() {
        return sociales3;
    }

    public void setSociales3(int sociales3) {
        this.sociales3 = sociales3;
    }

    public int getNaturales3() {
        return naturales3;
    }

    public void setNaturales3(int naturales3) {
        this.naturales3 = naturales3;
    }

    public int getIngles3() {
        return ingles3;
    }

    public void setIngles3(int ingles3) {
        this.ingles3 = ingles3;
    }

    public int getFisica3() {
        return fisica3;
    }

    public void setFisica3(int fisica3) {
        this.fisica3 = fisica3;
    }

    public int getLenguaje3() {
        return lenguaje3;
    }

    public void setLenguaje3(int lenguaje3) {
        this.lenguaje3 = lenguaje3;
    }

    public int getMatematicas4() {
        return matematicas4;
    }

    public void setMatematicas4(int matematicas4) {
        this.matematicas4 = matematicas4;
    }

    public int getSociales4() {
        return sociales4;
    }

    public void setSociales4(int sociales4) {
        this.sociales4 = sociales4;
    }

    public int getNaturales4() {
        return naturales4;
    }

    public void setNaturales4(int naturales4) {
        this.naturales4 = naturales4;
    }

    public int getIngles4() {
        return ingles4;
    }

    public void setIngles4(int ingles4) {
        this.ingles4 = ingles4;
    }

    public int getFisica4() {
        return fisica4;
    }

    public void setFisica4(int fisica4) {
        this.fisica4 = fisica4;
    }

    public int getLenguaje4() {
        return lenguaje4;
    }

    public void setLenguaje4(int lenguaje4) {
        this.lenguaje4 = lenguaje4;
    }

    public double getPromedio2() {
        return promedio2;
    }

    public void setPromedio2(double promedio2) {
        this.promedio2 = (matematicas2 + sociales2 + naturales2 + ingles2 + fisica2 + lenguaje2) /6;
    }

    public double getPromedio3() {
        return promedio3;
    }

    public void setPromedio3(double promedio3) {
        this.promedio3 = (matematicas3 + sociales3 + naturales3 + ingles3+ fisica3 + lenguaje3) /6;
    }

    public double getPromedio4() {
        return promedio4;
    }

    public void setPromedio4(double promedio4) {
        this.promedio4 = (matematicas4 + sociales4 + naturales4 + ingles4 + fisica4 + lenguaje4) /6;
    }

    public double getTotal() {
        return total;
    }
    //Esta es la formula del promedio total de cada bimestre y desde aquí se envía a la clase Tarea_No_7
    public void setTotal(double total) {
        this.total = (promedio + promedio2 + promedio3 + promedio4) /4;
    }
    
    
}
    
 
        
 

