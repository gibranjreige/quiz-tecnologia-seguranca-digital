import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cabecalho.exibir();

        ArrayList<Questao> questoes = new ArrayList<>();

        Questao q1 = new Questao();
        q1.pergunta = "O que significa CPU em um computador?";
        q1.opcaoA = "A) Central de Programas Universais";
        q1.opcaoB = "B) Unidade Central de Processamento";
        q1.opcaoC = "C) Controle de Protecao do Usuario";
        q1.opcaoD = "D) Componente Principal de Upload";
        q1.opcaoE = "E) Codigo de Processamento Unico";
        q1.correta = "B";
        questoes.add(q1);

        Questao q2 = new Questao();
        q2.pergunta = "O que e phishing?";
        q2.opcaoA = "A) Um metodo para aumentar a velocidade da internet";
        q2.opcaoB = "B) Um tipo de impressora";
        q2.opcaoC = "C) Um golpe para roubar dados usando mensagens falsas";
        q2.opcaoD = "D) Um programa para editar imagens";
        q2.opcaoE = "E) Uma linguagem de programacao";
        q2.correta = "C";
        questoes.add(q2);

        Questao q3 = new Questao();
        q3.pergunta = "Qual pratica ajuda a criar uma senha mais segura?";
        q3.opcaoA = "A) Usar apenas o proprio nome";
        q3.opcaoB = "B) Repetir a mesma senha em todas as contas";
        q3.opcaoC = "C) Utilizar a sequencia 123456";
        q3.opcaoD = "D) Usar uma senha longa e exclusiva para cada conta";
        q3.opcaoE = "E) Compartilhar a senha com amigos";
        q3.correta = "D";
        questoes.add(q3);

        Questao q4 = new Questao();
        q4.pergunta = "Para que serve o HTTPS em um site?";
        q4.opcaoA = "A) Proteger a comunicacao entre navegador e site com criptografia";
        q4.opcaoB = "B) Tornar todos os arquivos do computador publicos";
        q4.opcaoC = "C) Desligar o antivirus automaticamente";
        q4.opcaoD = "D) Impedir que sites tenham imagens";
        q4.opcaoE = "E) Substituir o sistema operacional";
        q4.correta = "A";
        questoes.add(q4);

        Questao q5 = new Questao();
        q5.pergunta = "O que e um backup?";
        q5.opcaoA = "A) Uma senha para acessar redes sociais";
        q5.opcaoB = "B) Um erro do computador";
        q5.opcaoC = "C) Um navegador de internet";
        q5.opcaoD = "D) Uma tentativa de invasao";
        q5.opcaoE = "E) Uma copia de seguranca dos arquivos";
        q5.correta = "E";
        questoes.add(q5);

        Questao q6 = new Questao();
        q6.pergunta = "Qual das opcoes descreve um malware?";
        q6.opcaoA = "A) Um cabo de rede";
        q6.opcaoB = "B) Um software criado para causar danos ou agir de forma maliciosa";
        q6.opcaoC = "C) Um componente de refrigeracao";
        q6.opcaoD = "D) Um formato de papel";
        q6.opcaoE = "E) Uma pasta de arquivos sem risco";
        q6.correta = "B";
        questoes.add(q6);

        Questao q7 = new Questao();
        q7.pergunta = "Qual e o objetivo da autenticacao em dois fatores (2FA)?";
        q7.opcaoA = "A) Desativar todas as senhas";
        q7.opcaoB = "B) Diminuir a seguranca do acesso";
        q7.opcaoC = "C) Permitir que qualquer pessoa entre na conta";
        q7.opcaoD = "D) Exigir uma segunda verificacao alem da senha";
        q7.opcaoE = "E) Trocar o endereco de e-mail automaticamente";
        q7.correta = "D";
        questoes.add(q7);

        Questao q8 = new Questao();
        q8.pergunta = "Qual destes programas e um navegador de internet?";
        q8.opcaoA = "A) Microsoft Excel";
        q8.opcaoB = "B) Bloco de Notas";
        q8.opcaoC = "C) Mozilla Firefox";
        q8.opcaoD = "D) Calculadora";
        q8.opcaoE = "E) Paint";
        q8.correta = "C";
        questoes.add(q8);

        Questao q9 = new Questao();
        q9.pergunta = "O que significa armazenar arquivos na nuvem?";
        q9.opcaoA = "A) Guardar dados em servidores acessados pela internet";
        q9.opcaoB = "B) Salvar arquivos apenas em pendrive";
        q9.opcaoC = "C) Apagar automaticamente os arquivos";
        q9.opcaoD = "D) Imprimir documentos pela rede";
        q9.opcaoE = "E) Desconectar o computador da internet";
        q9.correta = "A";
        questoes.add(q9);

        Questao q10 = new Questao();
        q10.pergunta = "Qual atitude e mais segura ao usar um Wi-Fi publico?";
        q10.opcaoA = "A) Desativar todas as protecoes do aparelho";
        q10.opcaoB = "B) Compartilhar senhas pelo grupo da rede";
        q10.opcaoC = "C) Instalar aplicativos sugeridos por desconhecidos";
        q10.opcaoD = "D) Acessar qualquer site sem verificar sua seguranca";
        q10.opcaoE = "E) Evitar acessar dados sensiveis em redes nao confiaveis";
        q10.correta = "E";
        questoes.add(q10);

        Questao q11 = new Questao();
        q11.pergunta = "O que e Java?";
        q11.opcaoA = "A) Um tipo de roteador";
        q11.opcaoB = "B) Uma linguagem de programacao";
        q11.opcaoC = "C) Um modelo de monitor";
        q11.opcaoD = "D) Um dispositivo de armazenamento";
        q11.opcaoE = "E) Um editor de planilhas";
        q11.correta = "B";
        questoes.add(q11);

        Questao q12 = new Questao();
        q12.pergunta = "Em programacao, para que serve uma variavel?";
        q12.opcaoA = "A) Aumentar a memoria fisica do computador";
        q12.opcaoB = "B) Ligar e desligar o monitor";
        q12.opcaoC = "C) Armazenar um valor que pode ser utilizado pelo programa";
        q12.opcaoD = "D) Substituir obrigatoriamente todos os metodos";
        q12.opcaoE = "E) Instalar um navegador";
        q12.correta = "C";
        questoes.add(q12);

        Questao q13 = new Questao();
        q13.pergunta = "Qual estrutura permite repetir instrucoes em Java?";
        q13.opcaoA = "A) import";
        q13.opcaoB = "B) class";
        q13.opcaoC = "C) return";
        q13.opcaoD = "D) for";
        q13.opcaoE = "E) package";
        q13.correta = "D";
        questoes.add(q13);

        Questao q14 = new Questao();
        q14.pergunta = "Quais valores uma variavel do tipo boolean pode armazenar?";
        q14.opcaoA = "A) true ou false";
        q14.opcaoB = "B) Qualquer numero decimal";
        q14.opcaoC = "C) Apenas letras";
        q14.opcaoD = "D) Somente numeros negativos";
        q14.opcaoE = "E) Apenas datas";
        q14.correta = "A";
        questoes.add(q14);

        Questao q15 = new Questao();
        q15.pergunta = "Para que serve o GitHub?";
        q15.opcaoA = "A) Para realizar chamadas telefonicas";
        q15.opcaoB = "B) Para substituir o processador";
        q15.opcaoC = "C) Para fabricar placas de video";
        q15.opcaoD = "D) Para carregar a bateria do computador";
        q15.opcaoE = "E) Para hospedar e colaborar em projetos de codigo";
        q15.correta = "E";
        questoes.add(q15);

        int acertos = 0;

        for (int i = 0; i < questoes.size(); i++) {
            Questao pergunta = questoes.get(i);

            System.out.println("Questao " + (i + 1) + " de " + questoes.size());
            pergunta.escrevaQuestao();

            String resposta = pergunta.leiaResposta();

            if (pergunta.isCorreta(resposta)) {
                acertos++;
            }
        }

        double media = acertos * 100.0 / questoes.size();

        System.out.println();
        System.out.println("Resultado final");
        System.out.println("Total de acertos: " + acertos + " de " + questoes.size());
        System.out.printf("Media de acertos: %.2f%%%n", media);
        System.out.println("Obrigado por participar do quiz!");
    }
}
