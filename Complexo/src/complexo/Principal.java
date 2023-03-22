/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package complexo;

/**
 *
 * @author gabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Complexo Teste1 = new Complexo();
        
        Teste1.setNumeroReal1(1.5);
        Teste1.setNumeroReal2(1.5);
        Teste1.setNumeroImaginario1(5);
        Teste1.setNumeroImaginario2(6);
        System.out.println(Teste1.somaComplexo()); 
                
        // TODO code application logic here
    }
    
}
