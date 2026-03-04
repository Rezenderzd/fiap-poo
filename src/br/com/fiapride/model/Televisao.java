package br.com.fiapride.model;

//A Classe define a estrutura. Ela não é o passageiro real, é apenas o modelo
public class Televisao {
	// Atributos (Características)
	public int polegadas;
	public String modelo;
	public String tipoImagem;
	public int canalAtual;
	public int volumeAtual;
	
	public
	Televisao(int polegadas, String modelo, String tipoImagem, int canalAtual, int volumeAtual) {
        this.polegadas = polegadas;
        this.modelo = modelo; // Novo Atributo
        this.tipoImagem = tipoImagem;
        this.canalAtual = canalAtual;
        this.volumeAtual = volumeAtual;
    }
	
	public void mudarVolume(int volumeAtual ) {
		if(volumeAtual>50) {
			this.volumeAtual = volumeAtual/2;
			System.out.println("Volume atual é: "+ volumeAtual);
			return;
		}
	}
	public void mudarCanal(int quantidadeMudarCanal, int canalAtual) {
		this.canalAtual = canalAtual + quantidadeMudarCanal;
		System.out.println("O canal atual é:"+ canalAtual);
		return;
	}
    // Nota: Por enquanto usamos 'public' para facilitar o aprendizado.
    // Nas próximas aulas, aprenderemos a proteger esses dados.
}