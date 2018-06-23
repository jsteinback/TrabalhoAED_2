package Geral;

import Arvore_Binaria.ArvoreBinaria;
import Arvore_Binaria.NoArvoreBinaria;

public class Compactador {

	// teste
	protected String teste = "bom esse bom-bom";

	private ArvoreBinaria<Letra>[] vetorArvores;
	private int indiceVetorArvores = 0;

	public void executar(String pathOrigem, String pathDestino) {

		// 1 passo
		String[] vetorStringLetras = teste.split("");
		Letra[] vetorLetras = preparaVetorLetras(vetorStringLetras);
		preparaVetorArvores(vetorLetras);

		// 2 passo
		juntarArvores();
	}

	private void juntarArvores() {
		ArvoreBinaria<Letra> t1;
		ArvoreBinaria<Letra> t2;

		for (int i = 0; i < indiceVetorArvores; i++) {
			if (vetorArvores[i] != null) {
				t1 = vetorArvores[0];
				t2 = vetorArvores[i];

				ArvoreBinaria<ArvoreBinaria<Letra>> tr = new ArvoreBinaria<>();
				Letra letraRaiz = new Letra(null, t1.getRaiz().getInfo().getPeso() + t2.getRaiz().getInfo().getPeso());
				ArvoreBinaria<Letra> infoRaiz = new ArvoreBinaria<Letra>();
				infoRaiz.setRaiz(new NoArvoreBinaria<Letra>(letraRaiz));

				NoArvoreBinaria<ArvoreBinaria<Letra>> no = new NoArvoreBinaria<ArvoreBinaria<Letra>>(infoRaiz,
						new NoArvoreBinaria<ArvoreBinaria<Letra>>(t1), new NoArvoreBinaria<ArvoreBinaria<Letra>>(t2));
				tr.setRaiz(no);
				vetorArvores[0] = tr.getRaiz().getInfo();
				vetorArvores[i] = null;
			}
		}

	}

	private Letra[] preparaVetorLetras(String[] vetorStringLetras) {
		Letra[] vetorLetras = new Letra[vetorStringLetras.length];
		boolean repetido = false;

		for (int i = 0; i < vetorStringLetras.length; i++) {
			for (Letra objLetra : vetorLetras) {
				if (objLetra.getLetra().equals(vetorStringLetras[i])) {
					repetido = true;
				}
			}

			if (!repetido) {
				Letra novaLetra = new Letra(vetorStringLetras[i], buscarPeso(vetorStringLetras[i], vetorStringLetras));
				adicionarOrdenado(novaLetra, vetorLetras);
			}
		}

		return vetorLetras;
	}

	private void adicionarOrdenado(Letra novaLetra, Letra[] vetorLetras) {
		if (vetorLetras[0] == null) {
			vetorLetras[0] = novaLetra;
		} else {
			for (int j = 0; j < vetorLetras.length; j++) {
				if (vetorLetras[j] == null) {
					vetorLetras[j] = novaLetra;
					break;
				} else if (vetorLetras[j + 1] == null) {
					vetorLetras[j + 1] = novaLetra;
				} else if (vetorLetras[j].getPeso() > novaLetra.getPeso()) {
					Letra letraCoringa = vetorLetras[j];
					vetorLetras[j] = novaLetra;
					adicionarOrdenado(letraCoringa, vetorLetras);
				}
			}
		}
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
