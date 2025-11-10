package model;

public class Instrutor extends PessoaResponsavel {
    private String formacao;

    public Instrutor(String nome, String email, String formacao) {
        super(nome, email);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }
}
