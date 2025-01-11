import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import trabalhotp1.Model.Equipamento;
import trabalhotp1.Model.Especialidade;
import trabalhotp1.Model.Funcionario;
import trabalhotp1.Model.Manutencao;
import trabalhotp1.Model.Prioridade;

public class AcessoBancoDeDados {
    private ArrayList<Manutencao> manutencoes;
    private ArrayList<Equipamento> equipamentos;
    private ArrayList<Funcionario> funcionarios;

    public AcessoBancoDeDados() {
        try {
            
            lerDadosManutencao("src/main/java/trabalhotp1/resources/Manutencoes.txt");
        } catch (IOException | ParseException e) {
            System.out.println("Erro ao processar o arquivo: " + e.getMessage());
            manutencoes = new ArrayList<>();
        }
    }

    public void lerDadosManutencao(String arquivo) throws IOException, ParseException {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String linha;
                while ((linha = reader.readLine()) != null) {
                    linha = linha.trim();
                    if (linha.isEmpty()) continue;

                    String[] partes = linha.split(";");
                    int id = Integer.parseInt(partes[0]);
                    Date data = dateFormat.parse(partes[1]);
                    Prioridade prioridade = Prioridade.valueOf(partes[2].toUpperCase());
                    ArrayList<Funcionario> funcionarios = criarFuncionarios(partes[3]);
                    Equipamento equipamento = new Equipamento(partes[4]);

                    Manutencao manutencao = new Manutencao(id, data, prioridade, null, equipamento);
                    for (Funcionario f : funcionarios) {
                        manutencao.alocarFuncionario(f);
                    }
                    manutencoes.add(manutencao);
                }
            } catch (IOException | ParseException e) {
                System.out.println("Erro ao carregar dados: " + e.getMessage());
            }
    }



    private static ArrayList<Funcionario> criarFuncionarios(String funcionariosStr) throws ParseException {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Divide os dados de funcionários por "|"
        String[] funcionariosArray = funcionariosStr.split("\\|");
        for (String funcionarioStr : funcionariosArray) {
            // Divide os campos de cada funcionário por ","
            String[] dados = funcionarioStr.split(",");
            if (dados.length < 7) { // Verifica se há ao menos 7 campos para um funcionário válido
                System.out.println("Dados de funcionário inválidos: " + funcionarioStr);
                continue;
            }

            try {
                // Extração dos campos do funcionário
                String matricula = dados[0].trim();
                String nome = dados[1].trim();
                Date dataNascimento = dateFormat.parse(dados[2].trim());
                String login = dados[3].trim();
                String senha = dados[4].trim();
                String setor = dados[5].trim();
                Especialidade especialidade = Especialidade.valueOf(dados[6].trim().toUpperCase());

                // Cria o objeto Funcionario e o adiciona à lista
                Funcionario funcionario = new Funcionario(matricula, nome, dataNascimento, login, senha, setor, especialidade);
                funcionarios.add(funcionario);
            } catch (IllegalArgumentException e) {
                System.out.println("Especialidade inválida para o funcionário: " + funcionarioStr);
            }
        }

        return funcionarios;
}



    public void exibirDados() {
        if (manutencoes.isEmpty()) {
            System.out.println("Nenhuma manutenção encontrada.");
        } else {
            for (Manutencao manutencao : manutencoes) {
                System.out.println(manutencao);
            }
        }
    }

    
}


