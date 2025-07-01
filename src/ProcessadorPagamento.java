public class ProcessadorPagamento {
    private static ProcessadorPagamento instancia;

    private ProcessadorPagamento() {
      
    }

    public static ProcessadorPagamento getInstancia() {
        if (instancia == null) {
            instancia = new ProcessadorPagamento();
        }
        return instancia;
    }

    public void processarPagamento(EstrategiaPagamento estrategia, double quantia) {
        estrategia.pagar(quantia);
    }
}
