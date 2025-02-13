public class PagamentoPix implements Pagamento<Double> {

    public void processarPagamento(Double valor){
        System.out.println("Processando pagamento com PIX no valor de: " + valor);
    }
}
