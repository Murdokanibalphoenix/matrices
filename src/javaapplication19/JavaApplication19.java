package javaapplication19;

import java.util.*;

public class JavaApplication19 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("dame numero de filas");
        int filas = teclado.nextInt();
        System.out.println("dame numero de columnas");
        int columnas = teclado.nextInt();
        int[][] matriz = new int[filas][columnas];
        rellenarMatriz(matriz);
        if (esCuadrada(matriz)) {
            System.out.println("es cuadrada");
            System.out.println("¿Es simetrica?=" + esSimetrica(matriz));
        } else {
            System.out.println("No es cuadrada");
        }
    }

    public static void rellenarMatriz(int[][] m) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("dame valor");
                m[i][j] = teclado.nextInt();
//otra opcion es rellenarlo de manera automatica
                //Ramdom R=new Random();
                
            }
        }
    }

    public static boolean esCuadrada(int[][] m) {

        return m.length == m[0].length;


    }

    public static boolean esSimetrica(int[][] m) {
        boolean simetrica = true;
        for (int i = 0; i < m.length && simetrica; i++) {
            for (int j = 0; j < m.length && simetrica; j++) {
                if (m[i][j] != m[j][i]) {
                    simetrica = false;
                }
            }

        }

        return simetrica;


    }
}
