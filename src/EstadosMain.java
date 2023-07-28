public class EstadosMain {
    public static void main (String[] args){
    for(EstadosBrasileiros e: EstadosBrasileiros.values()) {
        System.out.println(e.getNome()+ " - " + e.getSigla());
    }
    for(OutrosEstados a: OutrosEstados.values()) {
        System.out.println(a.getNome() + " - " + a.getSigla());
    }
    for(Bancos b: Bancos.values()){
        System.out.println(b.getSiglabanco() + " - " + b.getNomebanco() + " - " + b.getAgencia());
    }

    }
}
