/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exefamilia;


public class familia {
    String pais;
    boolean dependente;
    String filhos;
    String nome;
    int anoNascimento;
    int idade;
    void mostrarInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Pais: "+pais);
        if(dependente){
            System.out.println("Filhos"+filhos);
        }else{
            System.out.println("Nao tem filhos");
        }
        System.out.println("Idade: "+calcularIdade());
    }
    int calcularIdade(){
        int ano = 2023;
        return idade = 
                ano - anoNascimento;
    }
    
}
