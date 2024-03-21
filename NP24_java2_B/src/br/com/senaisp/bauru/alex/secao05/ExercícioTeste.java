package br.com.senaisp.bauru.alex.secao05;

import javax.swing.JOptionPane;

public class ExercícioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// Para sim ou Não 
		boolean resp = JOptionPane.showConfirmDialog(null,"Você quer participar",
				"Quer mesmo participar",JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION;
				
				
	// Para entrada de texto com valor 
				String msg01 = (String)JOptionPane.showInputDialog(null,
						"Podemos começar?",
						"Titular da caixa de diálogo", JOptionPane.INFORMATION_MESSAGE,
						null,
						null,
						"Digite sim ou não");
		// pergunta sobre nome :
				String nome = JOptionPane.showInputDialog("Digite seu nome:");
				JOptionPane.showMessageDialog(null, "Olá "+ nome);
	   // idade 


	// estado 
				String idade = JOptionPane.showInputDialog("Qual seu estado:");
				
	}

}
