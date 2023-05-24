package Sistema;

import javax.swing.JOptionPane;

public class biblioteca {
    String livro1, livro2, livro3, livro4, livro5,livro6,livro7,livro8,livro9;
    String aut1,aut2,aut3,aut4,aut5,aut6,aut7,aut8,aut9;
    int pl1,pl2,pl3,pl4,pl5,pl6,pl7,pl8,pl9;
    void adicionarLivro() {
    	
        if(livro1 == null) {
        	
            livro1 = JOptionPane.showInputDialog("Digite o nome do livro:");
            pl1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de paginas do livro:"));
            aut1 = JOptionPane.showInputDialog("Digite o nome do autor do livro:");
            JOptionPane.showMessageDialog(null, "livro adicionado com sucesso!");
            
        }else if (livro2 == null) {
        	
            livro2 = JOptionPane.showInputDialog("Digite o nome do livro:");
            pl2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de paginas do livro:"));
            aut2 = JOptionPane.showInputDialog("Digite o nome do autor do livro:");

            JOptionPane.showMessageDialog(null, "livro adicionado com sucesso!");
            
        }else if (livro3 == null) {
        	
            livro3 = JOptionPane.showInputDialog("Digite o nome do livro:");
            pl3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de paginas do livro:"));
            aut3 = JOptionPane.showInputDialog("Digite o nome do autor do livro:");

            JOptionPane.showMessageDialog(null, "livro adicionado com sucesso!");
            
        }else if(livro4 == null) {
        	
        	livro4 = JOptionPane.showInputDialog("Digite o nome do livro:");
        	pl4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de paginas do livro:"));
            aut4 = JOptionPane.showInputDialog("Digite o nome do autor do livro:");

        	JOptionPane.showMessageDialog(null, "livro adicionado com sucesso!");
        	
        }else if(livro5 == null) {
        	
        	livro5 = JOptionPane.showInputDialog("Digite o nome do livro:");
        	pl5 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de paginas do livro:"));
            aut5 = JOptionPane.showInputDialog("Digite o nome do autor do livro:");

        	JOptionPane.showMessageDialog(null, "livro adicionado com sucesso!");
        	
        }else if(livro6 == null) {
        	
        	livro6 = JOptionPane.showInputDialog("Digite o nome do livro:");
        	pl6 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de paginas do livro:"));
            aut6 = JOptionPane.showInputDialog("Digite o nome do autor do livro:");

            JOptionPane.showMessageDialog(null, "livro adicionado com sucesso!");
            
        }else if(livro7 == null) {
        	
        	livro7 = JOptionPane.showInputDialog("Digite o nome do livro:");
        	pl7 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de paginas do livro:"));
            aut7 = JOptionPane.showInputDialog("Digite o nome do autor do livro:");

        	JOptionPane.showMessageDialog(null, "livro adicionado com sucesso!");
        	
        }else if(livro8 == null) {
        	
        	livro8 = JOptionPane.showInputDialog("Digite o nome do livro:");
        	pl8 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de paginas do livro:"));
            aut8 = JOptionPane.showInputDialog("Digite o nome do autor do livro:");

        	JOptionPane.showMessageDialog(null, "livro adicionado com sucesso!");
        	
        }else if(livro9 == null) {
        	
        	livro9 = JOptionPane.showInputDialog("Digite o nome do livro:");
        	pl9 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de paginas do livro:"));
            aut9 = JOptionPane.showInputDialog("Digite o nome do autor do livro:");

        	JOptionPane.showMessageDialog(null, "livro adicionado com sucesso!");
        	
        }else {
            JOptionPane.showMessageDialog(null, "Limite máximo de livros atingido!");
        }
    }

    void removerLivro() {
        String nomeLivro = JOptionPane.showInputDialog("Digite o nome do livro que deseja remover:");

        if (nomeLivro.equals(livro1)) {
            livro1 = null;
            aut1 = null;
            JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
        } else if (nomeLivro.equals(livro2)) {
            livro2 = null;
            aut2 = null;
            JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
        } else if (nomeLivro.equals(livro3)) {
            livro3 = null;
            aut3 = null;
            JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
        }
        else if (nomeLivro.equals(livro4)) {
            livro4 = null;
            aut4 = null;
            JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
        }
        else if (nomeLivro.equals(livro5)) {
            livro5 = null;
            aut5 = null;
            JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
        }
        else if (nomeLivro.equals(livro6)) {
            livro6 = null;
            aut6 = null;
            JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
        }
        else if (nomeLivro.equals(livro7)) {
            livro7 = null;
            aut7 = null;
            JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
        }
        else if (nomeLivro.equals(livro8)) {
            livro8 = null;
            aut8 = null;
            JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
        }
        else if (nomeLivro.equals(livro9)) {
            livro9 = null;
            aut9 = null;
            JOptionPane.showMessageDialog(null, "Livro removido com sucesso!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Livro não encontrado!");
        }
    }

    void exibirLivros() {
        String mensagem = "Livros na biblioteca:\n";
        if (livro1 != null) {
            mensagem += "nome:"+livro1 + "\n numero de paginas: "+pl1+"\n autor: "+aut1;
        }
        if (livro2 != null) {
            mensagem += "nome:"+livro2 + "\n numero de paginas: "+pl2+"\n autor: "+aut2;
        }
        if (livro3 != null) {
            mensagem += "nome:"+livro3 + "\n numero de paginas: "+pl3+"\n autor: "+aut3;
        }
        if (livro4 != null) {
            mensagem += "nome:"+livro4 + "\n numero de paginas: "+pl4+"\n autor: "+aut4;
        }
        if (livro5 != null) {
            mensagem += "nome:"+livro5 + "\n numero de paginas: "+pl5+"\n autor: "+aut5;
        }
        if (livro6 != null) {
            mensagem += "nome:"+livro6 + "\n numero de paginas: "+pl6+"\n autor: "+aut6;
        }
        if (livro7 != null) {
            mensagem += "nome:"+livro7 + "\n numero de paginas: "+pl7+"\n autor: "+aut7;
        }
        if (livro8 != null) {
            mensagem += "nome:"+livro8 + "\n numero de paginas: "+pl8+"\n autor: "+aut8;
        }
        if (livro9 != null) {
            mensagem += "nome:"+livro9 + "\n numero de paginas: "+pl9+"\n autor: "+aut9;
        }
           
        JOptionPane.showMessageDialog(null, mensagem);
    }


}
