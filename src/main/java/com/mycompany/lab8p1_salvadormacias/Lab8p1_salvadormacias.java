package com.mycompany.lab8p1_salvadormacias;

import java.util.Scanner;

import java.util.Random;

import java.util.Arrays;

public class Lab8p1_salvadormacias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }//fin main

    public static void menu() {
        boolean salida = true;
        do {
            System.out.println("Bienvenido al menu!");
            System.out.println("Estas son las opciones disponibles: ");
            System.out.println("1.X-array\n2.Sin duplicados\n3.Oracion a matriz\n4.Salir");
            System.out.println("Ingrese opcion : ");
            int opc = lea.nextInt();
            switch (opc) {
                case 1: {
                    System.out.println("Ingrese un tamano: ");
                    int tamano = lea.nextInt();
                    String n = "";
                    int matriz[][] = new int[tamano][tamano];
                    int array_matriz[] = new int[tamano];
                    int[] diago1 = new int[matriz.length];
                    int[] diago2 = new int[matriz.length];
                    inicializar(matriz);
                    System.out.println("matriz generada:\n\n" + matriz_str(matriz));
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            if (i == j) {
                                diago1[i] = matriz[i][j];
                            }

                            if (i + j == matriz.length - 1) {
                                diago2[i] = matriz[i][j];
                            }
                        }
                    }
                    System.out.println("Arreglo de diagonales: ");
                    System.out.println(visualizarArray(diago1, n) + visualizarArray(diago2, n));
                    System.out.println("--------------------------------------------------------------------------------");

                }//fin case 1
                break;

                case 2: {
                    System.out.println("Ingrese un tamano: ");
                    int tamano = lea.nextInt();

                    if (tamano >= 5 && tamano <= 10) {
                        Duplicados dupli = new Duplicados(tamano);
                        dupli.inicializar_array();
                        System.out.println("Arreglo generado: " + Arrays.toString(dupli.getarray()));
                        dupli.dupli_final();
                        System.out.println("Arreglo sin duplicados: " + Arrays.toString(dupli.getarray()));
                        System.out.println("--------------------------------------------------------------------------------");
                    } else {
                        System.out.println("El tamano del arreglo tiene que estar entre 5 y 10");
                        System.out.println("--------------------------------------------------------------------------------");

                    }

                }//fin case 2
                break;

                case 3: {
                    System.out.print("Ingrese una oración: ");
                    String oracion = str.nextLine();
                    OMatriz mat = new OMatriz(oracion);
                    char[][] mat_final = mat.getm();
                    int i = 0;
                    int x = mat_final.length;
                    do {
                        for (int j = 0; j < mat_final[i].length; j++) {
                            if (mat_final[i][j] != '-') {
                                System.out.print("[" + mat_final[i][j] + "]");
                            }
                        }
                        i++;
                        System.out.println();
                    } while (i < x);

                    System.out.println("--------------------------------------------------------------------------------");

                }//fin case 3
                break;
                case 4: {
                    salida = false;
                    System.out.println("Se abandonara el programa");

                }//fin case 4
                break;

                default:
                    System.out.println("Opcion ingresada no es valida");
                    System.out.println("--------------------------------------------------------------------------------");

            }//fin switch

        } while (salida
                != false);//fin while
    }//fin menu

    static void inicializar(int[][] matriz) {
        Random r = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(4100) + 1100;
            }
        }
    }//matriz ejer1

    public static String matriz_str(int[][] matriz) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int x = matriz.length;
        do {
            for (int j = 0; j < matriz[0].length; j++) {
                sb.append("[" + matriz[i][j] + "]");
            }
            sb.append("\n");
            i++;
        } while (i < x);
        return sb.toString();
    }

    public static String visualizarArray(int[] pArray, String n) {
        for (int i = 0; i < pArray.length; i++) {
            System.out.print("\t" + pArray[i]);

        }
        return n;
    }

}//fin clase 
