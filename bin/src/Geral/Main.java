package Geral;

import Arvore_Binaria.ArvoreBinaria;

public class Main {

	private Compactador compactador;
	private Descompactador descompactador;
	private ArvoreBinaria<Letra> tabelaDeCodificacoes;

	public void Processar(String pathOrigem, String pathDestino, EnumAcao acao) {
		if (acao == EnumAcao.COMPACTAR) {
			tabelaDeCodificacoes = compactador.executar(pathOrigem, pathDestino);
		} else if (acao == EnumAcao.DESCOMPACTAR) {
			descompactador.executar(pathOrigem, pathDestino, tabelaDeCodificacoes);
		}
	}

}
