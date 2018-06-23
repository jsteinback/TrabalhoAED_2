package Arvore_Binaria;

public class ArvoreBinaria<T> {

	private NoArvoreBinaria<T> raiz;

	public ArvoreBinaria() {
		raiz = null;
	}

	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}
	
	public void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}

	public boolean estaVazia() {
		return raiz == null;
	}

	public boolean pertence(T info) {
		return pertence(info, raiz);
	}

	private boolean pertence(T info, NoArvoreBinaria<T> no) {
		if (no == null) {
			return false;
		} else {
			if (no.getInfo().equals(info)) {
				return true;
			} else if (pertence(info, no.getEsquerda())) {
				return true;
			} else {
				return pertence(info, no.getDireita());
			}
		}
	}

	@Override
	public String toString() {
		return arvorePre(raiz);
	}

	private String arvorePre(NoArvoreBinaria<T> no) {
		if (no == null) {
			return "<>";
		} else {
			return "<" + no.getInfo() + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita()) + ">";
		}
	}

}
