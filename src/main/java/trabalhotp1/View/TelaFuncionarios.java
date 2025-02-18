package trabalhotp1.View;

/**
 *
 * @author brunosilva
 */

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import trabalhotp1.Model.Especialidade;
import trabalhotp1.Model.Funcionario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Tela para cadastro, pesquisa e gerenciamento de funcionários.
 */
public class TelaFuncionarios extends javax.swing.JFrame {

    // Lista para armazenar os funcionários
    private final List<Funcionario> listaFuncionarios = new ArrayList<>();

 
    public TelaFuncionarios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelDataNascimento = new javax.swing.JLabel();
        jTextFieldDataNascimento = new javax.swing.JTextField();
        jLabelSetor = new javax.swing.JLabel();
        jTextFieldSetor = new javax.swing.JTextField();
        jLabelEspecialidade = new javax.swing.JLabel();
        jCheckBoxEletronica = new javax.swing.JCheckBox();
        jCheckBoxEletrica = new javax.swing.JCheckBox();
        jCheckBoxQuimica = new javax.swing.JCheckBox();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPaneTabela = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        jLabelPesquisa = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jButtonPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNome.setText("Nome:");

        jLabelDataNascimento.setText("Data de Nascimento:");

        jLabelSetor.setText("Setor:");

        jLabelEspecialidade.setText("Especialidade:");

        jCheckBoxEletronica.setText("Eletrônica");

        jCheckBoxEletrica.setText("Elétrica");

        jCheckBoxQuimica.setText("Química");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(evt -> cadastrarFuncionario());

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(evt -> editarFuncionario());

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(evt -> excluirFuncionario());

        jTableFuncionarios.setModel(new DefaultTableModel(
            new Object[][]{},
            new String[]{"Nome", "Data Nascimento", "Setor", "Especialidade"}
        ));
        jScrollPaneTabela.setViewportView(jTableFuncionarios);

        jLabelPesquisa.setText("Pesquisar:");

        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Nome", "Setor", "Especialidade"}));

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(evt -> pesquisarFuncionario());

        // Layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTabela)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelDataNascimento)
                            .addComponent(jLabelSetor)
                            .addComponent(jLabelEspecialidade))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBoxEletronica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxEletrica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxQuimica))
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldDataNascimento)
                            .addComponent(jTextFieldSetor)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 300, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataNascimento)
                    .addComponent(jTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSetor)
                    .addComponent(jTextFieldSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEspecialidade)
                    .addComponent(jCheckBoxEletronica)
                    .addComponent(jCheckBoxEletrica)
                    .addComponent(jCheckBoxQuimica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPesquisa)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>


private Date converterStringParaDate(String dataStr) {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato da data
    try {
        return formato.parse(dataStr); // Converte a String para Date
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Formato de data inválido. Use o formato dd/MM/yyyy.");
        return null; // Retorna null em caso de erro
    }
}
    
    
    
    private void cadastrarFuncionario() {
    String nome = jTextFieldNome.getText();
    String dataNascimentoStr = jTextFieldDataNascimento.getText();
    String setor = jTextFieldSetor.getText();
    
    Date dataNascimento = converterStringParaDate(dataNascimentoStr);
    if (dataNascimento == null) {
        return; // Se a conversão falhar, interrompe o cadastro
    }
    
    // Coletar as especialidades como uma String
    ArrayList<Especialidade> especialidades = getEspecialidadesSelecionadas();
    
    // Criar o novo funcionário com os 7 parâmetros exigidos
    Funcionario funcionario = new Funcionario(
        "",                
        nome,      //Nome
        dataNascimento,         //Data de Nascimento
        "",        
        "",                  // Parâmetro adicional 1 (substitua pelo valor correto)
        setor,                  // o conteúdo desse campo está aparecendo como setor na lista
        especialidades                   // o conteúdo desse campo está aparecendo como especialidade na lista
    );
    
    // Adicionar o funcionário à lista
    listaFuncionarios.add(funcionario);
    
    // Atualizar a tabela e limpar os campos
    atualizarTabela();
    limparCampos();
}

    private void editarFuncionario() {
    int selectedRow = jTableFuncionarios.getSelectedRow();
    if (selectedRow >= 0) {
        // Obtém o funcionário selecionado na tabela
        Funcionario funcionario = listaFuncionarios.get(selectedRow);
        
        // Atualiza os dados do funcionário
        funcionario.setNome(jTextFieldNome.getText());
        
        String dataNascimentoStr = jTextFieldDataNascimento.getText();
        Date dataNascimento = converterStringParaDate(dataNascimentoStr);
        if (dataNascimento != null) {
            funcionario.setDataNascimento(dataNascimento);
        }
        
        funcionario.setSetor(jTextFieldSetor.getText());
        
        // Coletar as especialidades como uma String
        ArrayList<Especialidade> especialidades = getEspecialidadesSelecionadas();
        funcionario.setEspecialidade(especialidades);
        
        // Atualiza a tabela e limpa os campos
        atualizarTabela();
        limparCampos();
    } else {
        JOptionPane.showMessageDialog(this, "Selecione um funcionário para editar.");
    }
}

    private void excluirFuncionario() {
        int selectedRow = jTableFuncionarios.getSelectedRow();
        if (selectedRow >= 0) {
            listaFuncionarios.remove(selectedRow);
            atualizarTabela();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um funcionário para excluir.");
        }
    }

    private void pesquisarFuncionario() {
        // Implementar a lógica de filtro
    }
    
    private String converterDateParaString(Date data) {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); // Define o formato da data
    return formato.format(data); // Converte a Date para String
}

    private void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) jTableFuncionarios.getModel();
        model.setRowCount(0);
        for (Funcionario f : listaFuncionarios) {
            // Converter a lista de especialidades em uma String separada por vírgula
            StringBuilder especialidadesStr = new StringBuilder();
            for (Especialidade especialidade : f.getEspecialidade()) {
                if (especialidadesStr.length() > 0) {
                    especialidadesStr.append(", ");
            }
            especialidadesStr.append(especialidade.name()); // Usa o nome da enumeração
        }
            
                    // Converter a data de nascimento de Date para String
            String dataNascimentoStr = converterDateParaString(f.getDataNascimento());

            
            model.addRow(new Object[]{f.getNome(), dataNascimentoStr, f.getSetor(), especialidadesStr.toString()});
        }
    }

private ArrayList<Especialidade> getEspecialidadesSelecionadas() {
    ArrayList<Especialidade> especialidades = new ArrayList<>();
    
    if (jCheckBoxEletronica.isSelected()) {
        especialidades.add(Especialidade.Eletrônica);
    }
    if (jCheckBoxEletrica.isSelected()) {
        especialidades.add(Especialidade.Elétrica);
    }
    if (jCheckBoxQuimica.isSelected()) {
        especialidades.add(Especialidade.Química);
    }
    
    return especialidades;
}
    
    private void limparCampos() {
        jTextFieldNome.setText("");
        jTextFieldDataNascimento.setText("");
        jTextFieldSetor.setText("");
        jCheckBoxEletronica.setSelected(false);
        jCheckBoxEletrica.setSelected(false);
        jCheckBoxQuimica.setSelected(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaFuncionarios().setVisible(true));
    }

    // Início da declaração de variáveis
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JCheckBox jCheckBoxEletronica;
    private javax.swing.JCheckBox jCheckBoxEletrica;
    private javax.swing.JCheckBox jCheckBoxQuimica;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEspecialidade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JLabel jLabelSetor;
    private javax.swing.JScrollPane jScrollPaneTabela;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JTextField jTextFieldDataNascimento;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldSetor;
    // Fim da declaração de variáveis
}
