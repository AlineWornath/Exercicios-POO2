import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++){

            System.out.println("Digite o nome do cliente: ");
            String nome = sc.nextLine();

            System.out.println("Digite o e-mail do cliente: ");
            String email = sc.nextLine();

            System.out.println("Digite 1 para pessoa física; 2 para pessoa jurídica:");
            int resposta = sc.nextInt();
            if(resposta == 1){
                System.out.println("Digite o CPF do cliente: ");
                String cpf = sc.nextLine();
                PessoaFisica pessoaFisica = new PessoaFisica(nome, email, cpf);
            }
            else {
                System.out.println("Digite o CNPJ do cliente: ");
                String cnpj = sc.nextLine();
                PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, email, cnpj);
            }

            clientes.add();



        }
    }
}