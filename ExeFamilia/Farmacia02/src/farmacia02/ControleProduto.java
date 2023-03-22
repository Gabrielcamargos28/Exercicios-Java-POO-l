/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia02;

public class ControleProduto {

        int id;
        String nome;
        String dataFabricacao;
        String dataVencimeto;
        boolean situacao;
        double valor;
        int estoque;
        double valorFinal;
        
        void mostrarFicha(){
            System.out.println("                FICHA PRODUTO           ");
            System.out.println("ID: "+id);
            System.out.println("NOME: "+nome);
            System.out.println("VALOR: "+valor);
            System.out.println("ESTOQUE: "+estoque);
            System.out.println("DATA FABRICACAO: "+dataFabricacao);
            System.out.println("DATA VENCIMENTO: "+dataVencimeto);
            if(situacao){
                System.out.println("ATIVO\n");
            }else{
                situacao = false;
                System.out.println("DESATIVADO\n");
            }
        }
        void conferirEstoque(){
                System.out.println("                ESTOQUE DO PRODUTO");
            if(estoque > 0){
                System.out.println("Estoque positivo");
                System.out.println("ID: "+id);
                System.out.println("Estoque atual: "+estoque+"\n");
            }else{
                System.out.println("Estoque zerado ou negativo!!!");
            }
        }
        int entradaProduto(int qtd){
            System.out.printf("                ENTRADA PRODUTO %d \n\n",id);
            System.out.printf("Entrada de %d unidades\n\n",qtd);
            return estoque = estoque + qtd;
        }
        double venda(int quantidade){
            System.out.println("                VENDA PRODUTO "+id);
            if(estoque >0){
                valorFinal = valor * quantidade;
                estoque = estoque - quantidade;
            }
            System.out.println("Valor: "+valorFinal+"\nQuantidade: "+quantidade);
            return valorFinal;
            
        }
}
