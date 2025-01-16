
package trabalhotp1.Controller;
import java.awt.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultListModel;
import trabalhotp1.Model.Equipamento;
import trabalhotp1.Model.Especialidade;
import trabalhotp1.Model.Funcionario;
import trabalhotp1.Model.Manutencao;
import trabalhotp1.Model.Prioridade;

public class AcessoBancoDeDados {
    private String arquivoManutencao = "manutencao.dat";
    private ArrayList<Manutencao> manutencoes = new ArrayList();
    private String arquivoEquipamento = "equipamento.dat";
    private ArrayList<Equipamento> equipamento = new ArrayList();
    private String arquivoFuncionario = "funcionario.dat";
    private ArrayList<Funcionario> funcionarios = new ArrayList();

    // Métodos para o desenvolvimento da tela de manutenção.
    public AcessoBancoDeDados() throws IOException, ClassNotFoundException{
        this.carregarListaManutencoes();
        
    }
    public void salvarListaManutencoes(ArrayList<Manutencao> lista) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivoManutencao))) {
            oos.writeObject(lista);
        }
    }

    public void carregarListaManutencoes() throws IOException, ClassNotFoundException {
        File file = new File(arquivoManutencao);
        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivoManutencao))) {
            this.manutencoes = (ArrayList<Manutencao>) ois.readObject();
        }
    }
    public void criarManutencao(Manutencao m) throws IOException, ClassNotFoundException{
        this.carregarListaManutencoes();
        this.manutencoes.add(m);
        this.salvarListaManutencoes(this.manutencoes);
    }
    public void deletarManutencao(Manutencao m) throws IOException, ClassNotFoundException{
        this.carregarListaManutencoes();
        this.manutencoes.remove(m);
        this.salvarListaManutencoes(this.manutencoes);
    }
    public Manutencao pesquisa(int index) throws IOException, ClassNotFoundException{
        this.carregarListaManutencoes();
        for(Manutencao m : this.manutencoes){
            if(m.getId()==index){
                return m;
            }
        }
        return null;
    }
    public void filtraPorId(DefaultListModel<String> listModel, String texto) throws IOException, ClassNotFoundException{
        try{
            this.carregarListaManutencoes();
            for (Manutencao m : this.manutencoes){
                if(m.getId() == Integer.parseInt(texto)){
                    listModel.addElement(String.valueOf(m.getId()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Exibe o erro no console
        }
    }
    public void filtraPorData(DefaultListModel<String> listModel, String param) throws IOException, ClassNotFoundException{
        int ano = Integer.parseInt(""+param.charAt(6)+param.charAt(7)+param.charAt(8)+param.charAt(9));
        int mes = Integer.parseInt(""+param.charAt(3)+param.charAt(4));
        int dia = Integer.parseInt(""+param.charAt(0)+param.charAt(1));
        
        for (Manutencao m : manutencoes){
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(m.getDataAtual()); 
            int diaMan = calendar.get(Calendar.DAY_OF_MONTH);
            if(ano==m.getDataAtual().getYear()+1900 && mes-1 == m.getDataAtual().getMonth() && dia == diaMan){
                listModel.addElement(m.getId()+"");
            }
        }
    }
    public void filtraPorPrioridade(DefaultListModel<String> listModel, String texto) throws IOException, ClassNotFoundException{
        this.carregarListaManutencoes();
        for (Manutencao m : this.manutencoes){
            if(m.getPrioridade() == Prioridade.valueOf(texto)){
                listModel.addElement(String.valueOf(m.getId()));
            }
        } 
    }
    
    //
    

    public String getArquivoManutencao() {
        return arquivoManutencao;
    }

    public void setArquivoManutencao(String arquivoManutencao) {
        this.arquivoManutencao = arquivoManutencao;
    }

    public ArrayList<Manutencao> getManutencoes() {
        return manutencoes;
    }

    public void setManutencoes(ArrayList<Manutencao> manutencoes) {
        this.manutencoes = manutencoes;
    }

    public String getArquivoEquipamento() {
        return arquivoEquipamento;
    }

    public void setArquivoEquipamento(String arquivoEquipamento) {
        this.arquivoEquipamento = arquivoEquipamento;
    }

    public ArrayList<Equipamento> getEquipamento() {
        return equipamento;
    }                                                                                       

    public void setEquipamento(ArrayList<Equipamento> equipamento) {
        this.equipamento = equipamento;
    }

    public String getArquivoFuncionario() {
        return arquivoFuncionario;
    }

    public void setArquivoFuncionario(String arquivoFuncionario) {
        this.arquivoFuncionario = arquivoFuncionario;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
}
