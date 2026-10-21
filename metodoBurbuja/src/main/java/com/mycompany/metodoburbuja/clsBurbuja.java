/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodoburbuja;

/**
 *
 * @author nameh
 */
public class clsBurbuja {
    public static void ordenamientoBurbuja(int[] arreglo){
        for(int i=0;i<arreglo.length-1; i++){
            for(int j=0;j<arreglo.length-1;j++){
                if(arreglo[j]>arreglo[j+1]){
                   int aux = arreglo[j];
                   arreglo[j] = arreglo[j+1];
                   arreglo[j+1] = aux;
                }  
            }
        }
    }
    
    public static void ordenamientoBurbujaMejorado(int [] arreglo){
        boolean bandera;
        for(int i =0; i<arreglo.length-1;i++){
            bandera= false;
            for(int j=0;j<arreglo.length-1;j++){
                   if(arreglo[j]>arreglo[j+1]){
                   int aux = arreglo[j];
                   arreglo[j] = arreglo[j+1];
                   arreglo[j+1] = aux;
                   bandera= true;
                }  
            }
            if(bandera==false){
                break;
            }
        }
    }
}
