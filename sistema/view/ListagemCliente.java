package sistema.view;

import java.awt.Color;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ListagemCliente extends JFrame {

    /* === PAINEL === */
    private JPanel jpnCentro = new JPanel();
    private JPanel jpnSul = new JPanel();

    /* ==== BOTÃO === */
    private JButton btnNovo = new JButton("Novo");
    private JButton btnAlterar = new JButton("Alterar");
    private JButton btnExcluir = new JButton("Excluir");

    public ListagemCliente() {
        // PAINEL
        JPanel painel = new JPanel();
        add(painel,"Center");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criaPaineis(); // chama o método
        setVisible(true);
    }

    private void criaPaineis(){
        add(jpnCentro, "Center");
        add(jpnSul, "South");
        /*
        * jpnCentro.setBackground(Color.MAGENTA);
        * jpnSul.setBackground(Color.YELLOW);
        */
        jpnSul.add(btnNovo);
        jpnSul.add(btnAlterar);
        jpnSul.add(btnExcluir);
    }
}
