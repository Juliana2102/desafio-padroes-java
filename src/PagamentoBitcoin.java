
public class PagamentoBitcoin implements EstrategiaPagamento {
    @Override
    public void pagar(double quantia) {
        System.out.println("Pago " + quantia + " usando Bitcoin.");
    }
}
