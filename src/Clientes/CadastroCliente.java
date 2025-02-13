package Clientes;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {

    ArrayList<Cliente> clientes = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    String continuar = "s";

    public void cadastrarCliente() {
        while(continuar.equalsIgnoreCase("s")) {

            System.out.println("Digite o nome do cliente: ");
            String nome = sc.nextLine();

            System.out.println("Digite o e-mail do cliente: ");
            String email = sc.nextLine();

            System.out.println("Digite 1 para pessoa física; 2 para pessoa jurídica:");
            int resposta = sc.nextInt();
            sc.nextLine();
            if (resposta == 1) {
                System.out.println("Digite o CPF do cliente: ");
                String cpf = sc.nextLine();
                PessoaFisica pessoaFisica = new PessoaFisica(nome, email, cpf);
                clientes.add(pessoaFisica);
            } else if (resposta == 2) {
                System.out.println("Digite o CNPJ do cliente: ");
                String cnpj = sc.nextLine();
                PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, email, cnpj);
                clientes.add(pessoaJuridica);
            } else {
                System.out.println("Resposta inválida, tente novamente.");
                continue;
            }
            System.out.println("Clientes.Cliente cadastrado com sucesso! Deseja continuar? (S/N)");
            continuar = sc.nextLine();
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
