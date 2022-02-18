
package threads.aplicacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotao implements ActionListener {

	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;
	private JLabel resultado2;

	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado,JLabel resultado2) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
		this.resultado2 = resultado2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Runnable tarefa   = new TarefaMultiplicacao(primeiro,segundo,resultado,resultado2);
		Thread threadCalc = new Thread(tarefa,"Calculadora");
		//threadCalc.setName("Caluladora "+TelaCalculador.tot.toString());
		threadCalc.start();
	}	
		
		

}