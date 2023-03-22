/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frentecaixafarmacia;
public class venda {
    int id;
    String nome;
    String dataFabricacao;
    String dataVencimento;
    double valor;
    double desconto;
    
    public void exibirInfo(){
        System.out.println("Id: "+id);
        System.out.println("Nome: "+nome);
        System.out.println("Valor: "+valor);
        System.out.println("Data fabricacao: "+dataFabricacao);
        System.out.println("Data vencimento: "+ dataVencimento);
    }
    public double desconto(){
       return valor = valor - desconto;
    }
    public void resetarProduto(){
        id = 0;
        nome = "";
        dataFabricacao = "00/00/00";
        dataVencimento = "00/00/00";
        valor = 0;
        desconto = 0;
    }
}
