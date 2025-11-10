package model;

import java.util.ArrayList;
import java.util.List;

public class Minicurso extends Evento {
    private List<String> materiais = new ArrayList<>();

    public Minicurso(String titulo, String data, int duracaoHoras, double orcamento,
                     Local local, PessoaResponsavel responsavel) {
        super(titulo, data, duracaoHoras, orcamento, local, responsavel);
    }

    public void adicionarMaterial(String material) {
        materiais.add(material);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Minicurso: " + getTitulo() + " - Materiais: " + materiais);
    }
}
