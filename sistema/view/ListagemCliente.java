package sistema.view;

//import java.awt.Color;
import java.awt.FlowLayout;

//import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import sistema.controller.ListagemClienteController;
import sistema.model.TabelaClienteModel;

public class ListagemCliente extends JFrame {

    /* === PAINEL === */
    private JScrollPane jpnCentro;
    private JPanel jpnSul = new JPanel();

    /* ==== BOTÃO === */
    private JButton btnNovo = new JButton("Novo");
    private JButton btnAlterar = new JButton("Alterar");
    private JButton btnExcluir = new JButton("Excluir");

    /* === TABELA === */
    private TabelaClienteModel tabelaModel = new TabelaClienteModel();
    private JTable tabela = new JTable(tabelaModel);

    /* === CONTROLADOR DA TELA === */
    private ListagemClienteController controller = new ListagemClienteController();

    public ListagemCliente() {
        // PAINEL
        JPanel painel = new JPanel();
        add(painel,"Center");
        setSize(500,400);
        setTitle("Listagem de Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        criaPaineis(); // chama o método
        setVisible(true);
    }

    private void criaPaineis(){
        jpnSul.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        add(jpnSul, "South");
        /*
        * jpnCentro.setBackground(Color.MAGENTA);
        * jpnSul.setBackground(Color.YELLOW);
        */
        jpnSul.add(btnNovo);
        jpnSul.add(btnAlterar);
        jpnSul.add(btnExcluir);
        
        btnNovo.addActionListener(controller);
        btnNovo.setName("btnNovo");
        btnAlterar.addActionListener(controller);
        btnAlterar.setName("btnAlterar");
        btnExcluir.addActionListener(controller);
        btnExcluir.setName("btnExcluir");

        jpnCentro = new JScrollPane(tabela);
        jpnCentro.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jpnCentro.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        add(jpnCentro, "Center");
    }
}
