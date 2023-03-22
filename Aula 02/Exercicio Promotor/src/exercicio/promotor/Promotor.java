/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio.promotor;

public class Promotor {
    public String nomeEvento;
    public String nomePromotor;
    public String localEvento;
    public String dataEvento;
    public String atracoes;
    public double vlrIngressos;
    
    
    public void informacoes(){
        System.out.printf("|                       %s                     \n\n\n\n",nomeEvento);
        System.out.printf("|Data de realizacao: %s\n",dataEvento);
        System.out.printf("|Local: %s\n",localEvento);
        System.out.printf("|Valor: R$%.2f\n", vlrIngressos);
        System.out.printf("|Atracao: %s\n",atracoes);
        System.out.printf("|Uma realizacao: %s  realizacoes\n",nomePromotor);
    
    }
    
}
