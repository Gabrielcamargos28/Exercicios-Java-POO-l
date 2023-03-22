/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

public class Principal {

    public static void main(String[] args) {
        Carro gol = new Carro();
        
        gol.ligar();
        gol.marca = "VolksWagen";
        gol.modelo = "quadrado";
        gol.cor = "azul com preto";
        gol.ano = 1990;
        gol.chassi = 1987563;
      System.out.print( gol.imprimir()); 
    }
    
}
