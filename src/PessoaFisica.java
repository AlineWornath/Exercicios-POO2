public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String email, String cpf){
        super(nome, email);
        this.cpf = cpf;
    }

    public void setCpf(Cliente cliente){
        this.cpf = cpf;
    }

    public void exibirInfo(PessoaFisica pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("CPF: " + pessoa.cpf);
    }
}
