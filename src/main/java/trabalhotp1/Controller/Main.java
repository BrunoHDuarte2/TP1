/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotp1.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import trabalhotp1.Model.Especialidade;
import trabalhotp1.Model.Funcionario;

/**
 *
 * @author bhdbr
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        AcessoBancoDeDados bd = new AcessoBancoDeDados();
        for(Funcionario f : bd.getFuncionarios()){
            System.out.println(f.getNome());
            System.out.println(f.getEspecialidade());
        }
    }
}

