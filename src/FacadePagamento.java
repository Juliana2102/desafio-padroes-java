
public class FacadePagamento {
    private ProcessadorPagamento processador;

    public FacadePagamento() {
        this.processador = ProcessadorPagamento.getInstancia();
    }

    public void pagarComCartaoCredito(double quantia) {
        processador.processarPagamento(new PagamentoCartaoCredito(), quantia);
    }

    public void pagarComPayPal(double quantia) {
        processador.processarPagamento(new PagamentoPayPal(), quantia);
    }

    public void pagarComBitcoin(double quantia) {
        processador.processarPagamento(new PagamentoBitcoin(), quantia);
    }
}
