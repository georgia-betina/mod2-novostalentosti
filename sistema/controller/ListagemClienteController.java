package sistema.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class ListagemClienteController implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JComponent botaoClicado = (JComponent)e.getSource();
        switch (botaoClicado.getName()) {
            case "btnNovo":
                btnNovoClique();
            break;
            case "btnAlterar":
                btnAlterarClique();
            break;
            case "btnExcluir":
                btnExcluirClique();
            break;
            default:
            break;
        }
        JOptionPane.showMessageDialog(null, "Olá, mundo.");
    }
    

    private void btnNovoClique(){
        JOptionPane.showMessageDialog(null, "BOTAO NOVO");
    }

    private void btnAlterarClique(){
        JOptionPane.showMessageDialog(null, "BOTAO ALTERAR");
    }

    private void btnExcluirClique(){
        JOptionPane.showMessageDialog(null, "BOTAO EXCLUIR");
    }
}
