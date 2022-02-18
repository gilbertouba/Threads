package threads.aplicacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class TarefaBuscaTextual implements Runnable {
	private String arquivo;
	private String nome;
	
	
	public TarefaBuscaTextual(String arquivo, String nome) {
		super();
		this.arquivo = arquivo;
		this.nome = nome;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub		
		try {
			Scanner sc = new Scanner(new File(arquivo));
			int numeroLinha=1;
			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				if (linha.toLowerCase().contains(nome)) {
					System.out.println(arquivo+" - linha - "+numeroLinha+" - valor encontrado - "+linha);
				}
				numeroLinha++;
			}
		}
		catch (FileNotFoundException e){
			throw new RuntimeException(e);
		}
	}

}
