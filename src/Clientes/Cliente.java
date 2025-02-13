package Clientes;

public abstract class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
}
