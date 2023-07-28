public enum Bancos {
    ITAU ("IT", "ITAÚ",00012),
    SANTANDER ("STR", "SANTANDER", 000123),
    SICOOB ("SCB", "SICOOB", 00045),
    BRADESCO ("BDO", "BRADESC0", 66987);

    private final String siglabanco;
    private final String nomebanco;
    private final int agencia;

    Bancos(String siglabanco, String nomebanco, int agencia) {
        this.nomebanco = nomebanco;
        this.siglabanco = siglabanco;
        this.agencia = agencia;
    }

    public String getNomebanco() {
        return nomebanco;
    }

    public String getSiglabanco() {
        return siglabanco;
    }

    public long getAgencia() {
        return agencia;
    }
}
