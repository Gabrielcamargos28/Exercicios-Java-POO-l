/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farmacia02;
public class principal {
    public static void main(String[] args) {
        ControleProduto paracetamol = new ControleProduto();
        
        paracetamol.id = 1;
        paracetamol.nome = "Paracetamol";
        paracetamol.valor = 25.5;
        paracetamol.estoque = 15;
        paracetamol.dataFabricacao = "20/03/2013";
        paracetamol.dataVencimeto = "01/01/2032";
        paracetamol.situacao = true;
        paracetamol.mostrarFicha();
        paracetamol.conferirEstoque();
        paracetamol.entradaProduto(10);
        paracetamol.conferirEstoque();
        paracetamol.venda(5);
        paracetamol.conferirEstoque();
        
        
        ControleProduto dorflex = new ControleProduto();
        
        dorflex.id = 2;
        dorflex.nome = "Dorflex";
        dorflex.valor = 30.0;
        dorflex.estoque = 0;
        dorflex.dataFabricacao = "20/03/2013";
        dorflex.dataVencimeto = "01/01/2032";
        dorflex.situacao = true;
        dorflex.mostrarFicha();
        dorflex.conferirEstoque();
        dorflex.entradaProduto(10);
        dorflex.conferirEstoque();
        dorflex.venda(5);
        dorflex.conferirEstoque();
        
        ControleProduto termometro = new ControleProduto();
        
         dorflex.id = 3;
        dorflex.nome = "Termometro";
        dorflex.valor = 40.0;
        dorflex.estoque = 3;
        dorflex.dataFabricacao = "20/03/2013";
        dorflex.dataVencimeto = "01/01/2032";
        dorflex.situacao = false;
    }
    
    
}
