/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notafiscal;

import java.util.Random;

/**
 *
 * @author gabri
 */
public class NotaFiscal {

    private Random numero = new Random();
    private int numeroNfe;
    private String fornecedor;
    private String destinatario;
    private String cpf;
    private double valor;

    public int getNumeroNfe() {
        return numeroNfe;
    }

    public int setNumeroNfe(int num) {

        numeroNfe = num == 0 ? numero.nextInt(999999) : num;
        return numeroNfe;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        var valCpf = validarCPF(cpf);
        if (valCpf == false) {
            System.out.println("CPF INVALIDO!!!!!!!\n");
        } else {
            this.cpf = cpf;
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 100) {
            this.valor = 100.0;
        } else {
            this.valor = valor;
        }

    }

    public static boolean validarCPF(String cpf) {
        // Remove caracteres inválidos (como pontos e hifens) do CPF
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * (10 - i);
        }
        int resto = 11 - soma % 11;
        int dv1 = (resto >= 10) ? 0 : resto;

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            int digito = Character.getNumericValue(cpf.charAt(i));
            soma += digito * (11 - i);
        }
        resto = 11 - soma % 11;
        int dv2 = (resto >= 10) ? 0 : resto;
        // Verifica se os dígitos verificadores estão corretos
        return cpf.substring(9).equals(Integer.toString(dv1) + Integer.toString(dv2));
    }
    
    
 // Condicoes para validar foram colocadas igual a null por ser o valor default se nao informado nada
    
    public void mostrarInformacoes() {
        if (getCpf() == null || getFornecedor().equals("") || getDestinatario().equals("")){
            System.out.println("VALIDACAO FALHOU\nINFORME TODOS OS DADOS CORRETAMENTE");
            
        } else {
            System.out.printf("Numero: %06d\n",getNumeroNfe());
            System.out.println("Fornecedor: " + getFornecedor());
            System.out.println("Destinatario: " + getDestinatario());
            System.out.println("Cpf: " + getCpf());
            System.out.println("Valor: " + getValor());
        }
    System.out.println("----------------------------------------------------------------------------------");
    }
}
