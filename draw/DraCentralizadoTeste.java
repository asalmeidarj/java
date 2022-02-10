package draw;

import javax.swing.JFrame;


public class DraCentralizadoTeste {
    
    public static void main(String[] args) {
        DrawCentralizado panel = new DrawCentralizado();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(1300, 700);
        application.setVisible(true);
    }
}
