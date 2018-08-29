package revisao;

public class Candidato {
	
	private String nome;
	private int numeroVotos;
	
	//Construtor
	public Candidato(String nome){
		numeroVotos = 0;
		this.nome = nome;
	}
	
	//Método de Incremento
	public void incrementaVoto(){
		numeroVotos++;
	}
	
	//Métodos de acesso
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroVotos() {
		return numeroVotos;
	}
	public void setNumeroVotos(int numeroVotos) {
		this.numeroVotos = numeroVotos;
	}

}