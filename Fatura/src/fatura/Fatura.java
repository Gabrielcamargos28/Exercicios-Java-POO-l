/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatura;

/**
 *
 * @author gabri
 */
public class Fatura {

    private int numeroItem;
    private String descricao;
    private int quantidadeComprada;
    double valorUnitario;

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricao() {
        System.out.println("Descricao do item: "+numeroItem);
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if(quantidadeComprada <0){
            this.quantidadeComprada = 0;
        }else{
            this.quantidadeComprada = quantidadeComprada;
        }
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        if(valorUnitario > 5.00){
            this.valorUnitario = 5.00;
        }else{
            this.valorUnitario = valorUnitario;
        }   
    }
    public double valorFatura(){
        return quantidadeComprada * valorUnitario;
    }
}
