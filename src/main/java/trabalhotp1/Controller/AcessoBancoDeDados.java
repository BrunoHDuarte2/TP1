
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
    private ArrayList<Equipamento> equipamentos = new ArrayList();
    private String arquivoFuncionario = "funcionario.dat";
    private ArrayList<Funcionario> funcionarios = new ArrayList();

    // Métodos para o desenvolvimento da tela de manutenção.
    public AcessoBancoDeDados() throws IOException, ClassNotFoundException{
        this.carregarListaManutencoes();
        this.carregarListaFuncionarios();
        this.carregarListaEquipamentos();
        
    }
    public void salvarListaManutencoes(ArrayList<Manutencao> lista) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivoManutencao))) {
            oos.writeObject(lista);
        }
    }
    public void carregarListaManutencoes() throws IOException, ClassNotFoundException {
        File file = new File(arquivoManutencao);

        // Verifica se o arquivo existe e não está vazio
        if (!file.exists() || file.length() == 0) {
            System.out.println("Arquivo manutencao.dat não encontrado ou está vazio. Criando lista vazia.");
            this.manutencoes = new ArrayList<>();
            return;
        }

        // Carrega os dados do arquivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            this.manutencoes = (ArrayList<Manutencao>) ois.readObject();
        } catch (EOFException e) {
            System.out.println("Fim do arquivo funcionarios.dat alcançado.");
            this.manutencoes = new ArrayList<>();
        } catch (Exception e) {
            System.err.println("Erro ao carregar funcionários: " + e.getMessage());
            this.manutencoes = new ArrayList<>();
        }
    }

    public void criarManutencao(Prioridade prioridade, Funcionario f, Equipamento equipamento) throws IOException, ClassNotFoundException{
        this.carregarListaManutencoes();
        this.manutencoes.add(new Manutencao(this.manutencoes.size(), prioridade, f, equipamento));
        this.salvarListaManutencoes(this.manutencoes);
    }
    public void criarManutencao(Prioridade prioridade, ArrayList<Funcionario> f, Equipamento equipamento) throws IOException, ClassNotFoundException{
        this.carregarListaManutencoes();
        this.manutencoes.add(new Manutencao(this.manutencoes.size(), prioridade, equipamento, f));
        this.salvarListaManutencoes(this.manutencoes);
    }
    public void deletarManutencao(Manutencao m) throws IOException, ClassNotFoundException{
        this.carregarListaManutencoes();
        Manutencao mCerta = null;
        for (Manutencao n : this.manutencoes){
            if (m.getId()==n.getId()){
                mCerta = n;
            }
        }
        this.manutencoes.remove(mCerta);
        this.salvarListaManutencoes(this.manutencoes);
        this.carregarListaManutencoes();
    }
    public Manutencao pesquisaManutencao(int index) throws IOException, ClassNotFoundException{
        this.carregarListaManutencoes();
        for(Manutencao m : this.manutencoes){
            if(m.getId()==index){
                return m;
            }
        }
        return null;
    }
    public void editaManutencao(int index, Manutencao m) throws IOException, ClassNotFoundException{
        this.carregarListaManutencoes();
        for (int i = 0; i<this.manutencoes.size(); i++){
            if(m.getId()==this.manutencoes.get(i).getId()){
                this.manutencoes.set(i, m);
            }
        }
        this.salvarListaManutencoes(this.manutencoes);
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
            if(m.getPrioridade() == Prioridade.valueOf(texto.toUpperCase())){
                listModel.addElement(String.valueOf(m.getId()));
            }
        } 
    }
   
    // Métodos para desenvolver a tela de equipamentos
    public void carregarListaEquipamentos() throws IOException, ClassNotFoundException {
        File file = new File(arquivoEquipamento);
        if (!file.exists() || file.length() == 0) { // Verifica se o arquivo existe ou está vazio
            this.equipamentos = new ArrayList<>(); // Inicializa a lista como vazia
            System.out.println("Arquivo equipamentos.dat está vazio ou não existe. Criando lista vazia.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            this.equipamentos = (ArrayList<Equipamento>) ois.readObject();
        } catch (EOFException e) {
            System.out.println("Fim do arquivo alcançado. Nenhum dado carregado.");
            this.equipamentos = new ArrayList<>(); // Inicializa a lista como vazia
        } catch (Exception e) {
            System.err.println("Erro ao carregar equipamentos: " + e.getMessage());
            this.equipamentos = new ArrayList<>();
        }
    }

    public void salvarListaEquipamentos(ArrayList<Equipamento> lista) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivoEquipamento))) {
            oos.writeObject(lista);
        }
    }
    public void criarEquipamento(Equipamento e) throws IOException, ClassNotFoundException{
        this.carregarListaEquipamentos();
        this.equipamentos.add(e);
        this.salvarListaEquipamentos(this.equipamentos);
    }
    public void deletarEquipamento(Equipamento m) throws IOException, ClassNotFoundException{
        this.carregarListaEquipamentos();
        this.equipamentos.remove(m);
        this.salvarListaEquipamentos(this.equipamentos);
    }
    public Equipamento pesquisaEquipamento(String nome) throws IOException, ClassNotFoundException{
        this.carregarListaEquipamentos();
        for(Equipamento m : this.equipamentos){
            if(m.getNome().toUpperCase().equals(nome.toUpperCase())){
                return m;
            }
        }
        return null;
    }
    
    
    // Métodos para desenvolver a tela de funcionários
    public void carregarListaFuncionarios() throws IOException, ClassNotFoundException {
        File file = new File(arquivoFuncionario);

        // Verifica se o arquivo existe e não está vazio
        if (!file.exists() || file.length() == 0) {
            System.out.println("Arquivo funcionario.dat não encontrado ou está vazio. Criando lista vazia.");
            this.funcionarios = new ArrayList<>();
            return;
        }

        // Carrega os dados do arquivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            this.funcionarios = (ArrayList<Funcionario>) ois.readObject();
        } catch (EOFException e) {
            System.out.println("Fim do arquivo funcionario.dat alcançado.");
            this.funcionarios = new ArrayList<>();
        } catch (Exception e) {
            System.err.println("Erro ao carregar funcionário: " + e.getMessage());
            this.funcionarios = new ArrayList<>();
        }
    }

    public void salvarListaFuncionarios(ArrayList<Funcionario> lista) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivoFuncionario))) {
            oos.writeObject(lista);
        }
    }
    public void criarFuncionario(Funcionario f) throws IOException, ClassNotFoundException{
        this.carregarListaFuncionarios();
        this.funcionarios.add(f);
        this.salvarListaFuncionarios(this.funcionarios);
    }
    public void deletarFuncionario(Funcionario m) throws IOException, ClassNotFoundException{
        this.carregarListaFuncionarios();
        this.funcionarios.remove(m);
        this.salvarListaFuncionarios(this.funcionarios);
    }
    public Funcionario pesquisaFuncionario(String mat) throws IOException, ClassNotFoundException{
        this.carregarListaFuncionarios();
        for(Funcionario m : this.funcionarios){
            if(m.getMatricula().equals(mat)){
                System.out.println(m);
                return m;
            }
        }
        return null;
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
        return equipamentos;
    }                                                                                       

    public void setEquipamento(ArrayList<Equipamento> equipamento) {
        this.equipamentos = equipamento;
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
    public String[] getFuncionariosFormat() {
        String[] s = new String[this.getFuncionarios().size()];
        int i = 0;
        for (Funcionario f : this.getFuncionarios()){
            s[i] = f.getNome()+"/"+f.getMatricula();
            i++;
        }
        return s;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
}
