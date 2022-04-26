package introducao.telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Telinha1 extends JFrame {
    public Telinha1() {

        JLabel texto = new JLabel("Eu não acredito...");
        add(texto);
        JButton botao = new JButton("Me clica!!");
        add(botao);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Telinha1();
    }
}
