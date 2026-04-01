package br.com.fiapride.main;

import br.com.fiapride.model.Controle;
import br.com.fiapride.model.Televisao;

public class SistemaPrincipalTelevisao {
	public static void main(String[] args) {
		// INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
		Controle controle1 = new Controle(22, "Samsung");

		Televisao televisao1 = new Televisao (32, "Tubo", "4K", controle1);
		
		Controle controle2 = new Controle(34, "Positivo");
		// Criando o segundo passageiro (Objeto 2)
		Televisao televisao2 = new Televisao(46, "Plana", "Full HD", controle2);
		
		// Exibindo os dados no Console
		System.out.println("---Televisões disponíveis---");
		System.out.println("Televisão 1 "+ televisao1.getModelo() +"|"+ televisao1.getPolegadas() +" polegadas|" + televisao1.getTipoImagem() +"Canal: "+televisao1.getCanalAtual() +"| Volume Atual: "+televisao1.getVolumeAtual());
		System.out.println("Televisão 2 "+ televisao2.getModelo() +"|" + televisao2.getPolegadas() +" polegadas|" + televisao2.getTipoImagem() +"Canal: "+televisao2.getCanalAtual() +"| Volume Atual: "+televisao2.getVolumeAtual());
		// Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?

		System.out.println("---Controles usados---");
		System.out.printf("Controle 1 - quantidade de botoes: %d - tipo do controle: %s\n", televisao1.getControle().getQuantidadeBotoes(), televisao1.getControle().getTipo());
		System.out.printf("Controle 2 - quantidade de botoes: %d - tipo do controle: %s\n", televisao2.getControle().getQuantidadeBotoes(), televisao2.getControle().getTipo());
		
		televisao2.mudarCanal(televisao2.getCanalAtual(), 40);
		televisao1.mudarVolume(10);
		
		System.out.println("---Televisões pós método---");
		System.out.println("Televisão 1 "+ televisao1.getModelo() +"|"+ televisao1.getPolegadas() +" polegadas|" + televisao1.getTipoImagem() +"Canal: "+televisao1.getCanalAtual() +"| Volume Atual: "+televisao1.getVolumeAtual());
		System.out.println("Televisão 2 "+ televisao2.getModelo() +"|" + televisao2.getPolegadas() +" polegadas|" + televisao2.getTipoImagem() +"Canal: "+televisao2.getCanalAtual() +"| Volume Atual: "+televisao2.getVolumeAtual());


	}
}
