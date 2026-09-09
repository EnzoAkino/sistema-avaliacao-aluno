1. Qual era o principal problema do código original?
O código funcionava, mas tinha baixa legibilidade e manutenibilidade: usava nomes de variáveis genéricos (n, a, b, c) que não indicavam seu significado, e toda a lógica (cálculo, verificação e exibição) estava concentrada em um único método main, misturando responsabilidades diferentes.

2. Quais melhorias você realizou?
Substituí os nomes das variáveis por identificadores descritivos (nomeAluno, nota1, nota2, media), dividi o código em três métodos com responsabilidades específicas (calcularMedia, verificarAprovacao e exibirResultado), removi o número mágico 6 usando uma constante (MEDIA_MINIMA_APROVACAO) e padronizei a nomenclatura e a indentação do código.

3. Como a modularização facilitou a organização do código?
Com a modularização, cada método passou a ter uma única responsabilidade, o que tornou o código mais fácil de ler, testar e modificar. Por exemplo, se a regra de aprovação mudar no futuro, basta alterar o método verificarAprovacao, sem precisar mexer no cálculo da média ou na exibição dos resultados.

4. Como o Git ajudou a controlar as alterações realizadas no sistema?
O Git permitiu registrar o histórico de mudanças por meio de commits, mantendo uma versão original do código preservada na branch main enquanto as melhorias eram feitas isoladamente na branch melhoria-boas-praticas. Isso possibilitou revisar as alterações antes de integrá-las (via Pull Request), reduzindo o risco de introduzir erros diretamente na versão principal do projeto.
