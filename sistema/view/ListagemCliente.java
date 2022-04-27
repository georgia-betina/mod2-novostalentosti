package sistema.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ListagemCliente extends JFrame {
    public ListagemCliente() {
        JPanel painel = new JPanel();
        add(painel,"Center");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ListagemCliente();
    }
}
