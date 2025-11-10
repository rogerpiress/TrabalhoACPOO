package model;

public class Palestra extends Evento {
    private String palestrante;

    public Palestra(String titulo, String data, int duracaoHoras, double orcamento,
                    Local local, PessoaResponsavel responsavel, String palestrante) {
        super(titulo, data, duracaoHoras, orcamento, local, responsavel);
        this.palestrante = palestrante;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Palestra: " + getTitulo() + " - Palestrante: " + palestrante);
    }
}
