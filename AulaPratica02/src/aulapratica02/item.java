/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapratica02;

/**
 *
 * @author gabri
 */
public class item {

    private double precoUnitario;
    private double desconto;
    private int quantidade;
    private String descricao;
    private String id;

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if (desconto >= 1.00) {
            this.desconto = 0;
        } else {
            this.desconto = desconto;
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValorTotal() {
        double valor;
        double descontoFinal = desconto * precoUnitario;
        return valor = (precoUnitario * quantidade) - descontoFinal;
    }

    public void mostrarInformacoes() {
        System.out.println("Id:"+ getId());
        System.out.println("Valor unitario: " + getPrecoUnitario());
        System.out.println("Descricao: " + getDescricao());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("desconto: " + getDesconto());
        System.out.println("Valor Final: R$" + getValorTotal());
    }
}
