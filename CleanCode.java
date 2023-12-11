/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cleancode;

import java.util.Scanner;

/**
 *
 * @author paula
 */
public class CleanCode {

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Práctica Clean Code por Paula Búrdalo

        // BLOQUE 1
        // 1.1 Nombres con significado
        int variable = 12;
        int meses = 12;

        // 1.2 Nombres con fácil pronunciación
        String ifhy = "???";
        String sout = "abreviación de system out";

        // 1.3 Nombres que se puedan buscar
        for (int i = 0; i < 12; i++) {
            System.out.println("no sabemos qué es 12");
        }

        for (int i = 0; i < meses; i++) {
            System.out.println("sabemos que 12 se refiere a meses");
        }

        // 1.4 Nombres de clases, métodos y funciones
        PintarEjemplo();

        // 1.5 Nombres por conceptos
        PintarFuncionConcepto();

        // BLOQUE 2
        // 2.1 Funciones pequeñas
        PintarEjemplo();
        PintarFuncionConcepto();
        PintarFuncionLarga();

        // 2.7 Sin repeticiones
        System.out.println("Aquí escribo algo");
        System.out.println("Aquí algo más");
        System.out.println("Aquí otra cosa");
        // lo pasamos a una función
        PintarRepeticion();

        // BLOQUE 3
        // 3.1 Comentarios obsoletos
        // Variable que muestra días de la semana
        int variable_inicial = 7;
        // Variable que muestra días de la semana
        int variable_nueva = 30;
        
        // 3.2 Código autoexplicativo
        // Esta variable es para las horas de un día
        int horas_dia = 24;
        
    }

    public static void PintarEjemplo() {
        System.out.println("holaa!");
    }

    public static void PintarFuncionConcepto() {
        System.out.println("hola de nuevoo!");
    }

    public static void PintarFuncionLarga() {
        System.out.println("hola de nuevoo!");
        System.out.println(":o");
        System.out.println("tampoco es muy larga");
        System.out.println("pero se entiende");
        System.out.println("que tiene que ser");
        System.out.println("chiquita");
        System.out.println(":>");
    }

    public static void PintarMenu() {

        int opcion = 0;

        System.out.println("1. Primera opción");
        System.out.println("2. Segunda opción");
        System.out.println("3. Tercera opción");
        System.out.println("4. Cuarta opción");
        // separar de función
        System.out.println("Elige una opción:");
        opcion = sc.nextInt();

    }

    public static void PintarRepeticion() {
        System.out.println("Aquí escribo algo");
        System.out.println("Aquí algo más");
        System.out.println("Aquí otra cosa");
    }

}
