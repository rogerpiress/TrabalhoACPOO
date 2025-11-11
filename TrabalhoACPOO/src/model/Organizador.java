package model;

public class Organizador extends PessoaResponsavel {
    private String funcao;

    public Organizador(String nome, String email, String funcao) {
        super(nome, email);
        this.funcao = funcao;
    }
}
