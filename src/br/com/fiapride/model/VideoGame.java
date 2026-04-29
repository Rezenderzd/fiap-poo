package br.com.fiapride.model;

public class VideoGame extends Eletrodomestico{
    private boolean isDisclVersion;

    public VideoGame ( String marca, double preco, int anoDeLancamento, double consumoEmWattsHora,boolean isDisclVersion){
        super(marca, anoDeLancamento, preco, consumoEmWattsHora);
        this.isDisclVersion = isDisclVersion;
    }

    public boolean getIsDiscVersion() {
        return isDisclVersion;
    }

    @Override
    public void calcularConsumo(int quantidadeDeHoras) {
        double consumo = (getConsumoEmWattsHora() * quantidadeDeHoras *1.2)/1000; //consumo é maior dependendo do local onde o usuário está (jogando ou só no menu)
        System.out.printf("Consumo foi de %.2f reais\n", consumo);
    }
}
