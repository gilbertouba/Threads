package threads.aplicacao;

public class BuscaTextual {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String nome = "da";
		
		Thread threadAssinatura1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt",nome));
		Thread threadAssinatura2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt",nome));
		Thread threadAssinatura3 = new Thread(new TarefaBuscaTextual("autores.txt",nome));
		
		threadAssinatura1.start();
		threadAssinatura2.start();
		threadAssinatura3.start();

	}

}
