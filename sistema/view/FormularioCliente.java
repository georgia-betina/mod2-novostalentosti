package sistema.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FormularioCliente  extends JDialog{
    private JPanel jpnCentro = new JPanel();
    private JPanel jpnBotao = new JPanel();
    private JButton btnOK = new JButton("OK");
    private JButton btnCancelar = new JButton("Cancelar");
    public FormularioCliente() {
        setSize(400,300);
        setModal(true);
        criaPaineis();
        setVisible(true);
    }

    private void criaPaineis(){
        add(jpnBotao,"South");
        jpnBotao.add(btnOK);
        jpnBotao.add(btnCancelar);
    }
}
