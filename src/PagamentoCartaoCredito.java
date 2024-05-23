
public class PagamentoCartaoCredito implements EstrategiaPagamento {
    @Override
    public void pagar(double quantia) {
        System.out.println("Pago " + quantia + " usando Cartão de Crédito.");
    }
}
