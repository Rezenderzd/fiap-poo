package br.com.fiapride.main;

import br.com.fiapride.model.Televisao;

public class SistemaPrincipalTelevisao {

	public static void main(String[] args) {
		Televisao televisao1 = new Televisao();
		televisao1.modelo = "Tubo";
		televisao1.polegadas = 32;
		televisao1.tipoImagem = "4K";

				
		Televisao televisao2 = new Televisao();
		televisao2.modelo="Plana";
		televisao2.polegadas = 46;
		televisao2.tipoImagem = "Full HD";
		
		System.out.println("---Televisões disponíveis---");
		System.out.println("Televisão 1 "+ televisao1.modelo +"|"+ televisao1.polegadas +" polegadas|" + televisao1.tipoImagem);
		System.out.println("Televisão 2 "+ televisao2.modelo +"|" + televisao2.polegadas +" polegadas|" + televisao2.tipoImagem);
	}

}
