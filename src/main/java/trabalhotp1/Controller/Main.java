/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotp1.Controller;

import java.io.IOException;
import trabalhotp1.Model.Manutencao;

/**
 *
 * @author bhdbr
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        AcessoBancoDeDados banco = new AcessoBancoDeDados();
        banco.deletarManutencao(banco.pesquisaManutencao(8));
        for (Manutencao m : banco.getManutencoes()){
            System.out.println(m);
        }
    }
}

