/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotp1.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author bhdbr/brunosilva
 */
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 7526306044279317864L;
    
    private String matricula;
    private String nome;
    private Date dataNascimento; 
    private String login;
    private String senha; 
    private String setor;
    private ArrayList<Especialidade> especialidades; // Agora é uma lista de enumerações
    
    public Funcionario(String matricula, String nome, Date dataNascimento, String login, String senha, String setor, ArrayList<Especialidade> especialidades) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;
        this.setor = setor;
        this.especialidades = especialidades;
    }
  

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public ArrayList<Especialidade> getEspecialidade() {
        return especialidades;
    }

    public void setEspecialidade(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

}
