public enum OutrosEstados {
    TEXAS ("TX", "TEXAS"),
    CALIFORNIA ("CF", "CALIFÓRNIA "),
    FLORIDA ("FL", "FLÓRIDA"),
    ;

    private final String nome;
    private final String sigla;

    OutrosEstados(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
