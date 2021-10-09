import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * * SITUAÇÃO:
         * 
         * Digamos que você tem uma lista de nomes e por um acaso do destino você
         * precisa guardar esses nomes em um arquivo .txt
         * 
         */

        // Cria a lista e insere os nomes
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Carlos");
        listaNomes.add("Júnior");
        listaNomes.add("Lucas");
        listaNomes.add("Karol (semcá)");
        listaNomes.add("Hector");
        listaNomes.add("Gabrielton");

        // Cria o arquivo nomes.txt
        var escritorArquivo = new FileWriter("nomes.txt");

        // Cria um executador para ações de escrita no arquivo
        var imprimeEscritor = new PrintWriter(escritorArquivo);

        // Percorre e imprime dados da lista no arquivo nomes.txt
        listaNomes.forEach(imprimeEscritor::println);

        // Fecha a conexão com o imprimeEscritor
        imprimeEscritor.close();

        /**
         * * DESAFIO: Tente ler arquivos .txt e colocar na sua lista de nomes.
         * 
         * ! Não escreva linhas demais
         */
    }
}
