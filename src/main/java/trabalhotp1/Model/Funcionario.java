/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotp1.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bhdbr
 */
public class Funcionario {
    private String matricula;
    private String nome;
    private Date dataNascimento;
    private String login;
    private String senha; 
    private  String setor;
    private ArrayList<Especialidade> Especialidade;

    public Funcionario(String matricula, String nome, Date dataNascimento, String login, String senha, String setor, Especialidade especialidade) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;
        this.setor = setor;
        this.Especialidade.add(especialidade);
    }

}
