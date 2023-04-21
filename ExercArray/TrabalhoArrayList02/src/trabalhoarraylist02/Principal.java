/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhoarraylist02;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno Gabriel = new Aluno();
        Aluno Arthur = new Aluno ();
        Aluno Vinicius = new Aluno();
        Aluno Marcella = new Aluno();
        Aluno Victor = new Aluno();
        Aluno Wesley = new Aluno();
        Aluno Aryane = new Aluno();
        ArrayList<Aluno> ADS = new ArrayList();
        ArrayList<Aluno> EE = new ArrayList();
        
      
        
        Gabriel.setNome("Gabriel");
        Gabriel.setCidade("Patrocinio");
        Gabriel.setInstituicao("IFTM");
        Gabriel.setCurso("ADS");
        Gabriel.checaCurso(Gabriel, ADS, EE);
        Wesley.setNome("Wesley");
        Wesley.setCidade("Patrocinio");
        Wesley.setInstituicao("IFTM");
        Wesley.setCurso("EE");
        Wesley.checaCurso(Wesley, ADS, EE);
        Aryane.setNome("Aryane");
        Aryane.setCidade("Uberlandia");
        Aryane.setInstituicao("UFU");
        Aryane.setCurso("EE");
        Aryane.checaCurso(Aryane, ADS, EE);
        Arthur.setNome("Arthur");
        Arthur.setCidade("Patrocinio");
        Arthur.setInstituicao("IFTM");
        Arthur.setCurso("ADS");
        Arthur.checaCurso(Arthur, ADS, EE);
        Vinicius.setNome("Vinicius");
        Vinicius.setCidade("Patrocinio");
        Vinicius.setInstituicao("IFTM");
        Vinicius.setCurso("ADS");
        Vinicius.checaCurso(Vinicius, ADS, EE);
            
        
        int tamanhoEE = EE.size();
        System.out.println("ALUNOS DE EE: "+tamanhoEE);
        for(int i =0;i<EE.size();i++){
            System.out.println("Aluno: "+EE.get(i).getNome()+" - Cidade: "+EE.get(i).getCidade());
        }
        int tamanhoADS = ADS.size();
        System.out.println("ALUNOS DE ADS: "+tamanhoADS);
        for(int i=0;i<ADS.size();i++){
            System.out.println("Aluno: "+ADS.get(i).getNome()+" - Cidade: "+ADS.get(i).getCidade());
        }
    }
        
}
