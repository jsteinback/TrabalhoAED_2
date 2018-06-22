package arvore_binaria;

public class NoArvoreBinaria<T> {

	private T info;
	private NoArvoreBinaria esquerda;
	private NoArvoreBinaria direita;

	public NoArvoreBinaria(T info) {
		this.info = info;
	}

	public NoArvoreBinaria(T info, NoArvoreBinaria<T> esquerda, NoArvoreBinaria<T> direita) {
		this.info = info;
		this.esquerda = esquerda;
		this.direita = direita;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public T getInfo() {
		return info;
	}

	public NoArvoreBinaria<T> getEsquerda() {
		return esquerda;
	}

	public NoArvoreBinaria<T> getDireita() {
		return direita;
	}

}
