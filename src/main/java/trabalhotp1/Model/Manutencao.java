/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotp1.Model;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author bhdbr
 */
public class Manutencao {
    private int id;
    private Date data;
    private Prioridade prioridade;
    private ArrayList<Funcionario> funcionarios = new ArrayList();
    private Equipamento equipamento;

    public Manutencao(int id, Date data, Prioridade prioridade, Funcionario f, Equipamento equipamento) {
        // Validação entre funcionário e equipamento.
        this.equipamento = equipamento;
        this.id = id;
        this.data = data;
        this.prioridade = prioridade;
    }
    public void alocarFuncionario(Funcionario f){
        if (!funcionarios.contains(f)){
            funcionarios.add(f);
        }
    }    
    public void removerFuncionario(Funcionario f){
        if (funcionarios.contains(f)){
            funcionarios.remove(f);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    
}
