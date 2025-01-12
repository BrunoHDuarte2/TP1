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
    public static void main(String[] args) {
        AcessoBancoDeDados banco = new AcessoBancoDeDados();

        try {
            banco.carregarListaManutencoes();
            System.out.println("Lista carregada:");
            for (Manutencao m : banco.getManutencoes()) {
                System.out.println(m);
            }
            banco.criarManutencao(new Manutencao(3, Prioridade.ALTA, new Funcionario("123", "Bruno", new Date(), "123", "123", "123", Especialidade.Eletrônica), new Equipamento("!@#")));
            banco.carregarListaManutencoes();
            System.out.println("Lista carregada:");
            for (Manutencao m : banco.getManutencoes()) {
                System.out.println(m);
            }
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

