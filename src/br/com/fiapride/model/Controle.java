package br.com.fiapride.model;

public class Controle {
    private int quantidadeBotoes;
    private String tipo;
    private int frequencia;

    public Controle (int quantidadeBotoes, String tipo){
        this.quantidadeBotoes = quantidadeBotoes;
        this.tipo = tipo;
        this.setFrequencia();
    }

    public int getQuantidadeBotoes() {
        return quantidadeBotoes;
    }

    public String getTipo() {
        return tipo;
    }

    public int getFrequencia() {
        return frequencia;
    }

    private void setFrequencia(){
        this.frequencia = 0;
    }
}
