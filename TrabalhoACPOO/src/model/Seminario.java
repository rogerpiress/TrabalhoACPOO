package model;

public class Seminario extends Evento {
    private String tema;

    public Seminario(String titulo, String data, int duracaoHoras, double orcamento,
                     Local local, PessoaResponsavel responsavel, String tema) {
        super(titulo, data, duracaoHoras, orcamento, local, responsavel);
        this.tema = tema;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Seminário: " + getTitulo() + " - Tema: " + tema);
    }
}