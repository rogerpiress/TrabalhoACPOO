package model;

public class Auditorio extends Local {
    private boolean estruturaParaTransmissao;

    public Auditorio(String nome, int capacidade, boolean estruturaParaTransmissao) {
        super(nome, capacidade);
        this.estruturaParaTransmissao = estruturaParaTransmissao;
    }
}
