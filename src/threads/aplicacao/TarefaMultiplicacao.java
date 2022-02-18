package threads.aplicacao;

import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TarefaMultiplicacao implements Runnable{
	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;
	private JLabel resultado2;
	

	public TarefaMultiplicacao(JTextField primeiro, JTextField segundo, JLabel resultado, JLabel resultado2) {
		super();
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
		this.resultado2 = resultado2;
	}

	@Override
	public void run() {
		TelaCalculador.inc();

		long valor1 = Long.parseLong(primeiro.getText());
		long valor2 = Long.parseLong(segundo.getText());

		resultado2.setText(TelaCalculador.tot.toString());
		System.out.println(TelaCalculador.tot);
		
		
		BigInteger calculo = new BigInteger("0");
		
		for (int i = 0; i < valor1; i++) {
			for (int j = 0; j < valor2; j++) {
				calculo = calculo.add(new BigInteger("1"));
			}
		}

		resultado.setText(calculo.toString());
		
		
		
	}
	
}


