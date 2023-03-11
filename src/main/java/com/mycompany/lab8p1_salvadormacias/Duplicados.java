package com.mycompany.lab8p1_salvadormacias;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Duplicados {

    private int[] array;

    public Duplicados(int tamano) {
        array = new int[tamano];
    }

    public void inicializar_array() {
        Random r = new Random();
        int i = 0;
        while (i < array.length) {

            array[i] = r.nextInt(10) + 1;
            i++;
        }
    }

    public void dupli_final() {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }

        }
    }
    
    public int[]getarray(){
        return array;
    }
    
}//fin duplicados
