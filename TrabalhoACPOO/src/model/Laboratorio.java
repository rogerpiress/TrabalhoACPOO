package model;

public class Laboratorio extends Local {
    private int numComputadores;

    public Laboratorio(String nome, int capacidade, int numComputadores) {
        super(nome, capacidade);
        this.numComputadores = numComputadores;
    }
}