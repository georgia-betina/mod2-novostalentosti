package sistema.view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import sistema.controller.FormularioClienteController;
import sistema.entity.Cliente;
import sistema.exception.ValorInvalidoException;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FormularioCliente  extends JDialog{
    /* Painéis */
    private JPanel jpnCentro = new JPanel(new GridBagLayout()); // painel central
    GridBagConstraints c = new GridBagConstraints(); // layout em tabelas
    private JPanel jpnBotao = new JPanel(); // painel sul

    /* Marcadores */
    private JLabel codigo = new JLabel("Código: ");
    private JLabel nome = new JLabel("Nome: ");
    private JLabel cpf = new JLabel("CPF: ");
    private JLabel dataNascimento = new JLabel("Data de nascimento: ");

    /* Botões */
    private JButton btnOK = new JButton("OK");
    private JButton btnCancelar = new JButton("Cancelar");

    /* Espaçamento */
    private JTextField txtId = new JTextField(4);
    private JTextField txtNome = new JTextField(10);
    // private JTextField txtCPF = new JTextField(11);
    // private JTextField txtDataNascimento = new JTextField(8);

    /* Máscaras */
    private MaskFormatter mascaraCPF;
    private JFormattedTextField txtCPF;
    private MaskFormatter mascaraData;
    private JFormattedTextField txtDataNascimento;

    /* Chamar o Controller e Cliente */
    private FormularioClienteController controller = new FormularioClienteController(this);
    private Cliente cliente = new Cliente();

    /* GET|SET Cliente */
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /* Cria a tela */
    public FormularioCliente(Cliente cliente) {
        this.cliente = cliente;
        setSize(400,300);
        setModal(true);
        criaPaineis(); // ! importante
        setVisible(true); // ! importante
    }

    private void criaPaineis(){
        add(jpnBotao,"South");
        btnOK.addActionListener(controller);
        btnCancelar.addActionListener(controller);
        jpnBotao.add(btnOK);
        jpnBotao.add(btnCancelar);
        btnOK.setName("btnOK");
        btnCancelar.setName("btnCancelar");
        
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

        try {
            mascaraCPF = new MaskFormatter("###.###.###-##");
            txtCPF = new JFormattedTextField(mascaraCPF);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 0.5;
        c.insets = new Insets(0, 0,0,10);
        jpnCentro.add(txtCPF, c);

        try {
            mascaraData = new MaskFormatter("##/##/####");
            txtDataNascimento = new JFormattedTextField(mascaraData);
        } catch (ParseException e) {
            e.printStackTrace();
        }

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

    public Cliente atualiza(Cliente cliente) throws ValorInvalidoException {
        try {
            cliente.setId(Long.parseLong(txtId.getText()));
        } catch (NumberFormatException e) {
            throw new ValorInvalidoException("Campo código deve conter números.", e, "CÓDIGO");
        }
        cliente.setNome(txtNome.getName());
        try {
            cliente.setCpf(txtCPF.getText());
        } catch (NumberFormatException e) {
            throw new ValorInvalidoException("Campo CPF não pode ser deixado em branco.", e, "CPF");
        }
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        try {
            cliente.setDataNascimento(dataFormatada.parse(txtDataNascimento.getText()));
        } catch (ParseException e) {
            throw new ValorInvalidoException("Valor de data inválido", e, "DATA NASCIMENTO");
        }
        return cliente;
    }
}
