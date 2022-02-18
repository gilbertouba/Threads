package threads.aplicacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCalculador {
	public static Double tot = 0.0;
	
	public static void main(String[] args) {
		
		
		JFrame janela = new JFrame("Multiplicação Demorada");


		JTextField primeiro = new JTextField(10);
		JTextField segundo = new JTextField(10);
		JButton botao = new JButton(" = ");
		JLabel resultado = new JLabel("           ?          ");
		JLabel resultado2 = new JLabel("x ");
		//quando clica no botão será executado a classe Multiplicador
		botao.addActionListener(new AcaoBotao(primeiro, segundo, resultado,resultado2));
		
		JPanel painel = new JPanel();
		painel.add(primeiro);
		painel.add(new JLabel("x"));
		painel.add(segundo);
		painel.add(botao);
		painel.add(resultado);
		painel.add(resultado2);
		
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.pack();
		janela.setVisible(true);
	}
	
	public static void inc() {
		tot++;
	}
}


