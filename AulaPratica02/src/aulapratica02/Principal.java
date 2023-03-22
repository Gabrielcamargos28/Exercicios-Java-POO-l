/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapratica02;

/**
 *
 * @author gabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        item Arroz = new item();
        
    Arroz.setId("123");
    Arroz.setPrecoUnitario(10);
    Arroz.setQuantidade(1);
    Arroz.setDescricao("Saco de arroz");
    Arroz.setDesconto(0.5);
    Arroz.mostrarInformacoes();
    }
    
}
