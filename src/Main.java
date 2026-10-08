import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Cabecalho.exibir();

        // A classe Questao fornecida pelo professor armazena cada pergunta.
        List<Questao> questoes = criarQuestoes();
        int acertos = 0;

        for (int i = 0; i < questoes.size(); i++) {
            Questao questao = questoes.get(i);

            System.out.printf("--- Questao %d de %d ---%n", i + 1, questoes.size());
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();

            if (questao.isCorreta(resposta)) {
                acertos++;
            }
        }

        double porcentagem = acertos * 100.0 / questoes.size();

        System.out.println("=======================================================");
        System.out.println("                  RESULTADO FINAL");
        System.out.println("=======================================================");
        System.out.printf("Total de questoes: %d%n", questoes.size());
        System.out.printf("Total de acertos : %d%n", acertos);
        System.out.printf(Locale.forLanguageTag("pt-BR"),
                "Media de acertos : %.2f%%%n", porcentagem);
        System.out.println();
        System.out.println("Obrigado por participar do Quiz de Tecnologia!");
        System.out.println("=======================================================");
    }

    private static List<Questao> criarQuestoes() {
        List<Questao> questoes = new ArrayList<>();

        questoes.add(criarQuestao(
                "O que significa CPU em um computador?",
                "A) Central de Programas Universais",
                "B) Unidade Central de Processamento",
                "C) Controle de Protecao do Usuario",
                "D) Componente Principal de Upload",
                "E) Codigo de Processamento Unico",
                "B"));

        questoes.add(criarQuestao(
                "O que e phishing?",
                "A) Um metodo para aumentar a velocidade da internet",
                "B) Um tipo de impressora",
                "C) Um golpe para roubar dados usando mensagens falsas",
                "D) Um programa para editar imagens",
                "E) Uma linguagem de programacao",
                "C"));

        questoes.add(criarQuestao(
                "Qual pratica ajuda a criar uma senha mais segura?",
                "A) Usar apenas o proprio nome",
                "B) Repetir a mesma senha em todas as contas",
                "C) Utilizar a sequencia 123456",
                "D) Usar uma senha longa e exclusiva para cada conta",
                "E) Compartilhar a senha com amigos",
                "D"));

        questoes.add(criarQuestao(
                "Para que serve o HTTPS em um site?",
                "A) Proteger a comunicacao entre navegador e site com criptografia",
                "B) Tornar todos os arquivos do computador publicos",
                "C) Desligar o antivirus automaticamente",
                "D) Impedir que sites tenham imagens",
                "E) Substituir o sistema operacional",
                "A"));

        questoes.add(criarQuestao(
                "O que e um backup?",
                "A) Uma senha para acessar redes sociais",
                "B) Um erro do computador",
                "C) Um navegador de internet",
                "D) Uma tentativa de invasao",
                "E) Uma copia de seguranca dos arquivos",
                "E"));

        questoes.add(criarQuestao(
                "Qual das opcoes descreve um malware?",
                "A) Um cabo de rede",
                "B) Um software criado para causar danos ou agir de forma maliciosa",
                "C) Um componente de refrigeracao",
                "D) Um formato de papel",
                "E) Uma pasta de arquivos sem risco",
                "B"));

        questoes.add(criarQuestao(
                "Qual e o objetivo da autenticacao em dois fatores (2FA)?",
                "A) Desativar todas as senhas",
                "B) Diminuir a seguranca do acesso",
                "C) Permitir que qualquer pessoa entre na conta",
                "D) Exigir uma segunda verificacao alem da senha",
                "E) Trocar o endereco de e-mail automaticamente",
                "D"));

        questoes.add(criarQuestao(
                "Qual destes programas e um navegador de internet?",
                "A) Microsoft Excel",
                "B) Bloco de Notas",
                "C) Mozilla Firefox",
                "D) Calculadora",
                "E) Paint",
                "C"));

        questoes.add(criarQuestao(
                "O que significa armazenar arquivos na nuvem?",
                "A) Guardar dados em servidores acessados pela internet",
                "B) Salvar arquivos apenas em pendrive",
                "C) Apagar automaticamente os arquivos",
                "D) Imprimir documentos pela rede",
                "E) Desconectar o computador da internet",
                "A"));

        questoes.add(criarQuestao(
                "Qual atitude e mais segura ao usar um Wi-Fi publico?",
                "A) Desativar todas as protecoes do aparelho",
                "B) Compartilhar senhas pelo grupo da rede",
                "C) Instalar aplicativos sugeridos por desconhecidos",
                "D) Acessar qualquer site sem verificar sua seguranca",
                "E) Evitar acessar dados sensiveis em redes nao confiaveis",
                "E"));

        questoes.add(criarQuestao(
                "O que e Java?",
                "A) Um tipo de roteador",
                "B) Uma linguagem de programacao",
                "C) Um modelo de monitor",
                "D) Um dispositivo de armazenamento",
                "E) Um editor de planilhas",
                "B"));

        questoes.add(criarQuestao(
                "Em programacao, para que serve uma variavel?",
                "A) Aumentar a memoria fisica do computador",
                "B) Ligar e desligar o monitor",
                "C) Armazenar um valor que pode ser utilizado pelo programa",
                "D) Substituir obrigatoriamente todos os metodos",
                "E) Instalar um navegador",
                "C"));

        questoes.add(criarQuestao(
                "Qual estrutura permite repetir instrucoes em Java?",
                "A) import",
                "B) class",
                "C) return",
                "D) for",
                "E) package",
                "D"));

        questoes.add(criarQuestao(
                "Quais valores uma variavel do tipo boolean pode armazenar?",
                "A) true ou false",
                "B) Qualquer numero decimal",
                "C) Apenas letras",
                "D) Somente numeros negativos",
                "E) Apenas datas",
                "A"));

        questoes.add(criarQuestao(
                "Para que serve o GitHub?",
                "A) Para realizar chamadas telefonicas",
                "B) Para substituir o processador",
                "C) Para fabricar placas de video",
                "D) Para carregar a bateria do computador",
                "E) Para hospedar e colaborar em projetos de codigo",
                "E"));

        return questoes;
    }

    // Monta um objeto utilizando os atributos da Questao original do professor.
    private static Questao criarQuestao(String pergunta,
                                      String opcaoA, String opcaoB,
                                      String opcaoC, String opcaoD,
                                      String opcaoE, String correta) {
        Questao questao = new Questao();
        questao.pergunta = pergunta;
        questao.opcaoA = opcaoA;
        questao.opcaoB = opcaoB;
        questao.opcaoC = opcaoC;
        questao.opcaoD = opcaoD;
        questao.opcaoE = opcaoE;
        questao.correta = correta;
        return questao;
    }
}
