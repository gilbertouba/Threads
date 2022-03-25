package threads.aplicacao;

public class Banheiro {
	
	private boolean eSujo = true;
	
	
	void fazNumero1() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome +" Batendo na porta ");	
		synchronized (this) {
			while(eSujo) {
				esperaLaFora(nome);
			}

			System.out.println(nome +" Entrando no Banheiro ");
			System.out.println(nome +" fazendo coisa rápida");
			
			dorme(5000);
			
			this.eSujo = true;
			
			System.out.println(nome +" dando descarga");
			System.out.println(nome +" lavando a mão");		
			System.out.println(nome +" saindo do banheiro");
		}
	}

	void fazNumero2() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome +" Batendo na porta ");	
		synchronized (this) {

			while(eSujo) {
				esperaLaFora(nome);
			}
			
			System.out.println(nome +" Entrando no Banheiro ");
			System.out.println(nome +" fazendo coisa demorada");
			
			dorme(10000);
			
			this.eSujo = true;
			
			System.out.println(nome +" dando descarga");
			System.out.println(nome +" lavando a mão");		
			System.out.println(nome + " saindo do banheiro");
		}
	}

	private void dorme() {
		try {
			Thread.sleep(10000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void esperaLaFora(String nome) {
		System.out.println(nome +" banheiro está sujo. ");
		System.out.println(nome +" saindo do banheiro . ");
		
		try {
			this.wait();					
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void limpa() {
		String nome = Thread.currentThread().getName();
		System.out.println(nome +" Batendo na porta ");
		
		if (!this.eSujo) {
			System.out.println(nome +" Banheiro limpo");
			return;
		}
		
		synchronized (this) {
			System.out.println(nome +" Entrando no Banheiro ");
			System.out.println(nome +" Limpando no Banheiro ");
			
			dorme(15000);
			
			this.eSujo = false;
			System.out.println(nome +" Saindo do Banheiro ");
			
			this.notifyAll();

		}
	}

	private void dorme(int tempo) {
		try {
			Thread.sleep(tempo);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
