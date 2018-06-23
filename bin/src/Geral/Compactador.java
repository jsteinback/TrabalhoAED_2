package Geral;

import Arvore_Binaria.ArvoreBinaria;
import Arvore_Binaria.NoArvoreBinaria;

public class Compactador {

	// teste
	protected String teste = "bom esse bom-bom";

	private ArvoreBinaria<Letra>[] vetorArvores;
	private int indiceVetorArvores = 0;

	public void executar(String pathOrigem, String pathDestino) {

		String[] vetorStringLetras = teste.split("");
		Letra[] vetorLetras = preparaVetorLetras(vetorStringLetras);
		preparaVetorArvores(vetorLetras);

	}

	private Letra[] preparaVetorLetras(String[] vetorStringLetras) {
		Letra[] vetorLetras = new Letra[vetorStringLetras.length];
		boolean repetido = false;

		for (String strLetra : vetorStringLetras) {
			for (Letra objLetra : vetorLetras) {
				if (objLetra.getLetra().equals(strLetra)) {
					repetido = true;
				}
			}

			if (!repetido) {
				vetorLetras[indiceVetorArvores] = new Letra(strLetra, buscarPeso(strLetra, vetorStringLetras));
			}
		}

		return vetorLetras;
	}

	private void preparaVetorArvores(Letra[] vetorLetras) {
		vetorArvores = new ArvoreBinaria[vetorLetras.length];

		for (Letra letra : vetorLetras) {
			ArvoreBinaria<Letra> novaArvore = new ArvoreBinaria<>();
			novaArvore.setRaiz(new NoArvoreBinaria<Letra>(letra));
			vetorArvores[indiceVetorArvores] = novaArvore;
			indiceVetorArvores++;
		}
	}

	private int buscarPeso(String strLetra, String[] vetorStringLetras) {
		int cont = 0;

		for (String str : vetorStringLetras) {
			if (strLetra.equals(str)) {
				cont++;
			}
		}

		return cont;
	}
}
