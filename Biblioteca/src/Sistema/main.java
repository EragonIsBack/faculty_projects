package Sistema;

import javax.swing.JOptionPane;

public class main {

	
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		biblioteca b1 = new biblioteca();
		livro l1 = new livro();
		usuario u1 = new usuario();
		
		do {
		a =JOptionPane.showOptionDialog(null,
				"o que desja fazer?",
				null,
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				null,
			new Object [] {"adicionar usuario","ver livros","adicionar livro","remover livro","ver usuários","mensagem ao professor","encerrar"},
				null);
		if(a == 0) {
			u1.adicionarUsuario();			
		}
		else if(a == 1) {
			b1.exibirLivros();
		}
		else if(a == 2) {
			b1.adicionarLivro();
		}
		else if(a == 3) {
			b1.removerLivro();
		}
		else if(a == 4) {
			u1.status();
		}
		else if(a == 5) {
			JOptionPane.showMessageDialog(null, "Caro professor, queria apenas dizer que não consegui implementar o sistema de emprestimo de cada usuário, e que infelizmente tive dificuldades desenvolvendo esse programa e por isso precisei usar a ajuda do famoso ChatGPT. \n Ah, também coloquei o número máximo de usuários pra 3. \n Eu vou entender completamente se o senhor resolver reduzir minha nota nessa atividade \n abraço :).");
		}
		
	}while(a != 6 && a != -1);
}
}