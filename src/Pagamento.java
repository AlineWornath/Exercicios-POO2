public interface Pagamento<T extends Number>{

    void processarPagamento(T valor);
}
