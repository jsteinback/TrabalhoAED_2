package Geral;

import Arvore_Binaria.ArvoreBinaria;
import Arvore_Binaria.NoArvoreBinaria;

public class Descompactador {

	public String executar(String pathOrigem, ArvoreBinaria<Letra> tabelaDeCodificacoes) {
		// TODO Ler arquivo pelo Path informado
		String teste = "111000111010010110110011011100011110001";
		String[] vetorStringLida = teste.split("");
		String valorFinal = "";

		NoArvoreBinaria<Letra> p = tabelaDeCodificacoes.getRaiz();

		for (String binario : vetorStringLida) {
			if (binario.equals("0")) {
				if (p.getDireita() == null) {
					valorFinal += p.getInfo().getLetra();
					p = tabelaDeCodificacoes.getRaiz();
				}
				p = p.getEsquerda();
			} else {
				if (p.getDireita() == null) {
					valorFinal += p.getInfo().getLetra();
					p = tabelaDeCodificacoes.getRaiz();
				} else {
					p = p.getDireita();
				}
			}
		}

		return valorFinal;
	}
}
