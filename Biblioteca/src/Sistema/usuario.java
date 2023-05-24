package Sistema;

import javax.swing.JOptionPane;

public class usuario {
    String nome1, nome2, nome3;
    int idade1, idade2, idade3;
    int contador = 0;

    void adicionarUsuario() {
        if (contador == 0) {
            nome1 = JOptionPane.showInputDialog("Digite o nome do primeiro usuário:");
            idade1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do primeiro usuário:"));
            contador++;
            JOptionPane.showMessageDialog(null, "Primeiro usuário adicionado com sucesso!");
        } else if (contador == 1) {
            nome2 = JOptionPane.showInputDialog("Digite o nome do segundo usuário:");
            idade2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do segundo usuário:"));
            contador++;
            JOptionPane.showMessageDialog(null, "Segundo usuário adicionado com sucesso!");
        } else if (contador == 2) {
            nome3 = JOptionPane.showInputDialog("Digite o nome do terceiro usuário:");
            idade3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do terceiro usuário:"));
            contador++;
            JOptionPane.showMessageDialog(null, "Terceiro usuário adicionado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Limite máximo de usuários atingido!");
        }
    }

    void status() {
        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Não há nenhum usuário na lista.");
        } else {
            String mensagem = "";
            mensagem += nome1 + " : " + idade1 + "\n";
            if (contador >= 2) {
                mensagem += nome2 + " : " + idade2 + "\n";
            }
            if (contador == 3) {
                mensagem += nome3 + " : " + idade3 + "\n";
            }
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}
