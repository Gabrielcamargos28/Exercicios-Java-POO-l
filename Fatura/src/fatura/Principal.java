/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatura;

/**
 *
 * @author gabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fatura Fatura01 = new Fatura();
        
        Fatura01.setNumeroItem(1);
        Fatura01.setDescricao("Compra de item01");
        Fatura01.setQuantidadeComprada(2);
        Fatura01.setValorUnitario(10);
        System.out.println("Numero: "+Fatura01.getNumeroItem());
        System.out.println(Fatura01.getDescricao()); 
        System.out.println("Quantidade: "+Fatura01.getQuantidadeComprada()); ;
        System.out.println("Valor unitario: "+Fatura01.getValorUnitario());
        System.out.println("Valor total: "+Fatura01.valorFatura()); 
    
        Fatura Fatura02 = new Fatura();
        
        Fatura02.setNumeroItem(2);
        Fatura02.setDescricao("Compra de item 02");
        Fatura02.setQuantidadeComprada(2);
        Fatura02.setValorUnitario(3);
        System.out.println("Numero: "+Fatura02.getNumeroItem());
        System.out.println(Fatura02.getDescricao()); 
        System.out.println("Quantidade: "+Fatura02.getQuantidadeComprada()); ;
        System.out.println("Valor unitario: "+Fatura02.getValorUnitario());
        System.out.println("Valor total: "+Fatura02.valorFatura()); 
    
        Fatura Fatura03 = new Fatura();
        
        
        Fatura03.setNumeroItem(3);
        Fatura03.setDescricao("Compra de item 03");
        Fatura03.setQuantidadeComprada(1);
        Fatura03.setValorUnitario(5);
        System.out.println("Numero: "+Fatura03.getNumeroItem());
        System.out.println(Fatura03.getDescricao()); 
        System.out.println("Quantidade: "+Fatura03.getQuantidadeComprada()); ;
        System.out.println("Valor unitario: "+Fatura03.getValorUnitario());
        System.out.println("Valor total: "+Fatura03.valorFatura()); 
    }   
}
