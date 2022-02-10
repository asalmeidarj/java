package draw;

// Figura 7.26: DrawRainbowTest.java
// Aplicativo de teste para exibir um arco-íris.
import javax.swing.JFrame;

public class DrawRainbowTeste {
    public static void main(String[] args) {
        DrawRainbow panel = new DrawRainbow();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(400, 250);
        application.setVisible(true);
    }
} // fim da classe DrawRainbowTes