package br.com.fiapride.main;

import br.com.fiapride.model.Televisao;

public class SistemaPrincipalTelevisao {

	public static void main(String[] args) {
		// INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
		Televisao televisao1 = new Televisao (32, "Tubo", "4K", 39, 70);
		
		// Criando o segundo passageiro (Objeto 2)		
		Televisao televisao2 = new Televisao(46, "Plana", "Full HD", 71, 30);
		
		// Exibindo os dados no Console
		System.out.println("---Televisões disponíveis---");
		System.out.println("Televisão 1 "+ televisao1.modelo +"|"+ televisao1.polegadas +" polegadas|" + televisao1.tipoImagem +"Canal: "+televisao1.canalAtual +"| Volume Atual: "+televisao1.volumeAtual);
		System.out.println("Televisão 2 "+ televisao2.modelo +"|" + televisao2.polegadas +" polegadas|" + televisao2.tipoImagem +"Canal: "+televisao2.canalAtual +"| Volume Atual: "+televisao2.volumeAtual);
		// Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
		
		televisao2.mudarCanal(televisao2.canalAtual, 10);
		televisao1.mudarVolume(televisao1.volumeAtual);
		
		System.out.println("---Televisões pós método---");
		System.out.println("Televisão 1 "+ televisao1.modelo +"|"+ televisao1.polegadas +" polegadas|" + televisao1.tipoImagem +" Canal: "+televisao1.canalAtual +"| Volume Atual: "+televisao1.volumeAtual);
		System.out.println("Televisão 2 "+ televisao2.modelo +"|" + televisao2.polegadas +" polegadas|" + televisao2.tipoImagem +" Canal: "+televisao2.canalAtual +"| Volume Atual: "+televisao2.volumeAtual);
	}

}
