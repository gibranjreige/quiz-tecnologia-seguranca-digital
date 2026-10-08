# Quiz de Tecnologia e Segurança Digital

**Disciplina:** Algoritmos e Linguagem de Programação II  
**Aluno:** Gibran Jreige  
**Professor:** Brenno Pimenta  
**Faculdade:** PREENCHER NOME DA FACULDADE

## Descrição

Projeto em Java para terminal com 15 perguntas objetivas sobre tecnologia e segurança digital.
Cada questão possui cinco alternativas (A a E) e uma única correta. Ao terminar,
o programa informa a quantidade de acertos, a média percentual com duas casas decimais
e agradece pela participação.

## Organização do código

- `src/Cabecalho.java`: mostra os dados do trabalho.
- `src/Questao.java`: classe original disponibilizada pelo professor.
- `src/Main.java`: cadastra as 15 perguntas e executa o quiz.

## Como executar no IntelliJ IDEA

1. Abra a pasta do projeto pelo menu **File > Open**.
2. Configure um **JDK** (Java 8 ou superior), se solicitado.
3. Abra `src/Main.java`.
4. Clique no botão verde ao lado do método `main` e escolha **Run 'Main.main()'**.
5. Responda digitando as letras A, B, C, D ou E e pressionando Enter.

## Como executar pelo terminal

É necessário ter o JDK instalado. Na pasta raiz do projeto, execute:

```bash
javac -encoding UTF-8 -d out src/*.java
java -cp out Main
```

No Windows PowerShell, caso o curinga não funcione:

```powershell
javac -encoding UTF-8 -d out src/Questao.java src/Cabecalho.java src/Main.java
java -cp out Main
```

## Requisitos atendidos

- Classe `Cabecalho` com identificação da faculdade, aluno, professor e tema.
- Classe `Questao.java` original disponibilizada pelo professor, sem alterações.
- Lista `ArrayList` com 15 objetos `Questao`.
- Cinco alternativas e uma resposta correta por questão.
- Validação das respostas A–E pela classe original.
- Laço `for`, condição `if`, contagem de acertos e média percentual com duas casas decimais.
- Agradecimento final.

**Antes de entregar:** substitua `PREENCHER NOME DA FACULDADE` neste README e em
`src/Cabecalho.java` pelo nome da sua faculdade. Confira também o nome do professor.

## Código de referência

Classe `Questao` fornecida pelo professor:
https://github.com/brennopimenta/universidadeESN2_QUIZ
