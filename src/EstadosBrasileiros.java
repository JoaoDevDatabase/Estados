public enum EstadosBrasileiros {
    SAO_PAULO ("SP", "SÃO PAULO", 12 ),
    RIO_DE_JANEIRO ("RJ", "RIO DE JANEIRO", 13),
    PIAUI ("PI", "PIAUÍ", 14),
    MARANHAO ("MA", "MARANHÃO", 15);

    private final String nome;
    private final String sigla;
    private final int ibge;


    EstadosBrasileiros(String nome, String sigla, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getIbge() {
        return ibge;
    }
}

