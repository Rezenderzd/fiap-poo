package br.com.fiapride.main;

import br.com.fiapride.model.Televisao;

public class SistemaPrincipalTelevisao {
	public static void main(String[] args) {
		// INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
		Televisao televisao1 = new Televisao (32, "Tubo", "4K", 39, 110);
		
		// Criando o segundo passageiro (Objeto 2)		
		Televisao televisao2 = new Televisao(46, "Plana", "Full HD", 71, -20);
		
		// Exibindo os dados no Console
		System.out.println("---Televisões disponíveis---");
		System.out.println("Televisão 1 "+ televisao1.getModelo() +"|"+ televisao1.getPolegadas() +" polegadas|" + televisao1.getTipoImagem() +"Canal: "+televisao1.getCanalAtual() +"| Volume Atual: "+televisao1.getVolumeAtual());
		System.out.println("Televisão 2 "+ televisao2.getModelo() +"|" + televisao2.getPolegadas() +" polegadas|" + televisao2.getTipoImagem() +"Canal: "+televisao2.getCanalAtual() +"| Volume Atual: "+televisao2.getVolumeAtual());
		// Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
		
		televisao2.mudarCanal(televisao2.getCanalAtual(), 10);
		televisao1.mudarVolume(televisao1.getVolumeAtual());
		
		System.out.println("---Televisões pós método---");
		System.out.println("Televisão 1 "+ televisao1.getModelo() +"|"+ televisao1.getPolegadas() +" polegadas|" + televisao1.getTipoImagem() +"Canal: "+televisao1.getCanalAtual() +"| Volume Atual: "+televisao1.getVolumeAtual());
		System.out.println("Televisão 2 "+ televisao2.getModelo() +"|" + televisao2.getPolegadas() +" polegadas|" + televisao2.getTipoImagem() +"Canal: "+televisao2.getCanalAtual() +"| Volume Atual: "+televisao2.getVolumeAtual());
	}

}
