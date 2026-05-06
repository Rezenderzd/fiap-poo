package br.com.fiapride.model;

public abstract class Eletrodomestico {
    private String marca;
    private int anoDeLancamento;
    private double preco;
    private double consumoEmWattsHora;

    public Eletrodomestico (String marca, int anoDeLancamento, double preco, double consumoEmWattsHora){
        this.setPreco(preco);
        this.setMarca(marca);
        this.setAnoDeLancamento(anoDeLancamento);
        this.consumoEmWattsHora = consumoEmWattsHora;
    }

    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    private void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }

    public double getConsumoEmWattsHora() {
        return consumoEmWattsHora;
    }

    public abstract void calcularConsumo (int quantidadeDeHoras);
}
