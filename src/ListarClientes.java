import java.util.ArrayList;

public class ListarClientes {

    public void listarClientes(ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
