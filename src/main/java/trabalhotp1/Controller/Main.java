/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotp1.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import trabalhotp1.Model.Administrador;
import trabalhotp1.Model.Equipamento;
import trabalhotp1.Model.Especialidade;
import trabalhotp1.Model.Funcionario;
import trabalhotp1.Model.Manutencao;
import trabalhotp1.Model.Prioridade;

/**
 *
 * @author bhdbr
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        AcessoBancoDeDados banco = new AcessoBancoDeDados();

        try {
            banco.carregarListaManutencoes();
            banco.salvarListaManutencoes(new ArrayList<Manutencao>());
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

