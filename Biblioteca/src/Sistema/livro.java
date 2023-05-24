package Sistema;

import javax.swing.JOptionPane;

public class livro {
	String [] livros;
	String titulo,a,b;
	String autor;
	int numpag,c;	
	void status() {
		JOptionPane.showInternalMessageDialog(null, "livros: \n "+livros);
	}
	String defAutor(){
		a = JOptionPane.showInputDialog("qual o nome do autor? \n");
		return autor;
	}
	
	String deftitulo() {	
		b = JOptionPane.showInputDialog("qual o título do livro? \n");
		return titulo;
	}
	
	int defnumpag() {
		c = Integer.parseInt(JOptionPane.showInputDialog("qual o numero de páginas do livro? \n"));
		return numpag;
	}
}
