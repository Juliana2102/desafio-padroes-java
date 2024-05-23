public class ProcessadorPagamento {
    private static ProcessadorPagamento instancia;

    private ProcessadorPagamento() {
        // Construtor privado para evitar instanciamento
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
