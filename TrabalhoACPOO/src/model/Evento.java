package model;

public abstract class Evento {
    private String titulo;
    private String data;
    private int duracaoHoras;
    private double orcamento;
    private Local local;
    private PessoaResponsavel responsavel;

    public Evento(String titulo, String data, int duracaoHoras, double orcamento, Local local, PessoaResponsavel responsavel) {
        this.titulo = titulo;
        this.data = data;
        this.duracaoHoras = duracaoHoras;
        this.orcamento = orcamento;
        this.local = local;
        this.responsavel = responsavel;
    }

    public String getTitulo() { return titulo; }
    public String getData() { return data; }

    public abstract void exibirDetalhes();
}
