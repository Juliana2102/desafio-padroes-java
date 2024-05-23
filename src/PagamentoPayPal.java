
public class PagamentoPayPal implements EstrategiaPagamento {
    @Override
    public void pagar(double quantia) {
        System.out.println("Pago " + quantia + " usando PayPal.");
    }
}
