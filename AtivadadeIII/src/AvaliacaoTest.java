public class AvaliacaoTest {
    public static void main(String[] args) {
        
        Avaliacao prova1 = new Avaliacao(7.5, 2);
        Avaliacao prova2 = new Avaliacao(8.0, 2);

        double[] notasTrabalho = {8.0, 7.0, 9.0}; 
        AvaliacaoComposta trabalho = new AvaliacaoComposta(notasTrabalho, 1);

        double[] notasInterdisciplinar = {6.5, 7.0, 6.0, 8.0}; 
        AvaliacaoComposta interdisciplinar = new AvaliacaoComposta(notasInterdisciplinar, 2);

        Avaliacao[] avaliacoes = {prova1, prova2, trabalho, interdisciplinar};
        Semestre semestre = new Semestre(avaliacoes);

        if (semestre.validarPesos()) {
            System.out.println("Pesos válidos.");
            System.out.println("Média: " + semestre.calcularMedia());
            System.out.println("Resultado: " + semestre.obterResultado());
        } else {
            System.out.println("Erro: A soma dos pesos das avaliações deve ser igual a 7.");
        }
    }
}
