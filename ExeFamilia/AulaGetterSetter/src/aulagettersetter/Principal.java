/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulagettersetter;

/**
 *
 * @author gabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teclado Razer = new Teclado("Razer", true, "Mecanico");
        System.out.println(Razer.getModelo());
        System.out.println(Razer.getWireless());
        System.out.println(Razer.getTipo());
        Teclado Dell = new Teclado("Dell switch",false,"Membrana");
        System.out.println(Dell.getModelo());
        System.out.println(Dell.getWireless());
        System.out.println(Dell.getTipo());
        Teclado Positivo = new Teclado("Erro",false,"123");
        System.out.println(Positivo.getModelo());
        System.out.println(Positivo.getWireless());
        System.out.println(Positivo.getTipo());
        
        
        
    }
    
}
