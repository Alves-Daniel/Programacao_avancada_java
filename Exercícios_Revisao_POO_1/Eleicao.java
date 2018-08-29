package revisao;

import javax.swing.JOptionPane;

public class Eleicao {

	public static void main(String[] args) {

		// Objetos para candidato
		Candidato c1 = new Candidato("Amazonino");
		Candidato c2 = new Candidato("David");
		Candidato c3 = new Candidato("Omar");

		// Criação do menu
		int opcao ;
		
		do {
			opcao= Integer
				.parseInt(JOptionPane
						.showInputDialog("Digite o numero do candidato que deseja votar:  \n1-Amazonino\n2-David\n3-Omar\n4-Finalizar votação"));

			if (opcao == 1) {

				c1.incrementaVoto();
				

			}
			if (opcao == 2) {

				c2.incrementaVoto();
					
			}
			
			if (opcao == 3) {

				c3.incrementaVoto();
				
			}

			
			
		}while(opcao <= 3);
		
		System.out.println("Canditado = "+ c1.getNome()+ " Quantidade de Votos = "+(c1.getNumeroVotos()));
		System.out.println("Canditado = "+ c2.getNome()+ " Quantidade de Votos = "+(c2.getNumeroVotos()));
		System.out.println("Canditado = "+ c3.getNome()+ " Quantidade de Votos = "+(c3.getNumeroVotos()));

	}
	
	
	
	
}