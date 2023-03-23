/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexo;

/**
 *
 * @author gabri
 */
public class Complexo {

    private double numeroReal1;
    private double numeroReal2;
    private double numeroImaginario1;
    private double numeroImaginario2;

    public double getNumeroReal1() {
        return numeroReal1;
    }

    public void setNumeroReal1(double numeroReal1) {
        this.numeroReal1 = numeroReal1;
    }

    public double getNumeroReal2() {
        return numeroReal2;
    }

    public void setNumeroReal2(double numeroReal2) {
        this.numeroReal2 = numeroReal2;
    }

    public double getNumeroImaginario1() {
        return numeroImaginario1;
    }

    public void setNumeroImaginario1(double numeroImaginario1) {
        this.numeroImaginario1 = numeroImaginario1;
    }

    public double getNumeroImaginario2() {
        return numeroImaginario2;
    }

    public void setNumeroImaginario2(double numeroImaginario2) {
        this.numeroImaginario2 = numeroImaginario2;
    }
    
    public String somaComplexo(){
        double somaReal = this.numeroReal1 + this.numeroReal2;
        double somaImaginario = this.numeroImaginario1 + numeroImaginario2;
        
        return "soma: "+ somaReal +" + "+ somaImaginario+"i "+"= "+ (somaReal + somaImaginario)+"i";
    }
    
}
