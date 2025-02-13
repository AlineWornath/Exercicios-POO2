import Clientes.CadastroCliente;
import Clientes.Cliente;
import Clientes.ListagemClientes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CadastroCliente cadastroCliente = new CadastroCliente();
        cadastroCliente.cadastrarCliente();

        ArrayList<Cliente> clientes = cadastroCliente.getClientes();

        ListagemClientes.listarClientes(clientes);
    }
}