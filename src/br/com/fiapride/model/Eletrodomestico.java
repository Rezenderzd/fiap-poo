package br.com.fiapride.model;

public class Eletrodomestico {
    private String marca;
    private int anoDeLancamento;
    private double preco;

    public Eletrodomestico (String marca, int anoDeLancamento, double preco){
        this.setPreco(preco);
        this.setMarca(marca);
        this.setAnoDeLancamento(anoDeLancamento);
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
}
