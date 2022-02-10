package draw;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class DrawCentralizado extends JPanel{
    // define as cores índigo e violeta
    private final static Color VIOLET = new Color(128, 0, 128);
    private final static Color INDIGO = new Color(75, 0, 130);

    // array de cores
    private Color[] colors = { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
            Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };

    // construtor
    public DrawCentralizado(){
        setBackground(colors[0]);
    }

    public void paintComponent(Graphics g) {

        //definir coordenadas do centro da janela
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
     
        //Definir tamanho do retângulo em função da janela,
        double temp = getWidth() < getHeight() ? getWidth() * 0.8 : getHeight() * 0.8;
        int tamanho = (int) temp; // converte valor double em váriável auxiliar para inteiro.

        //Posicionar centro do retângulo ao centro da janela.
        int posRX = (int) (centerX - tamanho / 2);
        int posRY = (int) (centerY - tamanho / 2);

        g.drawRect(posRX, posRY, tamanho, tamanho);
        // retangulosConcentricos(g, centerX, centerY, tamanho);
        tunel(g, centerX, centerY, tamanho);
    }

    public void retangulosConcentricos(Graphics g, int centerX, int centerY, int tamanho) {
        int num = 30;
        for(int i = 0; i < num; i++){

            tamanho = (int) (tamanho - tamanho * 0.1);

            //Posicionar centro do retângulo ao centro da janela.
            int posRX = (int) (centerX - tamanho / 2);
            int posRY = (int) (centerY - tamanho / 2);

            g.drawRect(posRX, posRY, tamanho, tamanho);
        }
    }

    public void tunel(Graphics g, int centerX, int centerY, int tamanho){

        int range = 200;

        int num = 30;
        for(int i = 0; i < num; i++){

            // Criando  cores para efeito de profundidade
            range = (int) (range - range * 0.05);
            Color color = new Color(range, range, range);
            
            if(i != 0)
                tamanho = (int) (tamanho - tamanho * 0.4);

            //Posicionar centro do retângulo ao centro da janela.
            int posRX = (int) (centerX - tamanho / 2);
            int posRY = (int) (centerY - tamanho / 2);

            g.setColor(color);
            g.fillRect(posRX, posRY, tamanho, tamanho);
        }
    }

}
