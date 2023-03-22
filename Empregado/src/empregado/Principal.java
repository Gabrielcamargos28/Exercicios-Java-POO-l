/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empregado;

/**
 *
 * @author gabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado Gabriel = new Empregado();
        
        Gabriel.setPrimeiroNome("Gabriel");
        Gabriel.setSobrenome("Camargos ");
        Gabriel.setSalarioMensal(1800);
        Gabriel.mostrarDados();
        Gabriel.salarioAnual();
        Gabriel.aumento();
        Gabriel.mostrarDados();
        
        Empregado GabrielFuturo = new Empregado();
    
        GabrielFuturo.setPrimeiroNome("Gabriel");
        GabrielFuturo.setSobrenome("Camargos");
        GabrielFuturo.setSalarioMensal(6000);
        GabrielFuturo.mostrarDados();
        GabrielFuturo.salarioAnual();
        GabrielFuturo.aumento();
        GabrielFuturo.mostrarDados();
    }
    
}
