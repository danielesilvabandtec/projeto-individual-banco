package br.com.bandtec.projetoindividualbanco;

public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private boolean status;


    public Cliente(String nome, String cpf,String endereco,boolean status){
        this.nome=nome;
        this.cpf=cpf;
        this.endereco =endereco;
        this.status= status;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean isStatus() {
        return status;
    }
}

