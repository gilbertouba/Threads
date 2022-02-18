package threads.aplicacao;

public class PrincipalBanheiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banheiro banheiro = new Banheiro();
		
		Thread convidado1 = new Thread(new TarefaNumero1(banheiro),"Gilberto");
		Thread convidado2 = new Thread(new TarefaNumero2(banheiro),"Maria");
		Thread convidado3 = new Thread(new TarefaNumero1(banheiro),"Breno");
		Thread convidado4 = new Thread(new TarefaNumero2(banheiro),"Luciana");
		
		convidado1.start();
		convidado2.start();
		convidado3.start();
		convidado4.start();
		
		
		
		

	}

}
