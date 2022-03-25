package threads.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class PrincipalLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<String> lista = Collections.synchronizedList(new ArrayList<>());
		//List<String> lista = new Vector<>();
		Lista lista = new Lista();
		
		for (int i=0;i<100;i++) {
			new Thread(new TarefaAdcionarElemento(lista,i)).start();
		}
		new Thread(new TarefaImprimirLista(lista)).start();

	}

}
