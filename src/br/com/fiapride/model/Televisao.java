package br.com.fiapride.model;

//A Classe define a estrutura. Ela não é o passageiro real, é apenas o modelo
public class Televisao {
	// Atributos (Características)
	private int polegadas;
	private String modelo;
	private String tipoImagem;
	private int canalAtual = 10;
	private int volumeAtual = 20;
	private Controle intermediador;
	
	public Televisao(int polegadas, String modelo, String tipoImagem, Controle controleUtlizado) {
        this.setPolegadas(polegadas);
        this.setModelo(modelo);
        this.setTipoImagem(tipoImagem);
		this.intermediador = controleUtlizado;
        //this.setCanalAtual(canalAtual);
        //this.setVolumeAtual(volumeAtual);
    }
	
	public void mudarVolume(int volumeAtual ) {
		if(volumeAtual<0){
			this.setVolumeAtual(0);
		}
		if(volumeAtual>50) {
			volumeAtual = volumeAtual/2;
			//System.out.println("Volume atual é: "+ volumeAtual);
		}
		this.setVolumeAtual(volumeAtual);
	}
	public void mudarCanal(int quantidadeMudarCanal, int canalAtual) {
		canalAtual = canalAtual + quantidadeMudarCanal;
		if(canalAtual<=0){
			this.setCanalAtual(0);
			return;
		}
		this.setCanalAtual(canalAtual);
		//System.out.println("O canal atual é:"+ canalAtual);
	}

	public Controle getControle(){
		return this.intermediador;
	}

	public int getPolegadas() {
		return polegadas;
	}

	private void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}

	public String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoImagem() {
		return tipoImagem;
	}

	private void setTipoImagem(String tipoImagem) {
		this.tipoImagem = tipoImagem;
	}

	public int getCanalAtual() {
		return canalAtual;
	}

	private void setCanalAtual(int canalAtual) {
		this.canalAtual = canalAtual;
	}

	public int getVolumeAtual() {
		return volumeAtual;
	}

	private void setVolumeAtual(int volumeAtual) {
		if(volumeAtual>100) {
			this.volumeAtual = 100;
			return;
		}else if(volumeAtual<0) {
			this.volumeAtual = 0;
			return;
		}
		this.volumeAtual = volumeAtual;
	}
}