/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotp1.Controller;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import trabalhotp1.Model.Equipamento;
import trabalhotp1.Model.Funcionario;
import trabalhotp1.Model.Manutencao;
import trabalhotp1.Model.Prioridade;

/**
 *
 * @author bhdbr
 */
public class AcessoBancoDeDados {
    private ArrayList<Funcionario> funcionarios = new ArrayList();
    private ArrayList<Equipamento> equipamentos = new ArrayList();
    private ArrayList<Manutencao> manutencoes =  new ArrayList();
    public AcessoBancoDeDados(){
        funcionarios.add(new Funcionario("Joao"));
        funcionarios.add(new Funcionario("Pedro"));
        funcionarios.add(new Funcionario("Jorge"));
        equipamentos.add(new Equipamento("Compressor"));
        equipamentos.add(new Equipamento("Paletizador"));
        equipamentos.add(new Equipamento("Empacotadora"));
        manutencoes.add(new Manutencao(0, new Date(System.currentTimeMillis()-100000000), Prioridade.ALTA, funcionarios.get(0), equipamentos.get(0)));
        manutencoes.add(new Manutencao(1, new Date(), Prioridade.BAIXA, funcionarios.get(1), equipamentos.get(1)));
        manutencoes.add(new Manutencao(2, new Date(), Prioridade.MEDIA, funcionarios.get(2), equipamentos.get(2)));
    }
    public void filtraPorId(DefaultListModel<String> listModel, String param){
        for (Manutencao m : manutencoes){
            if(param.equals(m.getId()+"")){
                listModel.addElement(m.getId()+"");
            }
        }
    }
    public void filtraPorData(DefaultListModel<String> listModel, String param){
        // dd/mm/yyyy
        int ano = Integer.parseInt(""+param.charAt(6)+param.charAt(7)+param.charAt(8)+param.charAt(9));
        int mes = Integer.parseInt(""+param.charAt(3)+param.charAt(4));
        int dia = Integer.parseInt(""+param.charAt(0)+param.charAt(1));
        for (Manutencao m : manutencoes){
            if(ano==m.getData().getYear()){
                listModel.addElement(m.getId()+"");
            }
        }
    }
    public void filtraPorPrioridade(DefaultListModel<String> listModel, String param){
        
    }


}


