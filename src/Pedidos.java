import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pedidos<K, V> {
    private K key;
    private V valor;

    List<V> itens = new ArrayList<>();

    Map<K, V> map = new HashMap<>();

}
