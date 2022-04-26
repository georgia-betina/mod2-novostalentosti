package introducao.telas;

import javax.swing.JFrame;

public class Telinha1 extends JFrame {
    public Telinha1() {
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Telinha1();
    }
}
