public class Main {
    public static void main(String[] args) {
        FacadePagamento facadePagamento = new FacadePagamento();

        // Pagar usando Cartão de Crédito
        facadePagamento.pagarComCartaoCredito(100.0);

        // Pagar usando PayPal
        facadePagamento.pagarComPayPal(200.0);

        // Pagar usando Bitcoin
        facadePagamento.pagarComBitcoin(300.0);
    }
}
