package br.com.fiapride.model;

public class VideoGame extends Eletrodomestico{
    private boolean isDisclVersion;

    public VideoGame ( String marca, double preco, int anoDeLancamento,boolean isDisclVersion){
        super(marca, anoDeLancamento, preco);
        this.isDisclVersion = isDisclVersion;
    }

    public boolean getisDisclVersion() {
        return isDisclVersion;
    }
}
