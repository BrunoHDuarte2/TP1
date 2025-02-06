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
public class Administrador extends Funcionario {


    public Administrador(String matricula, String nome, Date dataNascimento, String login, String senha, String setor, ArrayList<Especialidade> especialidades) {
        super(matricula, nome, dataNascimento, login, senha, setor, especialidades);
    }
    
}
