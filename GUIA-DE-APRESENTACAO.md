# Como apresentar o trabalho para o professor

1. **Explique o objetivo:** "Eu desenvolvi um quiz de tecnologia e segurança digital com 15 perguntas de múltipla escolha."
2. **Mostre `Cabecalho.java`:** esta classe imprime a identificação do trabalho na tela.
3. **Mostre `Questao.java`:** é a classe fornecida pelo professor; ela exibe a pergunta, recebe uma letra e verifica se a resposta está certa.
4. **Mostre `Main.java`:** o método `criarQuestoes()` preenche uma `ArrayList<Questao>` com as 15 perguntas.
5. **Explique o `for`:** percorre a lista de perguntas uma por uma.
6. **Explique o `if`:** quando `isCorreta()` retorna `true`, o contador `acertos` aumenta em 1.
7. **Explique a média:** `acertos * 100.0 / questoes.size()`. Exemplo: 12/15 = 80,00%.
8. **Execute o projeto:** responda algumas questões e mostre o resultado ao final.

## Respostas para perguntas prováveis

- **Por que `List` e `ArrayList`?** Para armazenar e percorrer os objetos `Questao`.
- **O que é uma classe?** Um modelo que reúne dados e comportamentos.
- **O que é um objeto?** Uma instância criada a partir de uma classe, como cada pergunta.
- **O que o `for` faz?** Repete um bloco para cada pergunta.
- **O que o `if` faz?** Decide se soma ou não um acerto.
- **Por que usar `100.0`?** Para realizar a divisão usando valores decimais.
- **Por que `%.2f`?** Para apresentar a porcentagem com duas casas decimais.

Antes da entrega: preencha o nome da faculdade e confira o nome do professor.
