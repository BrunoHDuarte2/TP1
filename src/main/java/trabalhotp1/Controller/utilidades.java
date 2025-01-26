/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trabalhotp1.Controller;

import java.io.IOException;
import java.util.ArrayList;
import trabalhotp1.Model.Equipamento;
import trabalhotp1.Model.Funcionario;
import trabalhotp1.Model.Manutencao;
import trabalhotp1.Model.Prioridade;

/**
 *
 * @author bhdbr
 */
public interface utilidades {
    void criarManutencao(Prioridade prioridade, ArrayList<Funcionario> f, Equipamento equipamento) throws IOException, ClassNotFoundException;
    void editaManutencao(int index, Manutencao m) throws IOException, ClassNotFoundException;
    void deletarManutencao(Manutencao m) throws IOException, ClassNotFoundException;
    Manutencao pesquisaManutencao(int index) throws IOException, ClassNotFoundException;
}
