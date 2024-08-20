class Avaliacao {
    private double nota;
    private int peso;

    public Avaliacao(double nota, int peso) {
        this.nota = nota;
        this.peso = peso;
    }

    public double getNota() {
        return nota;
    }

    public int getPeso() {
        return peso;
    }

    public double calcularPontos() {
        return nota * peso;
    }
}
