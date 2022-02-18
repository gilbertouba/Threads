package threads.aplicacao;

import java.util.ArrayList;
import java.util.List;

public class TarefaAdcionarElemento implements Runnable {
	
	private List lista = new ArrayList<>();
	private int   numeroThread;
	
	

	public TarefaAdcionarElemento(List lista, int numeroThread) {
		super();
		this.numeroThread = numeroThread;
		this.lista= lista;
	}



	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			lista.add("Elemento "+i+" Num. Thread "+this.numeroThread);
		}
		// TODO Auto-generated method stub

	}

}
