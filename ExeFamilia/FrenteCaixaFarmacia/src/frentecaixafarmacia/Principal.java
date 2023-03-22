/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package frentecaixafarmacia;

public class Principal {
    public static void main(String[] args) {

        venda produto1 = new venda();
        
        produto1.id = 123456;
        produto1.nome = "Paracetamol";
        produto1.valor = 25.0;
        produto1.dataFabricacao = "01/01/2000";
        produto1.dataVencimento = "30/01/2004";
        produto1.exibirInfo();
        produto1.desconto = 2.0;
        produto1.desconto();
        produto1.exibirInfo();
        produto1.resetarProduto();
        produto1.exibirInfo();
    }
    
}
