package introducao.telas;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Telinha1 extends JFrame {
    public Telinha1() {

        JMenuBar barraMenu = new JMenuBar();
        JMenu menu = new JMenu("Clica-me!!");
        JMenuItem menuItem = new JMenuItem("Arquivo");
        menu.add(menuItem);
        barraMenu.add(menu);
        setJMenuBar(barraMenu);

        //JLabel texto = new JLabel("Eu não acredito...");
        //add(texto,"North");
        JButton botao = new JButton("Me clica!!");
        add(botao,"South");
        JPanel painel = new JPanel();
        add(painel,"Center");
        painel.setBackground(Color.darkGray);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Telinha1();
    }
}
