package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ListagemClienteController implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JButton botaoClicado = (JButton)e.getSource();
        switch (botaoClicado.getName()) {
            case "btnNovo":
            JOptionPane.showMessageDialog(null, "BOTAO NOVO");
            break;
            case "btnAlterar":
            JOptionPane.showMessageDialog(null, "BOTAO ALTERAR");
            break;
            case "btnExcluir":
            JOptionPane.showMessageDialog(null, "BOTAO EXCLUIR");
            break;
            default:
            break;
        }
        JOptionPane.showMessageDialog(null, "Olá, mundo.");
    }
    
}
