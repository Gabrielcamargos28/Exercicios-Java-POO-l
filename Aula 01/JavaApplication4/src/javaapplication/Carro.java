/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;
public class Carro {
        public String marca;
        public String modelo;
        public String cor;
        public int chassi;
        public int ano;
        
        
        public void ligar(){
            System.out.println("Carro ligado!");
        }
        public void desligar(){
            System.out.println("Carro Desligado");
        }
        public boolean revisao(){
            boolean resposta = ano < 2018 ? true : false;
            return resposta;
        }
        public String imprimir(){
            String imprimir = 
                    "Marca: " + marca+
                    "\nModelo: " + modelo+
                    "\nCor: " + cor+
                    "\nano: " + ano+
                    "\nChassi: " +chassi+"\n";
            return imprimir;
        }
        
}
