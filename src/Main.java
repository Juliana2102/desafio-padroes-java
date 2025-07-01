public class Main {
    public static void main(String[] args) {
        FacadePagamento facadePagamento = new FacadePagamento();
        facadePagamento.pagarComCartaoCredito(100.0);

        facadePagamento.pagarComPayPal(200.0);

        facadePagamento.pagarComBitcoin(300.0);
    }
}
