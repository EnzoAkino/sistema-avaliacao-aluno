public class SistemaAvaliacaoAluno {

    private static final double MEDIA_MINIMA_APROVACAO = 6.0;

    public static void main(String[] args) {
        String nomeAluno = "Carlos";
        double nota1 = 8;
        double nota2 = 7;

        double media = calcularMedia(nota1, nota2);
        boolean aprovado = verificarAprovacao(media);

        exibirResultado(nomeAluno, media, aprovado);
    }

    // Calcula a média aritmética entre duas notas
    private static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    // Verifica se a média atinge o mínimo necessário para aprovação
    private static boolean verificarAprovacao(double media) {
        return media >= MEDIA_MINIMA_APROVACAO;
    }

    // Exibe os dados do aluno e sua situação final
    private static void exibirResultado(String nomeAluno, double media, boolean aprovado) {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Média: " + media);
        System.out.println(aprovado ? "Aprovado" : "Reprovado");
    }
}