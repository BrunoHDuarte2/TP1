/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhotp1.View;

/**
 *
 * @author brunosilva
 */

import javax.swing.*;


public class TelaFuncionarios extends javax.swing.JFrame {


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
        jSeparator1 = new javax.swing.JSeparator();
        jLabelPesquisa = new javax.swing.JLabel();
        jTextFieldPesquisaNome = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();

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

        jLabelPesquisa.setText("Pesquisar Funcionário (Nome):");

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(evt -> pesquisarFuncionario());

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultado);

        // Layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPesquisaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 310, Short.MAX_VALUE)
                        .addComponent(jButtonCadastrar))
                    .addComponent(jScrollPane1))
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
                .addComponent(jButtonCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPesquisa)
                    .addComponent(jTextFieldPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    private void cadastrarFuncionario() {
        String nome = jTextFieldNome.getText();
        String dataNascimento = jTextFieldDataNascimento.getText();
        String setor = jTextFieldSetor.getText();
        String especialidade = "";
        if (jCheckBoxEletronica.isSelected()) especialidade += "Eletrônica ";
        if (jCheckBoxEletrica.isSelected()) especialidade += "Elétrica ";
        if (jCheckBoxQuimica.isSelected()) especialidade += "Química ";
        JOptionPane.showMessageDialog(this, "Funcionário cadastrado:\nNome: " + nome +
                "\nData de Nascimento: " + dataNascimento + "\nSetor: " + setor + "\nEspecialidade: " + especialidade);
    }

    private void pesquisarFuncionario() {
        String pesquisa = jTextFieldPesquisaNome.getText();
        jTextAreaResultado.setText("Resultado da pesquisa para: " + pesquisa + "\n(Implementar lógica de busca)");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaFuncionarios().setVisible(true));
    }

    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JCheckBox jCheckBoxEletrica;
    private javax.swing.JCheckBox jCheckBoxEletronica;
    private javax.swing.JCheckBox jCheckBoxQuimica;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEspecialidade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPesquisa;
    private javax.swing.JLabel jLabelSetor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaResultado;
    private javax.swing.JTextField jTextFieldDataNascimento;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisaNome;
    private javax.swing.JTextField jTextFieldSetor;
}

