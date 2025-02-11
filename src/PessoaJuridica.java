public class PessoaJuridica extends Cliente{
    private String cnpj;

    public PessoaJuridica(String nome, String email, String cnpj){
        super(nome, email);
        this.cnpj = cnpj;
    }

    public void exibirInfo(PessoaJuridica pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("CNPJ: " + pessoa.cnpj);
    }
}
