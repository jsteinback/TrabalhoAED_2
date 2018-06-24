package Geral;

import Arvore_Binaria.ArvoreBinaria;

/**
 * @author Nathan Guilherme Reiter, Alexandre da Silva, Jessica Steinback
 */
public class Main {

	private Compactador compactador;
	private Descompactador descompactador;
	private ArvoreBinaria<Letra> tabelaDeCodificacoes;
	private String textoDescompactado;

	public void Processar(String pathOrigem, String pathDestino, EnumAcao acao) {
		if (acao == EnumAcao.COMPACTAR) {
			tabelaDeCodificacoes = compactador.executar(pathOrigem, pathDestino);
		} else if (acao == EnumAcao.DESCOMPACTAR) {
			textoDescompactado = descompactador.executar(pathOrigem, tabelaDeCodificacoes);
			System.out.println(textoDescompactado);
		}
	}

}
