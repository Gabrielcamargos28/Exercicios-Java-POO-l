/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.promotor;

/**
 *
 * @author gabri
 */
public class Principal {
    public static void main(String[] args) {
        Promotor fenacafe = new Promotor(); 
        
        fenacafe.nomeEvento = "FenaCafé 2023";
        fenacafe.dataEvento = "13/03/2023";
        fenacafe.localEvento = "Parque de Exposições";
        fenacafe.vlrIngressos = 5.00;
        fenacafe.atracoes = "Show Alok";
        fenacafe.nomePromotor = "Prefeitura Patrocinio";
        fenacafe.informacoes();

    }
    
}
