/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exefamilia;

public class ExeFamilia {
    public static void main(String[] args) {
        familia Gabriel = new familia();
        //gabriel
        Gabriel.nome = "Gabriel";
        Gabriel.pais = "Eduardo"+"Rosilena";
        Gabriel.dependente = false;
        Gabriel.anoNascimento = 2004;
        Gabriel.mostrarInformacoes();
        Gabriel.calcularIdade();
        familia Eduardo = new familia();
        //eduardo
        Eduardo.nome = "Eduardo";
        Eduardo.pais = "Evando "+"Maria Jose";
        Eduardo.dependente = true;
        Eduardo.filhos = "Gabrie e Maria Eduarda";
        Eduardo.anoNascimento = 1982;
        Eduardo.mostrarInformacoes();
        Eduardo.calcularIdade();
        //ficticia
        familia teste = new familia();
        
        teste.nome = "Maria";
        teste.dependente = false;
        teste.pais = "Joao"+"Eunacia";
        teste.anoNascimento = 1975;
        teste.mostrarInformacoes();
        
        
        
    }
    
}
