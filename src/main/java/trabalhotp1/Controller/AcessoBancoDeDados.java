import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import trabalhotp1.Model.Equipamento;
import trabalhotp1.Model.Funcionario;
import trabalhotp1.Model.Manutencao;
import trabalhotp1.Model.Prioridade;

public class AcessoBancoDeDados {
    private ArrayList<Manutencao> manutencoes;

    public AcessoBancoDeDados() {
        try {
            System.out.println("Diretório atual: " + System.getProperty("user.dir"));

            manutencoes = lerDados("src/main/java/trabalhotp1/resources/Manutencoes.txt");
        } catch (IOException | ParseException e) {
            System.out.println("Erro ao processar o arquivo: " + e.getMessage());
            manutencoes = new ArrayList<>();
        }
    }

    public static ArrayList<Manutencao> lerDados(String arquivo) throws IOException, ParseException {
    ArrayList<Manutencao> lista = new ArrayList<>();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
        String linha;
        while ((linha = reader.readLine()) != null) {
            linha = linha.trim();
            if (linha.isEmpty()) {
                continue; // Ignora linhas vazias
            }

            String[] partes = linha.split(";");
            if (partes.length < 5) {
                System.out.println("Linha inválida, ignorada: " + linha);
                continue;
            }

            try {
                int id = Integer.parseInt(partes[0]);
                Date data = dateFormat.parse(partes[1]);
                Prioridade prioridade = Prioridade.valueOf(partes[2].toUpperCase());
                ArrayList<Funcionario> funcionarios = criarFuncionarios(partes[3]);
                Equipamento equipamento = new Equipamento(partes[4]);

                Manutencao manutencao = new Manutencao(id, data, prioridade, null, equipamento);
                for (Funcionario f : funcionarios) {
                    manutencao.alocarFuncionario(f);
                }
                lista.add(manutencao);
            } catch (NumberFormatException | ParseException e) {
                System.out.println("Erro ao processar a linha: " + linha);
                e.printStackTrace();
            }
        }
    }

    return lista;
}
    


    private static ArrayList<Funcionario> criarFuncionarios(String nomes) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        String[] nomesArray = nomes.split(",");
        for (String nome : nomesArray) {
            funcionarios.add(new Funcionario(nome.trim()));
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


