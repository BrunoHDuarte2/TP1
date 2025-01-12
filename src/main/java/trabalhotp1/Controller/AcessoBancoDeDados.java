
package trabalhotp1.Controller;
import java.io.*;
import java.util.ArrayList;
import trabalhotp1.Model.Equipamento;
import trabalhotp1.Model.Funcionario;
import trabalhotp1.Model.Manutencao;

public class AcessoBancoDeDados {
    private String arquivoManutencao = "manutencao.dat";
    private ArrayList<Manutencao> manutencoes = new ArrayList();
    private String arquivoEquipamento = "equipamento.dat";
    private ArrayList<Equipamento> equipamento = new ArrayList();
    private String arquivoFuncionario = "funcionario.dat";
    private ArrayList<Funcionario> funcionarios = new ArrayList();

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
