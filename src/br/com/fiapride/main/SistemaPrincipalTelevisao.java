package br.com.fiapride.main;

import br.com.fiapride.model.Controle;
import br.com.fiapride.model.Televisao;
import br.com.fiapride.model.VideoGame;

public class SistemaPrincipalTelevisao {
	public static void main(String[] args) {
		// INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
		Controle controle1 = new Controle(22, "Samsung");

		Televisao televisao1 = new Televisao ("Lg",2010, 1.500, 32, "Tubo", "4K", controle1);
		
		Controle controle2 = new Controle(34, "Positivo");
		// Criando o segundo passageiro (Objeto 2)
		VideoGame playstation = new VideoGame("Sony", 2200, 2021, true);
		
		// Exibindo os dados no Console
		System.out.println("---Televisões disponíveis---");
		System.out.println("Televisão 1 "+ televisao1.getModelo() +"|"+ televisao1.getPolegadas() +" polegadas|" + televisao1.getTipoImagem() + "| R$"+ televisao1.getPreco() + "|"+ televisao1.getMarca() + "|" + televisao1.getAnoDeLancamento());
		System.out.println("Playstation 5 "+ playstation.getMarca() +"|R$ " + playstation.getPreco() +"| " + playstation.getAnoDeLancamento() +" É digital?: "+playstation.getisDisclVersion());
		// Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?

		System.out.println("---Controles usados---");
		System.out.printf("Controle 1 - quantidade de botoes: %d - tipo do controle: %s\n", televisao1.getControle().getQuantidadeBotoes(), televisao1.getControle().getTipo());

		televisao1.mudarVolume(10);
		
		System.out.println("---Televisões pós método---");
		System.out.println("Televisão 1 "+ televisao1.getModelo() +"|"+ televisao1.getPolegadas() +" polegadas|" + televisao1.getTipoImagem() +"Canal: "+televisao1.getCanalAtual() +"| Volume Atual: "+televisao1.getVolumeAtual());
		System.out.println("Playstation 5 "+ playstation.getMarca() +"|R$ " + playstation.getPreco() +"| " + playstation.getAnoDeLancamento() +" É digital?: "+playstation.getisDisclVersion());

	}
}
