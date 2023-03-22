/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notafiscal;

import java.time.temporal.TemporalAdjusters;

/**
 *
 * @author gabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NotaFiscal Nota01 = new NotaFiscal();
        Nota01.setNumeroNfe(0);
        Nota01.setValor(10);
        Nota01.setFornecedor("Bahamas");
        Nota01.setDestinatario("Gabriel");
        Nota01.setCpf("0000000000");
        Nota01.mostrarInformacoes();
        
        NotaFiscal Nota02 = new NotaFiscal();
        Nota02.setNumeroNfe(0);
        Nota02.setValor(100);
        Nota02.setFornecedor("");
        Nota02.setDestinatario("");
        Nota02.setCpf("10591022699");
        Nota02.mostrarInformacoes();
        
        NotaFiscal Nota03 = new NotaFiscal();
        Nota03.setNumeroNfe(000001);
        Nota03.setValor(100);
        Nota03.setFornecedor("Garibaldo");
        Nota03.setDestinatario("Joelson");
        Nota03.setCpf("10591022699");
        Nota03.mostrarInformacoes();
        
   }    
}
