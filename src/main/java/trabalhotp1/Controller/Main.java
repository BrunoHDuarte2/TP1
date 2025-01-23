/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotp1.Controller;

import java.io.IOException;
import java.util.Date;
import trabalhotp1.Model.Eletrico;
import trabalhotp1.Model.Eletronico;
import trabalhotp1.Model.Especialidade;
import trabalhotp1.Model.Estado;
import trabalhotp1.Model.Funcionario;

/**
 *
 * @author bhdbr
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        AcessoBancoDeDados banco = new AcessoBancoDeDados();
        banco.criarEquipamento(new Eletrico("Compressor", banco.getEquipamento().size(), "AF-12", Estado.AGUARDANDO_MANUTENCAO));
        banco.criarEquipamento(new Eletronico("Bomba", banco.getEquipamento().size(), "AF-12", Estado.AGUARDANDO_MANUTENCAO));
        banco.criarFuncionario(new Funcionario("1324", "Bruno", new Date(), "bdebatata", "1234", "Engenharia", Especialidade.Eletrônica));
        banco.criarFuncionario(new Funcionario("1325", "David", new Date(), "deidi", "5678", "Industria", Especialidade.Elétrica));
       
    }
}

