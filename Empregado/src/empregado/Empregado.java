/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empregado;

/**
 *
 * @author gabri
 */
public class Empregado {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double setSalarioMensal(double salario) {
        salarioMensal = salario >= 1332 ? salario :  1332;
        return salarioMensal;
    }
    
    public void salarioAnual(){
        System.out.println( "Salario anual: "+ salarioMensal *12);
    }
    public double aumento(){
        return salarioMensal += salarioMensal * 0.1;
    }
    public void mostrarDados(){
        System.out.println(primeiroNome+" "+sobrenome+"R$"+salarioMensal); 
   }
}
