/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trabalhotp1.Controller;

import trabalhotp1.Model.Equipamento;
import trabalhotp1.Model.Funcionario;
import trabalhotp1.Model.Manutencao;
import trabalhotp1.Model.Prioridade;

/**
 *
 * @author bhdbr
 */
public interface util {
    void criaManutencao(Prioridade prioridade, Funcionario f, Equipamento equipamento);
    void editaManutencao(Manutencao m);
    void deletarManutencao(Manutencao m);
    void pesquisaManutencao(Manutencao m);
    
}
