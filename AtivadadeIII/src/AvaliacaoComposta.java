class AvaliacaoComposta extends Avaliacao {
    private double[] notas;

    public AvaliacaoComposta(double[] notas, int peso) {
        super(calcularMedia(notas), peso);
        this.notas = notas;
    }

 
    private static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
