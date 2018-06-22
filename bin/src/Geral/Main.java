package Geral;

public class Main {

	private Compactador compactador;
	private Descompactador descompactador;

	public void Processar(String pathOrigem, String pathDestino, EnumAcao acao) {
		if (acao == EnumAcao.COMPACTAR) {
			compactador.executar(pathOrigem, pathDestino);
		} else if (acao == EnumAcao.DESCOMPACTAR) {
			descompactador.executar(pathOrigem, pathDestino);
		}
	}

}
