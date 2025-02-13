public class PagamentoCartao implements Pagamento<Double>{

    public void processarPagamento(Double valor){
        System.out.println("Processando pagamento com cartão no valor de: " + valor);
    }
}
