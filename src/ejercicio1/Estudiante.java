/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 * Realice un programa para guardar las notas de 1 y 11 corte patra tres
 * estudiantes de un curso luego mostrarlas por panalla. * @author 1059356842
 */
public class Estudiante {

    double notas[][] = new double[3][2];
    Scanner in = new Scanner(System.in);

    void guardarNotas() {
        double nota1, nota2;
        System.out.println("GIARDANDO I Y II NOTA DE 3 ESTUDIANTES");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("*****Estudiante " + 1);
            System.out.println("Nota 1");
            nota1 = in.nextDouble();
            System.out.println("Nota 2 ");
            nota2 = in.nextDouble();
            notas[i][0] = nota1;
            notas[i][1] = nota2;
        }
        System.out.println("DATOS GUARDADOS!!");
    }

    void mostrarNotas() {
        System.out.println("""
                           -------------
                            Estudiante
                           NOTA 1/NOTA 2""");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i][0] + "  /  " + notas[i][1]);

        }
    }

    void menu() {
        int opcion = 0;
        do {
            System.out.println("""
                               *****REGISTRO DE NOTAS*****
                               1.Registrar notas
                               2.Listar notas
                               3.salir
                               opcion: """);
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    this.guardarNotas();
                    break;
                case 2:
                    this.mostrarNotas();

            }
        }while(opcion>0 && opcion <4);
            
    }
}
