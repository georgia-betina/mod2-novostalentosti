package sistema.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class FormularioCliente  extends JDialog{
    private JPanel jpnCentro = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    private JPanel jpnBotao = new JPanel();

    private JLabel codigo = new JLabel("Código: ");
    private JLabel nome = new JLabel("Nome: ");
    private JLabel cpf = new JLabel("CPF: ");
    private JLabel dataNascimento = new JLabel("Data de nascimento: ");

    private JButton btnOK = new JButton("OK");
    private JButton btnCancelar = new JButton("Cancelar");
    private JTextField txtId = new JTextField(4);
    private JTextField txtNome = new JTextField(10);
    private JTextField txtCPF = new JTextField(11);
    private JTextField txtDataNascimento = new JTextField(8);
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

        add(jpnCentro, "Center");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.5;
        c.insets = new Insets(0, 10,0,0);
        jpnCentro.add(codigo, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0.5;
        c.insets = new Insets(0, 0,0,10);
        jpnCentro.add(txtId, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0.5;
        c.insets = new Insets(0, 10,0,0);
        jpnCentro.add(nome, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0.5;
        c.insets = new Insets(0, 0,0,10);
        jpnCentro.add(txtNome, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0.5;
        c.insets = new Insets(0, 10,0,0);
        jpnCentro.add(cpf, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 0.5;
        c.insets = new Insets(0, 0,0,10);
        jpnCentro.add(txtCPF, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        c.weightx = 0.5;
        c.insets = new Insets(0, 10,0,0);
        jpnCentro.add(dataNascimento, c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 3;
        c.weightx = 0.5;
        c.insets = new Insets(0, 0,0,10);
        jpnCentro.add(txtDataNascimento, c);
    }
}
