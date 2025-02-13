import java.util.List;

public class Carrinho<T> {
    public List<T> carrinho;

    public Carrinho(List<T> carrinho) {
        this.carrinho = carrinho;
    }

    public void adicionar(T elemento) {
        carrinho.add(elemento);
    }

    public void remover(T elemento) {
        carrinho.remove(elemento);
    }

    public void quantidadeItens() {
        System.out.println("Quantidade de itens no carrinho: " + carrinho.size());
    }
}
