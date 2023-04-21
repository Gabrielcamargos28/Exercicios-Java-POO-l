/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoarraylist02;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Aluno {
    private String nome;
    private String cidade;
    private String instituicao;
    private String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if(curso.equals("ADS") || curso.equals("EE")){
            this.curso = curso;
        }else{
            this.curso = "ADS";
        }
    }
    
    public void checaCurso(Aluno aluno, ArrayList ADS, ArrayList EE){
        if(getCurso().equals("ADS")){
            ADS.add(aluno);
        }else{
            EE.add(aluno);
        }
            
    }
    
    
    
    
    
}
