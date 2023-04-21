/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadeheranca01;

/**
 *
 * @author gabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       Pessoa Gabriel = new Pessoa();
       
       Gabriel.setNome("Gabriel");
       Gabriel.setCodigo(1);
       Gabriel.setDataCadastro("21-04-2023");
       
        System.out.println( Gabriel.getNome());
        System.out.println(Gabriel.getCodigo()); 
        System.out.println(Gabriel.getDataCadastro());
       
       
       Cliente Nelma = new Cliente();
       
       Nelma.setNome("Nelma");
       Nelma.setCodigo(2);
       Nelma.setTelefone("3498875156");
       Nelma.setDataCadastro("21-04-2023");
       Nelma.setEmail("@email.com");
       Nelma.setEndereco("Governador Valadares 1563");
       
        System.out.println( Nelma.getNome());
        System.out.println(Nelma.getCodigo()); 
        System.out.println(Nelma.getDataCadastro());
        System.out.println(Nelma.getEmail());
        System.out.println(Nelma.getEndereco());
        System.out.println(Nelma.getTelefone());
       
       Usuario Edimilsom = new Usuario();
       
       Edimilsom.setNome("Edimilsom");
       Edimilsom.setCodigo(2);
       Edimilsom.setLogin("ediptc");
       Edimilsom.setSenha("123456");
       
    }
    
}
