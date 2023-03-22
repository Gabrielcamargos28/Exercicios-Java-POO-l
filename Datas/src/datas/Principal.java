/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datas;

/**
 *
 * @author gabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Data DiaAtual = new Data();
        DiaAtual.setDia(19);
        DiaAtual.setMes(03);
        DiaAtual.setAno(2023);
        System.out.println( DiaAtual.mostrarData());
        DiaAtual.proximoDia();
        
        Data Amanha = new Data();
        
        Amanha.setDia(20);
        Amanha.setMes(03);
        Amanha.setAno(2023);
        System.out.println(Amanha.mostrarData());
        Amanha.proximoDia();
        
        Data Fevereiro = new Data();
        Fevereiro.setDia(20);
        Fevereiro.setMes(03);
        Fevereiro.setAno(2023);
        System.out.println(Fevereiro.mostrarData());
        Fevereiro.proximoDia();
        
        
        
        
        
        
    }
    
}
