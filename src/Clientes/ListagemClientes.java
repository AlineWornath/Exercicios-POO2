package Clientes;

import java.util.ArrayList;

public class ListagemClientes {

    public static void listarClientes(ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            cliente.exibirInfo();
            System.out.println();
        }
    }
}
