/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author 1059356842
 */
public class Definitivas {
    double notas[][]=new double[3][2];
    Scanner in=new Scanner(System.in);
    
    void registrar(){
        double codigo,valor;
        System.out.println("Registrando codigo de estudiante");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Codigo: ");
            codigo=in.nextDouble();
            System.out.println("Nota definotiva de ED:");
            valor=in.nextDouble();
            
            notas[i][0]=codigo;
            notas [i][1]=valor;
        }
        System.out.println("Datos registrados");
    }
    void listar(){
        System.out.println("Mostrando los datos guardados");
        System.out.println("MATERIA: ESTRUCTURA DE DATOS");
        System.out.println(" CODIGO / NOTA DEFINITIVA");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i][0]+" / "+notas[i][1]);
        }
    }
    void mostarReprobados(){
        int contadorReprobados=0;
        System.out.println("ESTUDIANTES QUE REPROBARON ED");
        System.out.println(" CODIGO / NOTA DEFINITIVA");
        for (int i = 0; i < notas.length; i++) {
            if(notas[i][1]<3){
                System.out.println(notas[i][0]+" / "+notas[i][1]);
                contadorReprobados++;
            }
            System.out.println("hay "+contadorReprobados+" reprobados");
        }
    }
    void menu(){
        int opcion=0;
        
        do{
            System.out.println("");
            System.out.println("""
                               ******Menu de opciones******
                               1. Registar Notas 
                               2. Listar Notas 
                               3. Mostar Reprobados
                               4. Salir 
                               Opcion: 
                               """);
            opcion=in.nextInt();
            switch(opcion){
                case 1: 
                    this.registrar();
                    break;
                case 2: 
                    this.listar();
                    break;
                case 3: 
                    this.mostarReprobados();
                    break;
            }
        }while(opcion>0 && opcion <4);
    }
    
}
