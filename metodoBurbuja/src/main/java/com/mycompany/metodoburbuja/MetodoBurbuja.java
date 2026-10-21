/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodoburbuja;

/**
 *
 * @author nameh
 */
public class MetodoBurbuja {

    public static void main(String[] args) {
        int[] arreglo= new int[]{4,2,1,6,8};
        int[] arreglo2= new int[]{1,2,3,4,5};
        int[] arreglo3= new int[]{42,6,111,22,49};

        //PRUEBA 1 Arreglo desordenado
        System.out.println("METODO BURBUJA NORMAL");        
        System.out.println("Arreglo Desordenado");
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+ " ");
        }
        System.out.println("");
        
        clsBurbuja.ordenamientoBurbuja(arreglo);
        
        System.out.println("Arreglo Ordenado");
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");

        System.out.println(""); 
        System.out.println("METODO BURBUJA MEJORADO"); 
        System.out.println(""); 
        //PRUEBA 2 arreglo que ya esta ordenado
        System.out.println("Arreglo ordenado");
        for(int i=0;i<arreglo2.length;i++){
            System.out.print(arreglo2[i]+" ");
        }
        System.out.println("");   
        clsBurbuja.ordenamientoBurbujaMejorado(arreglo2);
        System.out.println("Arreglo ordenado");
        for(int i=0;i<arreglo2.length;i++){
            System.out.print(arreglo2[i]+" ");
        }    
        System.out.println("");
        //PRUEBA 3 arreglo desordenado
        System.out.println("Arreglo desordenado");
        for(int i=0;i<arreglo3.length;i++){
            System.out.print(arreglo3[i]+" ");
        }
        System.out.println(""); 
        clsBurbuja.ordenamientoBurbujaMejorado(arreglo3);
        System.out.println("Arreglo desordenado");
        for(int i=0;i<arreglo3.length;i++){
            System.out.print(arreglo3[i]+" ");
        }
        
     
    }
}
