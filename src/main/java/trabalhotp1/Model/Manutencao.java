/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotp1.Model;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author bhdbr
 */
public class Manutencao implements Serializable{
    private static final long serialVersionUID = 1L;
    // Atributos Básicos
    private int id;
    private Date dataAtual;
    private Date dataEntrega;
    private Prioridade prioridade;
    private ArrayList<Funcionario> funcionarios = new ArrayList();
    private Equipamento equipamento;
    
    /*
        Padrão dataAtual serve como parametro para calcular a data de entrega junto a prioridade:
            Prioridade Alta: 3 dias
            Prioridade Media: 5 dias
            Prioridade Baixa: 7 dias
    */
    // Construtores 
    // A única diferença é a "quantidade" de funcionários
    public Manutencao(int id, Prioridade prioridade, Funcionario f, Equipamento equipamento) {
        this.id = id;
        this.equipamento = equipamento;
        this.prioridade = prioridade;
        this.funcionarios.add(f);
        this.dataAtual = new Date();
        this.calculaDias(prioridade);
    }
    public Manutencao(int id, Prioridade prioridade, Equipamento equipamento, ArrayList<Funcionario> f) {
        this.id = id;
        this.prioridade = prioridade;
        this.equipamento = equipamento;
        this.funcionarios = f;
        this.dataAtual = new Date();
        this.calculaDias(prioridade);
    }
    // Adiciona funcionários
    public void alocarFuncionario(Funcionario f){
        if (!funcionarios.contains(f)){
            funcionarios.add(f);
        }
    }
    // Remove funcionários    
    public void removerFuncionario(Funcionario f){
        if (funcionarios.contains(f)){
            funcionarios.remove(f);
        }
    }
    // Remove funcionários  
    public void removerFuncionario(ArrayList<Funcionario> f){
        for(Funcionario func : f){
            this.funcionarios.remove(f);
        }
    }
    // Regra de négocio para calcular a quantidade de dias para a entrega com base a prioridade
    public void calculaDias(Prioridade p){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.dataAtual);
        if (p == Prioridade.ALTA){
           calendar.add(Calendar.DAY_OF_MONTH, 3); 
           this.dataEntrega = calendar.getTime();
        }
        if (p == Prioridade.MEDIA){
            calendar.add(Calendar.DAY_OF_MONTH, 5);
           this.dataEntrega = calendar.getTime();
        }
        if (p == Prioridade.BAIXA){
            calendar.add(Calendar.DAY_OF_MONTH, 7);
            this.dataEntrega = calendar.getTime();
        }
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(Date dataAtual) {
        this.dataAtual = dataAtual;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }
    // Métodos para auxiliar na formatação dos dados
    public String getDataEntregaFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(dataEntrega);
    }
    public String getDataAtualFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(dataAtual);
    }
   
    public String[] getFuncionariosFormat(){
        String[] s = new String[this.getFuncionarios().size()];
        int i = 0;
        for (Funcionario f : this.getFuncionarios()){
            s[i] = f.getNome()+"/"+f.getMatricula();
            i++;
        }
        return s;
    }
    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
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
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Manutencao {")
          .append("ID: ").append(id)
          .append(", Prioridade: ").append(prioridade)
          .append(", Funcionarios [");     
        for (Funcionario f: funcionarios){
            sb.append(f.getNome());
        }
        sb.append("], ").append("Equipamento: " + this.equipamento.getNome()+"}");
        
        return sb.toString();
}

}
