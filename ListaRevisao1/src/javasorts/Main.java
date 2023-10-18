/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasorts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Main {
    public static void printArray(int array[]) {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " | ");
        }
    }
    
    public static void printArrayChar(char array[]) {
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " | ");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int tam;
        
        System.out.println("Tamanho do vetor: ");
        tam = scanner.nextInt();
        int[] array = new int[tam];

        for(int i = 0; i < array.length - 1; i++) {
            array[i] = rand.nextInt(100);
        }
        
        char[] arrayChar = new char[tam];
        int codigoAscii;
        
        for(int i = 0; i < arrayChar.length; i++) {
            codigoAscii = rand.nextInt(26) + 'a';
            arrayChar[i] = (char) codigoAscii;
        }
             
        System.out.println("Vetor original: ");
        printArray(array);
        System.out.println("\n");
        
        BubbleSortDesc.bSort(array);
        System.out.println("Vetor ordenado com o Bubble Sort descrescente: ");
        printArray(array);
        System.out.println("\n");
        
        System.out.println("Vetor de caracteres: ");
        printArrayChar(arrayChar);
        System.out.println("\n");
        
        SelectionSortChar.sSort(arrayChar);
        System.out.println("Vetor de caracteres ordenado com o Selection Sort: ");
        printArrayChar(arrayChar);
        System.out.println("\n");
        
        
    }
}
