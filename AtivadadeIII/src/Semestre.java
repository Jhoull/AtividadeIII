class Semestre {
    private Avaliacao[] avaliacoes;

    public Semestre(Avaliacao[] avaliacoes) {
        if (avaliacoes.length != 4) {
            throw new IllegalArgumentException("Um semestre deve conter exatamente 4 avaliações.");
        }
        this.avaliacoes = avaliacoes;
    }

    public boolean validarPesos() {
        int somaPesos = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            somaPesos += avaliacao.getPeso();
        }
        return somaPesos == 7;
    }

    public double calcularMedia() {
        double somaPontos = 0;
        int somaPesos = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            somaPontos += avaliacao.calcularPontos();
            somaPesos += avaliacao.getPeso();
        }
        return somaPontos / somaPesos;
    }

    public String obterResultado() {
        return calcularMedia() >= 6.0 ? "APROVADO" : "REPROVADO";
    }
}
