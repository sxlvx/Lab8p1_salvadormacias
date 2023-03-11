package com.mycompany.lab8p1_salvadormacias;

import java.util.Scanner;

public class OMatriz {

   private char[][] matriz;
    
    public OMatriz(String oracion) {
        String[] palabras = oracion.split(" ");
        int filas = palabras.length;
        int columnas = 0;
        for (String palabra : palabras) {
            while(palabra.length()>columnas){
                columnas = palabra.length();
            }
        }
        matriz = new char[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            String palabra = palabras[i];
            int j=0;
            do{
                if (j < palabra.length()) {
                    matriz[i][j] = palabra.charAt(j);
                } else {
                    matriz[i][j] = '-';
                }
                j++;
            }while(j<columnas);
            
        }
    }
    
    public char[][] getm() {
        return matriz;
    }
}//fin omatriz
