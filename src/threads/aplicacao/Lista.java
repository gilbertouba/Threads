package threads.aplicacao;

public class Lista {
	
	private String [] elementos = new String[1000];
	private int indice = 0;

	public synchronized void adicionaElemento(String elemento) {
		this.elementos[indice] = elemento;
		this.indice++;			
	}
	
	public void adicionaElemento(String elemento,int pos) {
		this.elementos[pos] = elemento;
	}
	
	public int tamanho() {
		return this.elementos.length;
	}
	
	public String pegaElemento(int pos) {
		return this.elementos[pos];
	}
	
	
	
}

