package model;

public class Sala extends Local {
    private boolean temEquipamentoMultimidia;

    public Sala(String nome, int capacidade, boolean temEquipamentoMultimidia) {
        super(nome, capacidade);
        this.temEquipamentoMultimidia = temEquipamentoMultimidia;
    }
}
