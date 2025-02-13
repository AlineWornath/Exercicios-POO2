package Clientes;

public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String email, String cpf){
        super(nome, email);
        this.cpf = cpf;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("CPF: " + cpf);
    }
}
